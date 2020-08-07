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

public interface IGetFeatureXmlConverter {

    static void getFeatureConverter(String fileName){
        String Features = "";

        try {
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("gml:featureMember");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    //System.out.println("fid : " + eElement.getAttribute("fid"));
                    String parselNo = eElement.getElementsByTagName("TKGM:parselno").item(0).getTextContent();
                    String adaNo = eElement.getElementsByTagName("TKGM:adano").item(0).getTextContent();
                    String tapuKimlikNo = eElement.getElementsByTagName("TKGM:tapukimlikno").item(0).getTextContent();
                    String tapuAciklama = eElement.getElementsByTagName("TKGM:tapucinsaciklama").item(0).getTextContent();
                    String tapuZeminRef =  eElement.getElementsByTagName("TKGM:tapuzeminref").item(0).getTextContent();
                    String tapuMahalleRef = eElement.getElementsByTagName("TKGM:tapumahalleref").item(0).getTextContent();
                    String tapuAlan = eElement.getElementsByTagName("TKGM:tapualan").item(0).getTextContent();
                    String tip = eElement.getElementsByTagName("TKGM:tip").item(0).getTextContent();
                    String durum = eElement.getElementsByTagName("TKGM:durum").item(0).getTextContent();

                            Features = "Parsel numarası : " + parselNo + "\n"
                                      +"Ada numarası : "+ adaNo + "\n"
                                      +"Tapu Kimlik numarası : " + tapuKimlikNo + "\n"
                                      +"Tapu Açıklaması : " + tapuAciklama + "\n"
                                      +"Tapu Zemin Ref : " + tapuZeminRef + "\n"
                                      +"Tapu Mahalle Ref : " + tapuMahalleRef +"\n"
                                      +"Tapu Alan : "+ tapuAlan +"\n"
                                      +"Tip : "+tip + "\n"
                                      +"Durum : " + durum ;
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


