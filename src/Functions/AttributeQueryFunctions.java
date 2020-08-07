/*
	Author: Ahmet Cemal Sert
*/

package Functions;
public class AttributeQueryFunctions extends GetFeature {

    // class attributes
    private String TYPENAME;
    private String SRSNAME;
    private String CQL_FILTER;

    public AttributeQueryFunctions(String webFeatureServiceURL, String SERVICE, String VERSION, String REQUEST, String TYPENAME, String SRSNAME) {
        super(webFeatureServiceURL, SERVICE, VERSION, REQUEST, TYPENAME, SRSNAME);
    }


    // Getters and Setters
    public String getTYPENAME() {
        return TYPENAME;
    }

    public void setTYPENAME(String TYPENAME) {
        this.TYPENAME = TYPENAME;
    }

    public String getSRSNAME() {
        return SRSNAME;
    }

    public void setSRSNAME(String SRSNAME) {
        this.SRSNAME = SRSNAME;
    }

    public String getCQL_FILTER() {
        return CQL_FILTER;
    }

    public void setCQL_FILTER(String CQL_FILTER) {
        this.CQL_FILTER = CQL_FILTER;
    }

}
