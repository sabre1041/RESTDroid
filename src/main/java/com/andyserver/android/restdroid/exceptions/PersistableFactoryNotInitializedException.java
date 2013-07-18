package com.andyserver.android.restdroid.exceptions;

import com.andyserver.android.restdroid.core.RestService;

import android.util.Log;

public class PersistableFactoryNotInitializedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -828011978093234679L;

	public PersistableFactoryNotInitializedException() {
		super();
		Log.e(RestService.TAG, "DaoFactory not initialized");
	}
}
