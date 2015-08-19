package br.ufc.great.cks.exception;

public class CKSBuildException extends Exception {

	private static final long serialVersionUID = 1L;

	public CKSBuildException() {
		super();
	}

	public CKSBuildException(String message) {
		super(message);
	}

	public CKSBuildException(String message, Throwable cause) {
		super(message, cause);
	}

	public CKSBuildException(Throwable cause) {
		super(cause);
	}
}
