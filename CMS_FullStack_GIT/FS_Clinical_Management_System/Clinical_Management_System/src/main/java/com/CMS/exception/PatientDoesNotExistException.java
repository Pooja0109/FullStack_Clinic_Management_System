package com.CMS.exception;

public class PatientDoesNotExistException extends Exception{
	private String message;
    public PatientDoesNotExistException(String message) {
        super(message);
        this.message = message;
    }
    public PatientDoesNotExistException() {
    	super("ERR :Patient Details Already Exist...!");
    }
}
