package application;

public interface Sensor {
    boolean isOn();     // ret true if sensor is on
    void on();          // switches the sensor on
    void off();         // switches the sensor off
    int measure();      // ret the sensor reading if the sensor is on; if sensor is off, throws
                            // an illegal exception

}