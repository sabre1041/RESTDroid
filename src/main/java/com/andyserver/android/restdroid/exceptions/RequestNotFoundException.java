package com.andyserver.android.restdroid.exceptions;

import java.util.UUID;

import com.andyserver.android.restdroid.core.RestService;

import android.util.Log;

public class RequestNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9174300205456940485L;

	public RequestNotFoundException(UUID requestID) {
		Log.e(RestService.TAG, "Request with id " + requestID + "not found");
	}
	
}
