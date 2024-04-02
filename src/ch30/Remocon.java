package ch30;

public class Remocon<T> {

    private T device;
    public Remocon(T device){
        this.device = device;
    }

    public T getDevice() {
        return device;
    }

    public void setDevice(T device) {
        this.device = device;
    }
}


class Tv{
    private String brand;
    public Tv(String brand){
        this.brand= brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}


class Radio{

    private String brand;
}



class AppMain{
    public static void main(String[] args) {
        Tv tv = new Tv("samsung");
        Remocon<Tv> tvRemocon = new Remocon<>(tv);
        System.out.println(tvRemocon.getDevice().getBrand());

    }
}