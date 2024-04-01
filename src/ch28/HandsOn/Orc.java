package ch28.HandsOn;

import java.util.HashSet;
import java.util.Set;

interface WeatherUpdate{
    void update(WeatherType type);
}
public class Orc implements WeatherUpdate {
    @Override
    public void update(WeatherType type) {

    }
}

class Hobit implements WeatherUpdate{
    @Override
    public void update(WeatherType type) {

    }
}

enum WeatherType{
    SUNNY,
    RANIY,
    WINDY,
    COLD
}

class Center {
    // 날씨가 변화가 감지되면 날씨에 대해 알림을 받을 수 있는
    // 구조체가 필요하다.
    private Set<WeatherUpdate> observers;
    private WeatherType currentWeather;

    public Center(){
        observers= new HashSet<>();
        // observers를 메모리에 올린다.
        // weatherUpdate를 올릴수 있는 자료구조가 생겼다.
    }

    public void addObserver(WeatherUpdate weatherUpdate){
        observers.add(weatherUpdate);
    }
    private void notifyObserver() {
        for (var observer : observers) {
            observer.update(currentWeather);
        }
    }
    public void weatherUpdate(){
        var type = WeatherType.values();
        // values()를 리턴하면 WeatherType의 array가 리턴된다.
        int index = currentWeather.ordinal()+1;
        // ordinal = 인덱스
        currentWeather= type[index];
    }

}

class Main {
    public static void main(String[] args) {
        var center = new Center();
        WeatherUpdate observer = new Orc();
        // 인터페이스 변수로 받는게 훨씬 유동적이다.
        center.addObserver(observer);


        observer = new Hobit();
       center.addObserver(observer);
    }

}