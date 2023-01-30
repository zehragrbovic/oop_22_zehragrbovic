package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> lista = new ArrayList<Integer>();

    public boolean isOn() {
        for(Sensor sensor : this.sensors) {
            if(!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    public void on() {
        for(Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    public void off() {
        Random r = new Random();
        int value = r.nextInt(this.sensors.size()-1);
        this.sensors.get(value).off();
    }

    public int measure() {

        if(this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("Invalid");
        }

        int total = 0;
        int counter = 0;
        for(Sensor sensor : this.sensors) {
            total += sensor.measure();
            counter++;
        }
        total /= counter;
        lista.add(total);
        return total;
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    public List<Integer> readings() {
        return lista;
    }

}
