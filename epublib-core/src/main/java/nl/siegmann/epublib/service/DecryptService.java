package nl.siegmann.epublib.service;

import java.io.InputStream;
import java.io.Reader;
import java.security.InvalidKeyException;

import nl.siegmann.epublib.domain.Resource;



public interface DecryptService {
		
	public byte[] decrypt(byte[] data) throws InvalidKeyException;
	
	public byte[] decrypt(InputStream stream) throws InvalidKeyException;
	
	public byte[] decrypt(Reader reader) throws InvalidKeyException;
	
	public Resource decrypt(Resource resource) throws InvalidKeyException;
	
}
