package com.home.maxwell.codeview;

import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Source;

import org.springframework.ws.stream.StreamingPayload;
import org.springframework.ws.stream.StreamingWebServiceMessage;

public class MyStreamingWebServiceMessage implements StreamingWebServiceMessage{

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

	public void setStreamingPayload(StreamingPayload arg0) {
		// TODO Auto-generated method stub
		
	}

}
