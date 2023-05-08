package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator{

    private String fullPath;

    public RealClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {

        System.out.println("Resim gösteriliyor " + fullPath);

    }


    public void changeImage(){

    }

    public void formatOfImage(){

    }
}
