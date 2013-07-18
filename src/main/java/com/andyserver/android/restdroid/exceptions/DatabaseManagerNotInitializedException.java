package com.andyserver.android.restdroid.exceptions;

import com.andyserver.android.restdroid.core.RestService;

import android.util.Log;

public class DatabaseManagerNotInitializedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3189957130125110077L;

	public DatabaseManagerNotInitializedException() {
		super();
		Log.e(RestService.TAG, "DatabaseManager not initialized");
	}

}
