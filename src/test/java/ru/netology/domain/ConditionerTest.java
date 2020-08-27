package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperatureMin16() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(16);
        assertEquals(16, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature17() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(17);
        assertEquals(17, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature18() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(18);
        assertEquals(18, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature19() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(19);
        assertEquals(19, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature20() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature21() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(21);
        assertEquals(21, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature22() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature23() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(23);
        assertEquals(23, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature24() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature25() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(25);
        assertEquals(25, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature26() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(26);
        assertEquals(26, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(27, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature27() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(27);
        assertEquals(27, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(28, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureMax28() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(28, conditioner.getMaxTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureMin16() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getMinTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature17() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(17);
        assertEquals(17, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature18() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(18);
        assertEquals(18, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature19() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(19);
        assertEquals(19, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature20() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature21() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(21);
        assertEquals(21, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatur22() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature23() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(23);
        assertEquals(23, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature24() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(24);
        assertEquals(24, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature25() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(25);
        assertEquals(25, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature26() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(26);
        assertEquals(26, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature27() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(27);
        assertEquals(27, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureMax28() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(28);
        assertEquals(28, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(27, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureOverMax29() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(29);
        assertEquals(28, conditioner.getMaxTemperature());

    }

    @Test
    public void shouldSetCurrentTemperatureUnderMin15() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
        conditioner.setMaxTemperature(28);
        assertEquals(28, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(15);
        assertEquals(16, conditioner.getMinTemperature());
    }
}