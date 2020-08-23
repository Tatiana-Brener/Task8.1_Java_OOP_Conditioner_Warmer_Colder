package ru.netology.domain;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;
    int count = 0;

    public int getMaxTemperature() {

        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        setMaxTemperature(28);

        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {

        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        setMinTemperature(16);

        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        setCurrentTemperature(18);

        this.currentTemperature = currentTemperature;
    }

    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }

    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        count++;
        increaseCurrentTemperature = getCurrentTemperature() + count;
        if (increaseCurrentTemperature <= getMaxTemperature()) {
            return;
        }
        this.increaseCurrentTemperature = increaseCurrentTemperature;
    }

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        this.decreaseCurrentTemperature = decreaseCurrentTemperature;
    }
}

//
//    public void increaseCurrentTemperature(int currentTemperature) {
//        int i = 1;
//        int increaseCurrentTemperature = getCurrentTemperature() + i;
//        if (increaseCurrentTemperature <= getMaxTemperature()) {
//            return;
//        }
//   this.increaseCurrentTemperature = increaseCurrentTemperature;
//    }








