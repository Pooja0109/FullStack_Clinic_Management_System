package com.CMS.exception;

public class PatientAlreadyExistException extends Exception {
	private String message;
    public PatientAlreadyExistException(String message) {
        super(message);
        this.message = message;
    }
    public PatientAlreadyExistException() {
    	super("ERR :Patient Details Already Exist...!");
    }
}
