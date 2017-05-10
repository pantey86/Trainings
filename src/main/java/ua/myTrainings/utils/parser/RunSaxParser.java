package ua.myTrainings.utils.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class RunSaxParser {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
        try {
            saxParser.parse(new FileInputStream(Constans.PATH), new MyHandler());
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

    }

    private static class MyHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.printf("<%s>", qName);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            System.out.printf("</%s>", qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            System.out.print(String.valueOf(ch, start, length));
        }
    }
}
