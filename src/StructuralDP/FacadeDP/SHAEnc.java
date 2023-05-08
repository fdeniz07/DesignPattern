package StructuralDP.FacadeDP;

public class SHAEnc {

    public void encrypt(String text, String secretKey, boolean type){

        if (type){
            System.out.println("<SHA> " + secretKey + text + " </SHA>");
        }else
            System.out.println("<AES> " + text + secretKey + " </AES>");
    }
}
