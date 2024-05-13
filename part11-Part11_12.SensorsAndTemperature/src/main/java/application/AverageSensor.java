/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author can
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        if(this.sensors.stream().filter(s -> s.isOn() == false).count() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if(!this.isOn()) {
            throw new IllegalStateException("Sensors are off!");
        }
        int reading = (int) this.sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        this.readings.add(reading);
        return reading;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
}
