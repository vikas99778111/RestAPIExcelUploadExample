package com.vkt.group.ess.api.utils;

public interface Constants {

	String SERVER_ERROR = "Found technical problem. Please contact system admin";
	String RECORD_NOT_FOUND = "Record Not Found";
	String VALIDATION_FAIL = "Validation Failed";
	String UNAUTHORIZED = "Unauthorized: Access is denied due to invalid credentials.";
	String CONFLICT = "An attempt was made to create an object that already exists";

	String FILE_MUST_NOT_BE_EMPTY = "File must not be empty, please try again";
	String FORWARD_SLASH = "/";
	CharSequence JSON = ".json";
	CharSequence TXT = ".txt";
	String STS = ".sts";
	String DOT = ".";
	String BACKUP_PATH = "essDocs.dir.backup.path";
	String STATUS_PATH = "essDocs.dir.status.path";
	String READ_PATH = "essDocs.dir.read.path";
	String SUCCEEDED = "succeeded";
	String NO_FILES = "No files inside folder. Kindly contact admin";
	String CARGO_API_NOT_REACHABLE = "Not able to get token, Please check the Cargo API is Up and running and credentials are correct!";
	String PARTIALLY_COMPLETED = "Partially completed, in between process interrupted";
	String UPDATE_REF_NUMBER = "Please use the new Ref number for Submiting the request successfully";
}
