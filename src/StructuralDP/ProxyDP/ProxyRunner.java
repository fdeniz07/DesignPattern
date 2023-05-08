package StructuralDP.ProxyDP;

public class ProxyRunner {

    public static void main(String[] args) {

        ProxyClass proxyClass1 = new ProxyClass("c:\\resim1.jpg");
        ProxyClass proxyClass2 = new ProxyClass("c:\\resim2.jpg");

        proxyClass1.showImage();
        proxyClass2.showImage();

    }
}
