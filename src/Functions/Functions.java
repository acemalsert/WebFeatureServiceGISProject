/*
	Author: Ahmet Cemal Sert
*/

package Functions ;

public class Functions {

    // Class attributes
    private String webFeatureServiceURL;
    private String SERVICE;
    private String VERSION;
    private String REQUEST;

    // Functions constructor
    public Functions(String webFeatureServiceURL, String SERVICE, String VERSION, String REQUEST) {
        this.webFeatureServiceURL = webFeatureServiceURL;
        this.SERVICE = SERVICE;
        this.VERSION = VERSION;
        this.REQUEST = REQUEST;

    }

    // Getters and Setters
    public String getWebFeatureServiceURL() {
        return webFeatureServiceURL;
    }

    public void setWebFeatureServiceURL(String webFeatureServiceURL) {
        this.webFeatureServiceURL = webFeatureServiceURL;
    }

    public String getSERVICE() {
        return SERVICE;
    }

    public void setSERVICE(String SERVICE) {
        this.SERVICE = SERVICE;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getREQUEST() {
        return REQUEST;
    }

    public void setREQUEST(String REQUEST) {
        this.REQUEST = REQUEST;
    }
}