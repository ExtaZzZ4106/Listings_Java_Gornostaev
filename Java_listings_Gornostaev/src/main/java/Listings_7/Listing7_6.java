package Listings_7;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Listing7_6 {
    static class DomPrint {
        private static void printIndentation(int level) {
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
        }

        private static void print(Node node, int level) {
            if (level > 0) {
                System.out.println();
                printIndentation(level);
            }

            System.out.print(node.getNodeName() + ":");

            if (node.hasAttributes()) {
                NamedNodeMap attributes = node.getAttributes();
                if (attributes.getLength() > 0) {
                    level++;

                    for (int i = 0; i < attributes.getLength(); i++) {
                        Node attribute = attributes.item(i);

                        printIndentation(level);
                        String s = "." + attribute.getNodeName() + "=";
                        System.out.print(s + attribute.getNodeValue());
                    }
                    level--;
                }
            }

            String value = node.getNodeValue();
            value = (value == null ? "" : value.trim());
            if (value.length() > 0) {
                printIndentation(level);
                System.out.print(value);
            }

            if (node.hasChildNodes()) {
                level++;
                NodeList children = node.getChildNodes();

                for (int i = 0; i < children.getLength(); i++) {
                    Node child = children.item(i);
                    print(child, level);
                }
            }
        }

        public static void main(String[] args) {
            if (args.length < 1) {
                System.out.println("Usage: java List7_6 имя_файла_xml");
                System.exit(0);
            }

            File docFile = new File(args[0]);
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                factory.setIgnoringComments(true);
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(docFile);
                print(doc.getDocumentElement(), 0);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DomPrint.main(args);
    }
}
