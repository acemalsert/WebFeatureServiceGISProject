/*
	Author: Ahmet Cemal Sert
*/

package Functions;

public class GetFeature extends Functions implements  IGetFeatureXmlConverter {

    // class attributes
    private String SRSNAME;
    private String TYPENAME;

    // class constructor
    public GetFeature(String webFeatureServiceURL, String SERVICE, String VERSION, String REQUEST, String TYPENAME, String SRSNAME) {
        super(webFeatureServiceURL, SERVICE, VERSION, REQUEST);
        this.SRSNAME = SRSNAME;
        this.TYPENAME = TYPENAME;
    }

    // Getters and Setters
    public String getSRSNAME() {
        return SRSNAME;
    }

    public void setSRSNAME(String SRSNAME) {
        this.SRSNAME = SRSNAME;
    }

    public String getTYPENAME() {
        return TYPENAME;
    }

    public void setTYPENAME(String TYPENAME) {
        this.TYPENAME = TYPENAME;
    }

    // toString method
    @Override
    public String toString() {
        return  getWebFeatureServiceURL() + getSERVICE() + "&" + getVERSION() +"&" + getREQUEST() + "&" + getTYPENAME()+ "&"+ getSRSNAME()+ "&MAXFEATURES=1";
    }

    // Class tester
    public static void main(String [] args) throws Exception  {
        Authenticator.authenticateAndDownload("http://cbsservis.tkgm.gov.tr/tkgm.ows/wfs?SERVICE=WFS&VERSION=1.0.0&REQUEST=GetFeature&TYPENAME=TKGM:parseller&SRSNAME=EPSG:4326&MAXFEATURES=1"
               ,"username","password", "C:\\Users\\ACS\\Desktop\\GetFeature.txt");
        IGetFeatureXmlConverter.getFeatureConverter("C:\\Users\\ACS\\Desktop\\GetFeature.txt");

    }
}


