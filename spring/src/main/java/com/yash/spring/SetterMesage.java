package com.yash.spring;

public class SetterMesage {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SetterMesage [message=" + message + "]";
	}
	
	
}
