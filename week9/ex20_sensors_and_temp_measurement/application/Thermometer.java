package application;

import java.lang.Math;

public class Thermometer implements Sensor {
    private boolean isOn;
    
    public Thermometer() { isOn = false; }

    @Override
    public boolean isOn() { return isOn; }

    @Override
    public void on() { isOn = true; }

    @Override 
    public void off() { isOn = false; }

    @Override
    public int measure() {
        if (isOn)
            return (int)(Math.random() * 60) - 30;
        else
            throw new IllegalStateException();
    }
}