package application;

public class ConstantSensor implements Sensor{
    private int measure;

    public ConstantSensor(int value) {
        this.measure = value;
    }

    public boolean isOn() {
        return true;
    }

    public void on() {}
    public void off() {}

    public int measure() {
        return this.measure;
    }
}
