package ru.netology.domain;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public int getMaxTemperature() {

        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {

        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {

        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {

        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature >= maxTemperature)
            return;
        if (currentTemperature <= minTemperature)
            return;
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {

        int increaseCurrentTemperature = currentTemperature++;
        if (increaseCurrentTemperature <= getMaxTemperature()) {
            return;
        }
        else increaseCurrentTemperature = getMaxTemperature();
        this.currentTemperature = increaseCurrentTemperature;
    }

    public void decreaseCurrentTemperature() {

        int decreaseCurrentTemperature = currentTemperature--;
        if (decreaseCurrentTemperature >= getMinTemperature()) {
            return;
        }
        else decreaseCurrentTemperature = getMinTemperature();
        this.currentTemperature = decreaseCurrentTemperature;
        }

    }


//        int increaseCurrentTemperature2 = increaseCurrentTemperature;
//        if (increaseCurrentTemperature2 <= getMaxTemperature()) {
//            return;
//        }
//        this.currentTemperature = increaseCurrentTemperature2;


//    public int getIncreaseCurrentTemperature() {
//        return increaseCurrentTemperature;
//    }
//
//    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
//        count++;
//        increaseCurrentTemperature = getCurrentTemperature() + count;
//        if (increaseCurrentTemperature <= getMaxTemperature()) {
//            return;
//        }
//        this.increaseCurrentTemperature = increaseCurrentTemperature;
//    }
//
//    public int getDecreaseCurrentTemperature() {
//
//        return decreaseCurrentTemperature;
//    }
//
//    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
//        this.decreaseCurrentTemperature = decreaseCurrentTemperature;
//    }








