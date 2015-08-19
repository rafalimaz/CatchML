package org.xtext.example.mydsl.ui.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.scxml.io.SCXMLParser;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SCXMLManager{
	private final static String BUNDLE_NAME = "org.xtext.example.mydsl.ui";
	private final static String SCXMLEDITOR_LOCATION = "scxml/scxml-editor.jar";
	private final static String SCXMLHELLO_LOCATION = "scxml/hello.scxml";
	
	private SCXML scxml;
	
	public static void main(String[] args){
		textSCXML();
	}
	
	public static void openEditor(URI uri){
		try{
			SCXMLManager manager = new SCXMLManager();
			manager.parseSCXML(uri);
			manager.executeSCXMLEditor(manager.getScxml(), uri);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void textSCXML(){
		try{
			SCXMLManager manager = new SCXMLManager();
			manager.parseSCXML("./scxml/hello.scxml");
			manager.executeSCXMLEditor(manager.getScxml(), "hello.scxml");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void textSCXMLFromBundle(){
		try{
			SCXMLManager manager = new SCXMLManager();
			manager.parseSCXMLfromBundle(BUNDLE_NAME, SCXMLHELLO_LOCATION);
			manager.executeSCXMLEditorFromBundle(manager.getScxml());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void parseSCXML(String fileName){
	    try {
	    	URL url = new URL(new URL("file:"), fileName);
			scxml = SCXMLParser.parse(url, new SCXMLErrorHandler(), null);
		} catch (IOException | SAXException | ModelException e) {
			e.printStackTrace();
		}
	}
	
	public void parseSCXML(URI uri){
	    try {
	    	URL url = new URL(new URL("platform:"), uri.path());
			scxml = SCXMLParser.parse(url, new SCXMLErrorHandler(), null);
		} catch (IOException | SAXException | ModelException e) {
			e.printStackTrace();
		}
	}
	
	public SCXML parseSCXMLfromBundle(String bundleName, String entryName){
		File file = null;
		Bundle bundle = Platform.getBundle(bundleName);
		URL fileURL = bundle.getEntry(entryName);
		
	    try {
			file = new File(FileLocator.resolve(fileURL).toURI());
			System.out.println(file.getAbsolutePath());
			scxml = SCXMLParser.parse(fileURL, new SCXMLErrorHandler(), null);
		} catch (URISyntaxException | IOException | SAXException | ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return scxml;
	}
	
	public void executeSCXMLEditor(SCXML scxml, String fileName){
		if (scxml == null) {
	    	System.err.println("Failed parsing SCXML file.");
	    } else {
			try {
				Runtime.getRuntime().exec("java -jar scxml/scxml-editor.jar -i scxml/" + fileName).waitFor();
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}	
	    }
	}
	
	public void executeSCXMLEditor(SCXML scxml, URI fileURI){
		if (scxml == null) {			
	    	System.err.println("Failed parsing SCXML file.");
	    } else {
	    	File file = null;
	    	URL url = null;
			String editorPath = null, filePath;
			
			try {
				Bundle bundle = Platform.getBundle(BUNDLE_NAME);				
				url = bundle.getEntry(SCXMLEDITOR_LOCATION);
				file = new File(FileLocator.resolve(url).toURI());
				editorPath = file.getAbsolutePath();
				
				url = new URL(new URL("platform:"), fileURI.path());
				URL fileURL = FileLocator.toFileURL(url);
						
				filePath = fileURL.getPath();				
				Runtime.getRuntime().exec("java -jar " + editorPath + " -i " + filePath);
			} catch (URISyntaxException | IOException e) {
				e.printStackTrace();
			}	
	    }
	}
	
	
	public void executeSCXMLEditorFromBundle(SCXML scxml){
		if (scxml == null) {
	    	System.err.println("Failed parsing SCXML file.");
	    } else {
	    	File file = null;
			String helloURL = null, editorURL = null;
			try {
				Bundle bundle = Platform.getBundle(BUNDLE_NAME);
				URL fileURL = bundle.getEntry(SCXMLHELLO_LOCATION);
				file = new File(FileLocator.resolve(fileURL).toURI());
				helloURL = file.getAbsolutePath();
				fileURL = bundle.getEntry(SCXMLEDITOR_LOCATION);
				file = new File(FileLocator.resolve(fileURL).toURI());
				editorURL = file.getAbsolutePath();
				Runtime.getRuntime().exec("java -jar " + editorURL + " -i " + helloURL);
			} catch (URISyntaxException | IOException e) {
				e.printStackTrace();
			}	
	    }
	}

	public SCXML getScxml() {
		return scxml;
	}

	public void setScxml(SCXML scxml) {
		this.scxml = scxml;
	}
}

class SCXMLErrorHandler implements ErrorHandler{

	@Override
	public void error(SAXParseException exception) throws SAXException {
		System.err.println("Error: " + exception.getMessage());
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		System.err.println("Fatal error: " + exception.getMessage());
	}

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		System.err.println("Warning: " + exception.getMessage());
	}
}
