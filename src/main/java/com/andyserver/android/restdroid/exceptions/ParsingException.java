package com.andyserver.android.restdroid.exceptions;

import com.andyserver.android.restdroid.core.RestService;

import android.util.Log;

public class ParsingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7301793342104343843L;

	public ParsingException(int resultCode) {
		Log.e(RestService.TAG, "Parsing exception with code " + String.valueOf(resultCode));
	}
	
}
