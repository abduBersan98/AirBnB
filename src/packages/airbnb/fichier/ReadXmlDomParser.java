package packages.airbnb.fichier;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class ReadXmlDomParser {

    private static final String FILENAME = "logements.xml";

    public static void main(String[] args) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            // get <staff>

            NodeList list = doc.getElementsByTagName("Appartement");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {


                    Element element = (Element) node;

                    Element elementHote = (Element) node;

                    String nom = elementHote.getElementsByTagName("nom").item(0).getTextContent();
                    String prenom = elementHote.getElementsByTagName("prenom").item(0).getTextContent();
                    int age = Integer.parseInt(elementHote.getElementsByTagName("age").item(0).getTextContent());
                    int delaiReponse = Integer.parseInt(elementHote.getElementsByTagName("delaiReponse").item(0).getTextContent());


                    String adresse = element.getElementsByTagName("adresse").item(0).getTextContent();
                    int superficie = Integer.parseInt(element.getElementsByTagName("superficie").item(0).getTextContent());
                    int nbVoyageursMax = Integer.parseInt(element.getElementsByTagName("nbVoyageursMax").item(0).getTextContent());
                    int numeroEtage = Integer.parseInt(element.getElementsByTagName("numeroEtage").item(0).getTextContent());
                    int superficieBalcon = Integer.parseInt(element.getElementsByTagName("superficieBalcon").item(0).getTextContent());

                    System.out.println("Current Element :" + node.getNodeName());
                    System.out.println("Nom : " + nom);
                    System.out.println("Prénom : " + prenom);
                    System.out.println("Age : " + age  + " ans");
                    System.out.println("Délais de réponse : " + delaiReponse);
                    System.out.println("adresse : " + adresse);
                    System.out.println("superficie : " + superficie);
                    System.out.println("nbVoyageursMax : " + nbVoyageursMax);
                    System.out.println("numeroEtage : " + numeroEtage  + " m2");
                    System.out.println("superficieBalcon : " + superficieBalcon);
                    System.out.println("---------------------------");

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }



        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            // get <staff>

            NodeList list = doc.getElementsByTagName("Maison");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    Element elementHote = (Element) node;

                    String nom = elementHote.getElementsByTagName("nom").item(0).getTextContent();
                    String prenom = elementHote.getElementsByTagName("prenom").item(0).getTextContent();
                    int age = Integer.parseInt(elementHote.getElementsByTagName("age").item(0).getTextContent());
                    int delaiReponse = Integer.parseInt(elementHote.getElementsByTagName("delaiReponse").item(0).getTextContent());

                    String adresse = element.getElementsByTagName("adresse").item(0).getTextContent();
                    int superficie = Integer.parseInt(element.getElementsByTagName("superficie").item(0).getTextContent());
                    int nbVoyageursMax = Integer.parseInt(element.getElementsByTagName("nbVoyageursMax").item(0).getTextContent());
                    int superficieJardin = Integer.parseInt(element.getElementsByTagName("superficieJardin").item(0).getTextContent());
                    String possedePiscine = element.getElementsByTagName("possedePiscine").item(0).getTextContent();

                    boolean possedePiscineResponse = possedePiscine.equals("1") ? true : false;
                    String reponse = possedePiscineResponse ? "Oui" : "Non";

                    System.out.println("Current Element : " + node.getNodeName());
                    System.out.println("Nom : " + nom);
                    System.out.println("Prénom : " + prenom);
                    System.out.println("Age : " + age + " ans");
                    System.out.println("Délais de réponse : " + delaiReponse);
                    System.out.println("adresse : " + adresse);
                    System.out.println("superficie : " + superficie + " m2");
                    System.out.println("nbVoyageursMax : " + nbVoyageursMax);
                    System.out.println("superficieBalcon : " + superficieJardin);
                    System.out.println("possedePiscine : " + reponse);
                    System.out.println("---------------------------");

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}
