package _2005代理模式;

public class RealImage implements Image {

    private String fileName;
    //构造函数，给属性赋值，并进行加载动作
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Result:您已获得： " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("柜台正在出票 " + fileName);
    }
}
