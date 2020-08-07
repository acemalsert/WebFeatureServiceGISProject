/*
	Author: Ahmet Cemal Sert
*/
package Functions;

public class DescribeFeatureType extends Functions{

    //class attributes
    private String  TYPENAME;

    //class constructor
    public DescribeFeatureType(String webFeatureServiceURL, String SERVICE, String VERSION, String REQUEST, String TYPENAME) {
        super(webFeatureServiceURL, SERVICE, VERSION, REQUEST);
        this.TYPENAME=TYPENAME;
    }

    //Getters and Setters
    public String getTYPENAME() {
        return TYPENAME;
    }

    public void setTYPENAME(String TYPENAME) {
        this.TYPENAME = TYPENAME;
    }

    //toString method
    @Override
    public String toString() {
        return  getWebFeatureServiceURL() + getSERVICE() + "&" + getVERSION() +"&" + getREQUEST()+ "&" + getTYPENAME();
    }

}
