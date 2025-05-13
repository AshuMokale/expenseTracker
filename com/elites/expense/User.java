package com.elites.expense;

public class User {
	private int id;
	private String userName;
	private String fullName;
	private String password;
	private int pin;

	public User(){
		super();
	}

	public User(int id, String userName, String fullName, String password, int pin) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.password = password;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Id:- " + this.id + "\nName:- " + this.fullName + "\nUsername:- " + this.userName + "\n";
	}

	public int getPin(String password) {
		if (password.equalsTo(this.password))
			return this.pin;
		else
			return 0;
	}
}