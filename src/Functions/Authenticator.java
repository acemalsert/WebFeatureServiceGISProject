/*
	Author: Ahmet Cemal Sert
*/

package Functions;


import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Authenticator  {

    public static void authenticateAndDownload (String urlName , String ID , String password , String fileName){

        try {
            String authString = ID + ":" + password;
            System.out.println("auth string: " + authString);
            byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
            String authStringEnc = new String(authEncBytes);
            System.out.println("Base64 encoded auth string: " + authStringEnc);

            URL url = new URL(urlName);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
            InputStream is = urlConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            int numCharsRead;
            char[] charArray = new char[100000000];
            StringBuffer sb = new StringBuffer();
            while ((numCharsRead = isr.read(charArray)) > 0) {
                sb.append(charArray, 0, numCharsRead);
            }
            String result = sb.toString();

            try (PrintWriter out = new PrintWriter(fileName)) {
                out.println(result);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // class tester
    public static void main(String[] args) throws Exception {
    Authenticator.authenticateAndDownload("http://cbsservis.tkgm.gov.tr/tkgm.ows/wfs?SERVICE=WFS&VERSION=1.0.0&REQUEST=GetFeature&TYPENAME=TKGM:parseller&SRSNAME=EPSG:4326&MAXFEATURES=1"
    ,"username","password", "C:\\Users\\ACS\\Desktop\\tester.txt");

    }
}
