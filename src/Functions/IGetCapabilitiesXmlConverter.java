/*
	Author: Ahmet Cemal Sert
*/

package Functions;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.PrintWriter;

public interface IGetCapabilitiesXmlConverter {

    static void getCapabilitiesConverter(String fileName){
        String Features = "";

        try {
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("ogc:Functions");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    //System.out.println("fid : " + eElement.getAttribute("fid"));
                    String f1 = eElement.getElementsByTagName("ogc:Function_Name").item(0).getTextContent();
                    String f2 = eElement.getElementsByTagName("ogc:Function_Name").item(1).getTextContent();
                    String f3 = eElement.getElementsByTagName("ogc:Function_Name").item(2).getTextContent();
                    String f4 = eElement.getElementsByTagName("ogc:Function_Name").item(3).getTextContent();
                    String f5 = eElement.getElementsByTagName("ogc:Function_Name").item(4).getTextContent();
                    String f6 = eElement.getElementsByTagName("ogc:Function_Name").item(5).getTextContent();
                    String f7 = eElement.getElementsByTagName("ogc:Function_Name").item(6).getTextContent();
                    String f8 = eElement.getElementsByTagName("ogc:Function_Name").item(7).getTextContent();
                    String f9 = eElement.getElementsByTagName("ogc:Function_Name").item(8).getTextContent();
                    String f10 = eElement.getElementsByTagName("ogc:Function_Name").item(9).getTextContent();
                    String f11 = eElement.getElementsByTagName("ogc:Function_Name").item(10).getTextContent();
                    String f12 = eElement.getElementsByTagName("ogc:Function_Name").item(11).getTextContent();
                    String f13 = eElement.getElementsByTagName("ogc:Function_Name").item(12).getTextContent();
                    String f14 = eElement.getElementsByTagName("ogc:Function_Name").item(13).getTextContent();
                    String f15 = eElement.getElementsByTagName("ogc:Function_Name").item(14).getTextContent();
                    String f16 = eElement.getElementsByTagName("ogc:Function_Name").item(15).getTextContent();
                    String f17 = eElement.getElementsByTagName("ogc:Function_Name").item(16).getTextContent();
                    String f18 = eElement.getElementsByTagName("ogc:Function_Name").item(17).getTextContent();
                    String f19 = eElement.getElementsByTagName("ogc:Function_Name").item(18).getTextContent();
                    String f20 = eElement.getElementsByTagName("ogc:Function_Name").item(19).getTextContent();
                    String f21 = eElement.getElementsByTagName("ogc:Function_Name").item(20).getTextContent();
                    String f22 = eElement.getElementsByTagName("ogc:Function_Name").item(21).getTextContent();
                    String f23 = eElement.getElementsByTagName("ogc:Function_Name").item(22).getTextContent();
                    String f24 = eElement.getElementsByTagName("ogc:Function_Name").item(23).getTextContent();
                    String f25 = eElement.getElementsByTagName("ogc:Function_Name").item(24).getTextContent();
                    String f26 = eElement.getElementsByTagName("ogc:Function_Name").item(25).getTextContent();
                    String f27 = eElement.getElementsByTagName("ogc:Function_Name").item(26).getTextContent();
                    String f28 = eElement.getElementsByTagName("ogc:Function_Name").item(27).getTextContent();
                    String f29 = eElement.getElementsByTagName("ogc:Function_Name").item(28).getTextContent();
                    String f30 = eElement.getElementsByTagName("ogc:Function_Name").item(29).getTextContent();
                    String f31 = eElement.getElementsByTagName("ogc:Function_Name").item(30).getTextContent();
                    String f32 = eElement.getElementsByTagName("ogc:Function_Name").item(31).getTextContent();
                    String f33 = eElement.getElementsByTagName("ogc:Function_Name").item(32).getTextContent();
                    String f34 = eElement.getElementsByTagName("ogc:Function_Name").item(33).getTextContent();
                    String f35 = eElement.getElementsByTagName("ogc:Function_Name").item(34).getTextContent();
                    String f36 = eElement.getElementsByTagName("ogc:Function_Name").item(35).getTextContent();
                    String f37 = eElement.getElementsByTagName("ogc:Function_Name").item(36).getTextContent();
                    String f38 = eElement.getElementsByTagName("ogc:Function_Name").item(37).getTextContent();
                    String f39 = eElement.getElementsByTagName("ogc:Function_Name").item(38).getTextContent();
                    String f40 = eElement.getElementsByTagName("ogc:Function_Name").item(39).getTextContent();
                    String f41 = eElement.getElementsByTagName("ogc:Function_Name").item(40).getTextContent();
                    String f42 = eElement.getElementsByTagName("ogc:Function_Name").item(41).getTextContent();
                    String f43 = eElement.getElementsByTagName("ogc:Function_Name").item(42).getTextContent();
                    String f44 = eElement.getElementsByTagName("ogc:Function_Name").item(43).getTextContent();
                    String f45 = eElement.getElementsByTagName("ogc:Function_Name").item(44).getTextContent();
                    String f46 = eElement.getElementsByTagName("ogc:Function_Name").item(45).getTextContent();
                    String f47 = eElement.getElementsByTagName("ogc:Function_Name").item(46).getTextContent();
                    String f48 = eElement.getElementsByTagName("ogc:Function_Name").item(47).getTextContent();
                    String f49 = eElement.getElementsByTagName("ogc:Function_Name").item(48).getTextContent();
                    String f50 = eElement.getElementsByTagName("ogc:Function_Name").item(49).getTextContent();

                    Features = "The Capabilities Are : \n"
                     +f1 + "\n"
                     +f2 + "\n"
                     +f3+ "\n"
                     +f4+"\n"
                     +f5 +"\n"
                     +f6 + "\n"
                     +f7+ "\n"
                     +f8 + "\n"
                     +f9 + "\n"
                     +f10 + "\n"
                     +f11 + "\n"
                     +f12 + "\n"
                     +f13+ "\n"
                     +f14+"\n"
                     +f15 +"\n"
                     +f16 + "\n"
                     +f17+ "\n"
                     +f18 + "\n"
                     +f19 + "\n"
                     +f20 + "\n"
                     +f21 + "\n"
                     +f22 + "\n"
                     +f23 + "\n"
                     +f24+ "\n"
                     +f25+"\n"
                     +f26 +"\n"
                     +f27 + "\n"
                     +f28+ "\n"
                     +f29 + "\n"
                     +f30 + "\n"
                     +f31 + "\n"
                     +f32 + "\n"
                     +f33 + "\n"
                     +f34+ "\n"
                     +f35+"\n"
                     +f36 +"\n"
                     +f37 + "\n"
                     +f38+ "\n"
                     +f39 + "\n"
                     +f40 + "\n"
                     +f41 + "\n"
                     +f42 + "\n"
                     +f43 + "\n"
                     +f44+ "\n"
                     +f45+"\n"
                     +f46 +"\n"
                     +f47 + "\n"
                     +f48+ "\n"
                     +f49 + "\n"
                     +f50 + "\n";
                }
                try (PrintWriter out = new PrintWriter(fileName)) {
                    out.println(Features);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
