package de.tse.gwTracker.application.model.main.exceptions;

public class APIException extends Exception {

	private static final long serialVersionUID = -1262564421878245106L;
	
	public APIException(String string) {
		super(string);
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return null;
	}	
}
