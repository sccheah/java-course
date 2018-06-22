package application;
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
    }

    // adds a new sensor
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override 
    public boolean isOn() {
        boolean isOn = true;

        for (Sensor sensor : sensors) {
            if (!sensor.isOn())
                isOn = false;
        }

        return isOn;
    }

    @Override 
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn() || (sensors.size() == 0))
            throw new IllegalStateException();

        int sum = 0;

        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }

        return (sum / sensors.size());
    }

    public List<Integer> readings() {
        List<Integer> readings = new ArrayList<Integer>();

        for (Sensor sensor : sensors) {
            readings.add(sensor.measure());
        }

        return readings;
    }

    public static void main(String[] args) {
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

        System.out.println("readings: "+helsinkiArea.readings());
    }
}