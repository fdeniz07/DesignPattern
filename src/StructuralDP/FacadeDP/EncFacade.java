package StructuralDP.FacadeDP;

public class EncFacade {

    private AESEnc aesEnc = new AESEnc();
    private MD5Enc md5Enc = new MD5Enc();
    private SHAEnc shaEnc = new SHAEnc();

    public void encrypt(String text,EncryptType encryptType) {

        switch (encryptType){
            case AES:aesEnc.encrypt(text); break;
            case MD5:md5Enc.encrypt(text,"KEY");break;
            case SHA:shaEnc.encrypt(text,"KEY",true);break;
            default: throw new IllegalArgumentException(encryptType.toString());
        }
    }

    public enum EncryptType {
        SHA,
        MD5,
        AES
    }

}
