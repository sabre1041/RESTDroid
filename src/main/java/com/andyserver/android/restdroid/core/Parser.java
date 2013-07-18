package com.andyserver.android.restdroid.core;

import java.io.InputStream;

import com.andyserver.android.restdroid.exceptions.ParsingException;


/**
 * <b>Interface which represents Parser</b>
 * 
 * @author Pierre Criulanscy
 *
 * @param <T>
 * 		The Class object of {@link ResourceRepresentation} which is parsed with this parser
 * 
 * @version 0.5
 */
public interface Parser<T extends Resource> {

	/**
	 * Use this method to return parsed {@link ResourceRepresentation} from InputStream
	 * 
	 * @param content
	 * 		The InputStream representing {@link ResourceRepresentation}
	 * 
	 * @return
	 * 		Parsed {@link ResourceRepresentation}
	 * 
	 * @throws ParsingException
	 */
	public T parseToObject(InputStream content) throws ParsingException;

	/**
	 * Use this method to return InputStream parsed from {@link ResourceRepresentation}
	 * 
	 * @param resource
	 * 		The {@link ResourceRepresentation} which will be parsed to InputStream
	 * 
	 * @return
	 * 		InputStream representing the {@link ResourceRepresentation}
	 * 
	 * @throws ParsingException
	 */
	public InputStream parseToInputStream(T resource) throws ParsingException;
	
}
