package com.mycompany.hr.ws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mycompany.hr.service.HelloService;

@Endpoint
public class HelloEndpoint {
	private static final String NAMESPACE_URI = "http://www.example.org/Hello";

    private XPathExpression<Element> msgExpression;

    private XPathExpression<Element> dateExpression;

    private XPathExpression<Element> fromExpression;

    private HelloService helloService;
    
    @Autowired
    public HelloEndpoint(HelloService helloService) throws JDOMException {
        this.helloService = helloService;

        Namespace namespace = Namespace.getNamespace("tns", NAMESPACE_URI);
        XPathFactory xPathFactory = XPathFactory.instance();
        msgExpression = xPathFactory.compile("//tns:Msg", Filters.element(), null, namespace);
        dateExpression = xPathFactory.compile("//tns:Date", Filters.element(), null, namespace);
        fromExpression = xPathFactory.compile("//tns:From", Filters.element(), null, namespace);
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HelloRequest")         
    //@ResponsePayload
    public void handleHolidayRequest(@RequestPayload Element helloRequest) throws Exception {  
    	String msg = msgExpression.evaluateFirst(helloRequest).getText();
        Date date = parseDate(dateExpression, helloRequest);
        String from = fromExpression.evaluateFirst(helloRequest).getText();
        String data = msg + ":" +  from + ":" + date.toString();
        System.out.println(data);
        
        //return helloService.sayHello(data);
        
    }

    private Date parseDate(XPathExpression<Element> expression, Element element) throws ParseException {
        Element result = expression.evaluateFirst(element);
        if (result != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(result.getText());
        } else {
            throw new IllegalArgumentException("Could not evaluate [" + expression + "] on [" + element + "]");
        }
    }
}
