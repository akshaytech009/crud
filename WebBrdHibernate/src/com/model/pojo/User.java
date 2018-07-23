package com.model.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserTable18060170")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userid;
	private String username;
	private String userpass;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private ProfileUser profile;

	public User(String username, String userpass) {
		super();
		
		this.username = username;
		this.userpass = userpass;
		
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	
	public User() {
		
	}
	
	/*public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	
	 public User() {
		
	}
	public User(String username, String userpass, String roleid) {
		super();
		
		this.username = username;
		this.userpass = userpass;
		this.roleid = roleid;
	}
	*/

}
