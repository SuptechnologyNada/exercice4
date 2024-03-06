package Classe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connexion {
	private Connection connexion;

public Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}
public Connection createConnection(String server,String db, String user, String password) {
	String url = "jdbc:mysql://"+server+":3306/"+db;
	this.connexion = DriverManager.getConnection(url, user, password);
	return this.connexion;
}
public List<Etudiant> getAllEtudiant() throws SQLException{
	Statement statement = connexion.createStatement();
	ResultSet resultat = statement.executeQuery("SELECT * FROM SUPTECH"); 
	
}
}