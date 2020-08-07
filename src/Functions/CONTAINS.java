/*
	Author: Ahmet Cemal Sert
*/

package Functions;

public class CONTAINS extends GetFeature {

    // Class attributes
    private String CQL_FILTER;

    public CONTAINS(String webFeatureServiceURL, String SERVICE, String VERSION, String REQUEST, String TYPENAME, String SRSNAME , String CQL_FILTER) {
        super(webFeatureServiceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME);
        this.CQL_FILTER = CQL_FILTER;
    }

    // Getters and Setters
    public String getCQL_FILTER() {
        return CQL_FILTER;
    }

    public void setCQL_FILTER(String CQL_FILTER) {
        this.CQL_FILTER = CQL_FILTER;
    }

    // toString method
    @Override
    public String toString() {
        return getWebFeatureServiceURL()+ getREQUEST() + "&" +getSERVICE()+ "&" + getSRSNAME() + "&"+ getTYPENAME() + "&" + getVERSION() + "&&" + getCQL_FILTER();
    }
}

