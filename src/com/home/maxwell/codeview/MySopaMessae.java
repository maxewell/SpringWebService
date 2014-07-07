package com.home.maxwell.codeview;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.activation.DataHandler;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

import org.springframework.core.io.InputStreamSource;
import org.springframework.ws.mime.Attachment;
import org.springframework.ws.mime.AttachmentException;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapBodyException;
import org.springframework.ws.soap.SoapEnvelope;
import org.springframework.ws.soap.SoapEnvelopeException;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderException;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.SoapVersion;
import org.w3c.dom.Document;

public class MySopaMessae implements SoapMessage {

	public Attachment addAttachment(String arg0, File arg1)
			throws AttachmentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Attachment addAttachment(String arg0, DataHandler arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Attachment addAttachment(String arg0, InputStreamSource arg1,
			String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean convertToXopPackage() {
		// TODO Auto-generated method stub
		return false;
	}

	public Attachment getAttachment(String arg0) throws AttachmentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<Attachment> getAttachments() throws AttachmentException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isXopPackage() {
		// TODO Auto-generated method stub
		return false;
	}

	public Result getPayloadResult() {
		// TODO Auto-generated method stub
		return null;
	}

	public Source getPayloadSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public void writeTo(OutputStream arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

	public String getFaultReason() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasFault() {
		// TODO Auto-generated method stub
		return false;
	}

	public Document getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	public SoapEnvelope getEnvelope() throws SoapEnvelopeException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSoapAction() {
		// TODO Auto-generated method stub
		return null;
	}

	public SoapBody getSoapBody() throws SoapBodyException {
		// TODO Auto-generated method stub
		return null;
	}

	public SoapHeader getSoapHeader() throws SoapHeaderException {
		// TODO Auto-generated method stub
		return null;
	}

	public SoapVersion getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDocument(Document arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSoapAction(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
