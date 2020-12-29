package com.app.ws.ui.model.response;

public enum ApiErrorMessages {
	
	MISSING_REQUIRED_FIELD("Missing required field. Please chech documentation for requiered fields."),
	RECORD_ALREADY_EXISTS("Record already exists."),
	INTERNAL_SERVER_ERROR("Internal server error."),
	NO_RECORD_FOUND("Record with provided ID is not found."),
	AUTHENTICATION_FAILED("Authentication failed."),
	COULD_NOT_UPDATE_RECORD("Could not update record."),
	COULD_NOT_DELETE_RECORD("Could not delete record."),
	EMAIL_ADDRESSS_NOT_VERIFIED("Email address could not be verified.");

	private String errorMessage;
	
	ApiErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
