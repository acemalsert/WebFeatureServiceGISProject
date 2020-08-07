/*
	Author: Ahmet Cemal Sert
*/

package Functions;

public class GetCapabilities extends Functions implements IGetCapabilitiesXmlConverter{

    public GetCapabilities(String webFeatureServiceURL, String SERVICE, String VERSION, String REQUEST) {
        super(webFeatureServiceURL, SERVICE, VERSION, REQUEST);
    }

    @Override
    public String toString() {
        return  getWebFeatureServiceURL() + getSERVICE() + "&" + getVERSION() +"&" + getREQUEST() ;
    }

    // Class tester
    public static void main(String [] args){
        Authenticator.authenticateAndDownload("http://cbsservis.tkgm.gov.tr/tkgm.ows/wfs?SERVICE=WFS&Version=1.0.0&REQUEST=Getcapabilities"
                ,"cbsdemouser","q3b8f+r*", "C:\\Users\\ACS\\Desktop\\GetCapabilities.txt");
        IGetCapabilitiesXmlConverter.getCapabilitiesConverter("C:\\Users\\ACS\\Desktop\\GetCapabilities.txt");
    }
}



