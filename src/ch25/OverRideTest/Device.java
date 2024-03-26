package ch25.OverRideTest;


import java.util.ArrayList;
import java.util.List;

class Device {

   protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + "device is turn on");

    }

    public void turnOff() {
        System.out.println(brand + "device is turn off");
    }
}

class NoteBook extends Device{
    protected String model;

    public NoteBook(String brand, String model) {
        super(brand);
        this.model= model;

    }
    public void open() {
        System.out.println(brand + " " + model + "is open");

    }

    public void close() {
        System.out.println(brand + " " + model + "is close");
    }

}

class MacBook extends NoteBook{


    public MacBook(String brand, String model) {
        super(brand, model);
    }
    public void runMacOs(){
        System.out.println("Running macOs on " + brand + "  " +  model);
    }

    }


class GalaxyBook extends NoteBook {

    public GalaxyBook(String brand, String model) {
        super(brand, model);
    }

    public void runGaluxyOs() {
        System.out.println("Running Galuxy on " + brand + "  " +  model);


    }
}
class AppleWatch extends Device {
    public AppleWatch(String brand) {
        super(brand);
    }
}


class MyDevice {

    private List<Device> devices;

    public MyDevice(){
        devices = new ArrayList<>();

    }

    public List<Device> getDevices() {
        return devices;
    }

    public void addMyDevice(Device device){
        devices.add(device);

    }
    public void runNow(Device device){ // . MacBook 했을떄
        if(device instanceof MacBook) {
            ((MacBook) device).runMacOs();
        }
            else if (device instanceof GalaxyBook){
            ((GalaxyBook)device).runGaluxyOs();
        }
            else ((AppleWatch)device).turnOn();
    }
}

class Main{
    public static void main(String[] args) {
        var myDevice = new MyDevice();

        Device Macdevice = new MacBook("애플","air2");
        // 넣는방법이 다양하다.
        myDevice.addMyDevice(new GalaxyBook("삼성","갤럭시북"));
        // 이렇게 다양하게 호출 할 수 있따.

        // 디바이스를 가져와서 실행을 시켜야된다
        Macdevice.turnOn(); // < for 안에서는 못쓰나..? 왜지.

       for(var devices: myDevice.getDevices()){
           myDevice.runNow(devices);

        }
    }
}

