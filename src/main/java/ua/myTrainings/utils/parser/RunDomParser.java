package ua.myTrainings.utils.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class RunDomParser {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        DomParser.parse(Constans.PATH);

    }
}
