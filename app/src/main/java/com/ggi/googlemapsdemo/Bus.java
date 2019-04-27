package com.ggi.googlemapsdemo;

public class Bus {

    private String place;
    private String time;
    public Bus(String Place, String Time){
        place=Place;
        time=Time;

    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }
}
