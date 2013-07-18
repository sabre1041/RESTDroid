package com.andyserver.android.restdroid.exceptions;

import com.andyserver.android.restdroid.core.RestService;

import android.util.Log;

public class WebServiceNotInitializedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3189957130125110077L;

	public WebServiceNotInitializedException() {
		super();
		Log.e(RestService.TAG, "Web service not initialized");
	}

}
