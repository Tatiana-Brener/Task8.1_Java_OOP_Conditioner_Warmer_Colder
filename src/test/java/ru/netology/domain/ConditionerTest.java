package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setCurrentTemperature(18);
        assertEquals(18, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(18);
        assertEquals(18, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }



//    @Test
//    public void shouldSetMaxTemperature() {
//        Conditioner conditioner = new Conditioner();
//
//        assertEquals(0, conditioner.getMaxTemperature());
//        conditioner.setMaxTemperature(28);
//        assertEquals(28, conditioner.getMaxTemperature());
//    }
//
//    @Test
//    public void shouldSetMinTemperature() {
//        Conditioner conditioner = new Conditioner();
//
//        assertEquals(0, conditioner.getMinTemperature());
//        conditioner.setMinTemperature(16);
//        assertEquals(16, conditioner.getMinTemperature());
//
//    }
}