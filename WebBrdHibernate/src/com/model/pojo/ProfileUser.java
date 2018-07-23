package com.model.pojo;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;


	@Entity
	@Table(name="Profile18060170")
	public class ProfileUser {	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int userId;
		
		@Column(name="Profile")
		private String profile;
		
		@JoinColumn(name="user_Id_fk")
		@OneToOne
		private User user;
		public ProfileUser( String profile) {
			super();
			
			this.profile = profile;
		}
		public ProfileUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getProfile() {
			return profile;
		}
		public void setProfile(String profile) {
			this.profile = profile;
		}
		public void setUser(User user) {
			this.user = user;
		}

		

		public User getUser() {
			return user;
		}

	}



