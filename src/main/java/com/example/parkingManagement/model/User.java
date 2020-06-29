package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 17:02
 */
public class User {
	private long userId = -1;
	private String userRole = null;
	private String userNickname = null;
	private String userName = null;
	private String userPassword = null;
	private long userPhone = -1;

	public User(){
		super();
	}
	public User mixinData(User user){
		if(user.userId != -1){
			this.userId = user.userId;
		}
		if(user.userRole != null)
		{
			this.userRole = user.userRole;;
		}
		if(user.userNickname != null)
		{
			this.userNickname = user.userNickname;;
		}
		if(user.userName != null)
		{
			this.userName = user.userName;;
		}
		if(user.userPassword != null)
		{
			this.userPassword = user.userPassword;;
		}
		if(user.userPhone != -1){
			this.userPhone = user.userPhone;
		}
		return this;
	}
	public long getUserId () {
		return userId;
	}

	public void setUserId (long userId) {
		this.userId = userId;
	}

	public String getUserRole () {
		return userRole;
	}

	public void setUserRole (String userRole) {
		this.userRole = userRole;
	}

	public String getUserNickname () {
		return userNickname;
	}

	public void setUserNickname (String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserName () {
		return userName;
	}

	public void setUserName (String userName) {
		this.userName = userName;
	}

	public String getUserPassword () {
		return userPassword;
	}

	public void setUserPassword (String userPassword) {
		this.userPassword = userPassword;
	}

	public long getUserPhone () {
		return userPhone;
	}

	public void setUserPhone (long userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString () {
		return "User{" +
				"userId=" + userId +
				", userRole='" + userRole + '\'' +
				", userNickname='" + userNickname + '\'' +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				", userPhone=" + userPhone +
				'}';
	}
}
