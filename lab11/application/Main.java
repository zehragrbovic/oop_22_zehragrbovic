package application;

public class Main {
    public static void main(String[] args) {
        
        /*
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println(ten.measure());
        System.out.println(minusFive.measure());

        System.out.println(ten.isOn());
        ten.off();
        System.out.println(ten.isOn());

        Thermometer thermometer = new Thermometer();
        //System.out.println(thermometer.measure());
        thermometer.on();        
        System.out.println(thermometer.measure());
        */

        /*
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is " + kumpula.measure() + " degrees");

        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki are is " + helsinkiArea.measure() + " degrees");
        */

        /*
        ConstantSensor a = new ConstantSensor(5);
        ConstantSensor b = new ConstantSensor(6);
        ConstantSensor c = new ConstantSensor(7);
    
        AverageSensor test = new AverageSensor();
        test.addSensor(a);
        test.addSensor(b);
        test.addSensor(c);
        System.out.println(test.measure());
        */

        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is: " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is: " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is: " + helsinkiArea.measure() + " degrees");
        
        System.out.println("readings: " + helsinkiArea.readings());
        
    }
}
