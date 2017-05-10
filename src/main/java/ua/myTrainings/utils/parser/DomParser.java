package ua.myTrainings.utils.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParser {

    public static void parse (String path) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.parse(path);

        Element root = document.getDocumentElement();// get root element = department
        System.out.println("Department id: "+root.getAttribute("id"));

        System.out.println("Children of department: ");

        NodeList children = root.getChildNodes();
        for(int i=0; i<children.getLength();i++){
            System.out.println(children.item(i).getTextContent());
        }
    }
}
