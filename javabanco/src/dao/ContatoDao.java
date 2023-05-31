package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancojava.ConnectionFactory;
import modelo.Contato;

public class ContatoDao {
	
	private Connection con;
	
	public ContatoDao() throws SQLException  {
		this.con = ConnectionFactory.getConnection();
	}
	
	public void adiciona(Contato contato) throws SQLException {
		String sql = ("INSERT INTO contatos (nome,email,endereco) values(?,?,?)");
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1,contato.getNome());
		stmt.setString(2,contato.getEmail());
		stmt.setString(3,contato.getEndereco());
		stmt.execute();
		stmt.close();
		con.close();		
	}
	
	public List <Contato> getListaLetra(String letra) throws SQLException {
		String sql = ("SELECT * from contatos where contatos.nome like ? ");
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1,letra+'%');
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();
		
		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		rset.close();
		stmt.close();
		return contatos;
		
	}
	
	public void deleta(Long id) throws SQLException {
		String sql = ("DELETE FROM contatos  where contatos.id= ?");
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
		con.close();		
	}
	
	
	
	public List <Contato> getLista() throws SQLException {
		String sql = ("SELECT * from contatos");
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();
		
		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		rset.close();
		stmt.close();
		return contatos;
		
		
	}
	
	public List <Contato> getContatoId(Long id) throws SQLException {
		String sql = ("SELECT * from contatos where contatos.id = ?");
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1,id);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();
		
		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		rset.close();
		stmt.close();
		return contatos;
		
		
	}

	
}
