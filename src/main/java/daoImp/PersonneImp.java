package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.main.model.Personne;
import dao.IPersonne;
@Service
public class PersonneImp {
	
	@Autowired
	private Personne person;
	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create() {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO personne " +
				"(nom, prenom) VALUES (?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, this.person.getNom());
			ps.setString(2, this.person.getPrenom());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
		} 
	}

	public Personne getPerson() {
		return person;
	}

	public void setPerson(Personne person) {
		this.person = person;
	}

	
	

	

}
