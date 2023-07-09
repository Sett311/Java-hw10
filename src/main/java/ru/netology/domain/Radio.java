package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() { // геттер станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { // сеттер станции
        this.currentStation = currentStation;
    }
    public void nextStation() { // переключение на следующую станцию
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
    public void prevStation() { // переключение на предыдущую станцию
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
    public void setSelectStation(int selectStation) { //выбор номера станции напрямую
        int minStation = 0;
        int maxStation = 9;
        if (selectStation < minStation || selectStation > maxStation) {
            return;
        }
        this.currentStation = selectStation;
    }

    public int getCurrentVolume() { // геттер громкости
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { // сеттер громкости
        this.currentVolume = currentVolume;
    }
    public void nextVolume() { // переключение на следующую станцию
        if (currentVolume != 10) {
            currentVolume++;
        }
    }
    public void prevVolume() { // переключение на предыдущую станцию
        if (currentVolume != 0) {
            currentVolume--;
        }
    }


}