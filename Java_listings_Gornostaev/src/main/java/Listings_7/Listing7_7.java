package Listings_7;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Listing7_7 {
    static class SaxPrint extends DefaultHandler {

        public void startDocument() throws SAXException {
            System.out.println("Начало документа");
        }

        public void endDocument() throws SAXException {
            System.out.println("");
            System.out.println("Конец документа");
        }

        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            System.out.println("");
            System.out.println("  Начало " + qName);

            if (attributes.getLength() > 0) {
                for (int i = 0; i < attributes.getLength(); i++) {
                    System.out.println("     ." + attributes.getQName(i) + "=" + attributes.getValue(i));
                }
            }
        }

        public void characters(char[] data, int start, int length)
                throws SAXException {
            StringBuffer buf = new StringBuffer(length);
            buf.append(data, start, length);
            if (buf.toString().trim().length() > 0) {
                System.out.println(" " + buf);
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java List7_7 имя_файла_xml");
            System.exit(0);
        }

        try {
            File docFile = new File(args[0]);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(docFile, new SaxPrint());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
