package com.berkOs.Hafta07.Gun2;

public class EksiDegerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private	String message;

	public EksiDegerException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
