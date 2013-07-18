package com.andyserver.android.restdroid.exceptions;

import com.andyserver.android.restdroid.core.RestService;

import android.util.Log;

public class RESTDroidNotInitializedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2360362049434847399L;

	public RESTDroidNotInitializedException() {
		Log.e(RestService.TAG, "RESTDroid is not initialized");
	}
	
}
