package com.example.database.model;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "email")
	private String email;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "confpass")
	private String confpass;
	
	@Column(name = "registered")
	private boolean registered;
	
	public User() {
	
	}
	
	
	public User (String fname, String lname, String email, String pass, String confpass, boolean registered) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.confpass = confpass;
		this.registered = registered;

		
}

	public long getId() {
		return id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getConfpass() {
		return confpass;
	}
	
	public void setConfpass(String confpass) {
		this.confpass = confpass;
	}
	
	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean isRegistered) {
		this.registered = isRegistered;
	}
	
	@Override
	public String toString() {
		return "Data inserted"
	
}
