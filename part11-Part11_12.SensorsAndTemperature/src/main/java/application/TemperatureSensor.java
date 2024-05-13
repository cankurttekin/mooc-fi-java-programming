/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author can
 */
public class TemperatureSensor implements Sensor {
    private boolean status;
    
    public TemperatureSensor() {
        this.status = false;
    }
    
    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if(this.isOn()) {
            int rand = new Random().nextInt(61);
            if(rand > 30) {
                return rand % 30;
            } else {
                return -1 * rand % 30;
            }
        }
        throw new IllegalStateException("Sensor is off!");
    }
    
}
