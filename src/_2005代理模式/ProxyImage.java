package _2005代理模式;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        System.out.println("Loading:代理商正在帮你买票 " + fileName);
        realImage.display();
    }
}