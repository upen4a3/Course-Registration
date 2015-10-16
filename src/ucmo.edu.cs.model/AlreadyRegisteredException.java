package edu.ucmo.cs.course.registration.model;

public class AlreadyRegisteredException extends Exception {

	private static final long serialVersionUID = 1L;

	public AlreadyRegisteredException() {
		super();
	}

	public AlreadyRegisteredException(String message) {
		super(message);
	}

	public AlreadyRegisteredException(Throwable cause) {
		super(cause);
	}

	public AlreadyRegisteredException(String message, Throwable cause) {
		super(message, cause);
	}

}
