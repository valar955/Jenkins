package com.jenkinss;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class readXML {

	private String role1 = null;
	private String role2 = null;
	private String role3 = null;
	private String  role4 =null;
	//String xml="C:\\Users\\ELCOT\\git\\Jenkins\\com.jenkins.try\\src\\test\\resources\\new.xml";
	private ArrayList<String> arraylistdo;	
	@Test
	public boolean readXML1() {
		arraylistdo = new ArrayList<String>();
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse("C:\\Users\\ELCOT\\git\\Jenkins\\com.jenkins.try\\src\\test\\resources\\new.xml");

            Element doc = dom.getDocumentElement();

            role1 = getTextValue(role1, doc, "role1");
            if (role1 != null) {
                if (!role1.isEmpty())
                	arraylistdo.add(role1);
            }
            role2 = getTextValue(role2, doc, "role2");
            if (role2 != null) {
                if (!role2.isEmpty())
                	arraylistdo.add(role2);
            }
            role3 = getTextValue(role3, doc, "role3");
            if (role3 != null) {
                if (!role3.isEmpty())
                	arraylistdo.add(role3);
            }
            role4 = getTextValue(role4, doc, "role4");
            if ( role4 != null) {
                if (!role4.isEmpty())
                	arraylistdo.add(role4);
            }
            return true;

        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        return false;
    }
	
	public void saveToXML() {
	    Document dom;
	    Element e = null;

	  
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    try {
	        
	        DocumentBuilder db = dbf.newDocumentBuilder();
	       
	        dom = db.newDocument();

	        
	        Element rootEle = dom.createElement("roles");

	        
	        e = dom.createElement("role1");
	        e.appendChild(dom.createTextNode(role1));
	        rootEle.appendChild(e);

	        e = dom.createElement("role2");
	        e.appendChild(dom.createTextNode(role2));
	        rootEle.appendChild(e);

	        e = dom.createElement("role3");
	        e.appendChild(dom.createTextNode(role3));
	        rootEle.appendChild(e);

	        e = dom.createElement("role4");
	        e.appendChild(dom.createTextNode(role4));
	        rootEle.appendChild(e);

	        dom.appendChild(rootEle);

	        try {
	            Transformer tr = TransformerFactory.newInstance().newTransformer();
	            tr.setOutputProperty(OutputKeys.INDENT, "yes");
	            tr.setOutputProperty(OutputKeys.METHOD, "xml");
	            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

	            // send DOM to file
	            tr.transform(new DOMSource(dom), 
	                                 new StreamResult(new FileOutputStream("C:\\Users\\ELCOT\\git\\Jenkins\\com.jenkins.try\\src\\test\\resources\\demo.xml")));

	        } catch (TransformerException te) {
	            System.out.println(te.getMessage());
	        } catch (IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
	    } catch (ParserConfigurationException pce) {
	        System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
	    }
	}


	
	
     private String getTextValue(String def, Element doc, String tag) {
    	    String value = def;
    	    NodeList nl;
    	    nl = doc.getElementsByTagName(tag);
    	    if (nl.getLength() > 0 && nl.item(0).hasChildNodes()) {
    	        value = nl.item(0).getFirstChild().getNodeValue();
    	    }
    	    return value;
    	}

	 
}