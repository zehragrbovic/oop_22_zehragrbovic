package application;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean power;

    public Thermometer() {
        this.power = false;
    }

    public boolean isOn() {
        return this.power;
    }

    public void on() {
        this.power = true;
    }

    public void off() {
        this.power = false;
    }

    public int measure() {
        if(!this.isOn()) {
            throw new IllegalStateException("Thermometer is off.");
        }

        Random r = new Random();
        int value;
        value = r.nextInt(60) - 30;
        return value;

    }
}
