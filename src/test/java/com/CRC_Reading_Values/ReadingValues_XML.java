package com.CRC_Reading_Values;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.CRC_Helper.AbstractClass;

public class ReadingValues_XML
{
	public static  Element eElement,URL;
	public static  NodeList nodeList;
	public static  Node node;
		
 
	   public static void XML() throws ParserConfigurationException, SAXException, IOException {
	
         File file = new File("C:\\Users\\pmaniratnam\\eclipse-workspace\\CRC_IMPORTING_ALLREPORTS\\InputValues.xml");
		  
	    //an instance of factory that gives a document builder  
	     
	     DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	     
	    //an instance of builder to parse the specified xml file 
	     
	     DocumentBuilder db = dbf.newDocumentBuilder();  
	     Document doc = db.parse(file); 
	     doc.getDocumentElement().normalize();  
	     		
	    
	     System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
	     NodeList nodeList = doc.getElementsByTagName("report"); 
	     
	     
	     // nodeList is not iterable, so we are using for loop  
	     
	     for (int itr = 0; itr < nodeList.getLength(); itr++)   
	     {  
	     Node node = nodeList.item(itr);  
	     System.out.println("\nNode Name :" + node.getNodeName());  
	     if (node.getNodeType() == Node.ELEMENT_NODE)   
	     {  
	      eElement = (Element) node;  
	     System.out.println("Username: "+ eElement.getElementsByTagName("username").item(0).getTextContent());  
	     System.out.println("Password: "+ eElement.getElementsByTagName("password").item(0).getTextContent());  
	     }  
	     }
	     node = nodeList.item(0);
	     eElement = (Element) node; 
	    }
}
