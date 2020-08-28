package ru.netology.domain;

public class Conditioner {
    private int maxTemperature = 26;
    private int minTemperature = 16;
    private int currentTemperature;

    public int getMaxTemperature() {

        return maxTemperature;
    }

//    public void setMaxTemperature(int maxTemperature) {
//
//        this.maxTemperature = maxTemperature;
//    }

    public int getMinTemperature() {

        return minTemperature;
    }

//    public void setMinTemperature(int minTemperature) {
//
//        this.minTemperature = minTemperature;
//    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
//        проверка, что текущ t меньше max
        if (currentTemperature > maxTemperature)
//        если текущ t больше max, то return приведет к выходу
//        и вернет последнее присвоенное знач, то есть 0
            return;
//        проверка что текущ t больше min
        if (currentTemperature < minTemperature)
//            если текущ t меньше min, то return приведет к выходу
//        и вернет последнее присвоенное знач, то есть 0
            return;
//        если проверка проходит, то есть меньше max и больше min, то
//        в поле currentTemperature текущего объекта записывается
//        текущее значение переменной/параметра, то есть то, кот
//        было передано в сеттер
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {

        int increaseCurrentTemperature = currentTemperature++;
        if (increaseCurrentTemperature < maxTemperature)
            this.currentTemperature = currentTemperature++;
        if (increaseCurrentTemperature >= maxTemperature)
            this.currentTemperature = maxTemperature;
    }

    public void decreaseCurrentTemperature() {

        int decreaseCurrentTemperature = currentTemperature--;
        if (decreaseCurrentTemperature > minTemperature)
            this.currentTemperature = currentTemperature--;
        if (decreaseCurrentTemperature <= minTemperature)
            this.currentTemperature = minTemperature;
    }
}









