package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        assertEquals (18, conditioner.getCurrentTemperature());

        conditioner.setIncreaseCurrentTemperature(20);

        assertEquals (20, conditioner.getIncreaseCurrentTemperature());
    }
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
//        }