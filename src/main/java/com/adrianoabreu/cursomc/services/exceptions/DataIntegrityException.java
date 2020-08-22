package com.adrianoabreu.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityException(String msg) {
		super(msg);
		System.out.println("passou 8");
	}

	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
		System.out.println("passou 9");
	}

}