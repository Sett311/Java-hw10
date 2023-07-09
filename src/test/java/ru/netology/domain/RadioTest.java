package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
/*
    @Test
    public void checkNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0); // прогнать пограничные значения и другие

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
*/

    @ParameterizedTest
    @CsvSource(value = {
            "Critical path analysis; 6; 6",
            "Invalid value analysis 1; -5; 0",
            "Invalid value analysis 2; 20; 0",
            "Boundary value analysis 1; -1; 0",
            "Boundary value analysis 2; 0; 0",
            "Boundary value analysis 3; 1; 1",
            "Boundary value analysis 4; 8; 8",
            "Boundary value analysis 5; 9; 9",
            "Boundary value analysis 6; 10; 0",
    }, delimiter = ';')
    void setSelectStation(String nameTest, int inputSelectStation, int expected) {
        Radio radio = new Radio();
        radio.setSelectStation(inputSelectStation);
        Assertions.assertEquals(radio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Critical path analysis; 2; 3",
            "Boundary value analysis 1; 0; 1",
            "Boundary value analysis 2; 1; 2",
            "Boundary value analysis 3; 8; 9",
            "Boundary value analysis 4; 9; 0",
    }, delimiter = ';')
    void setNextStation(String nameTest, int oldCurrentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(oldCurrentStation);
        radio.nextStation();
        Assertions.assertEquals(radio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Critical path analysis; 4; 3",
            "Boundary value analysis 1; 0; 9",
            "Boundary value analysis 2; 1; 0",
            "Boundary value analysis 3; 8; 7",
            "Boundary value analysis 4; 9; 8",
    }, delimiter = ';')
    void setPrevStation(String nameTest, int oldCurrentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(oldCurrentStation);
        radio.prevStation();
        Assertions.assertEquals(radio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Critical path analysis; 6; 7",
            "Boundary value analysis 1; 0; 1",
            "Boundary value analysis 2; 1; 2",
            "Boundary value analysis 3; 9; 10",
            "Boundary value analysis 4; 10; 10",
    }, delimiter = ';')
    void setNextVolume(String nameTest, int oldCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(oldCurrentVolume);
        radio.nextVolume();
        Assertions.assertEquals(radio.getCurrentVolume(), expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Critical path analysis; 4; 3",
            "Boundary value analysis 1; 0; 0",
            "Boundary value analysis 2; 1; 0",
            "Boundary value analysis 3; 9; 8",
            "Boundary value analysis 4; 10; 9",
    }, delimiter = ';')
    void setPrevVolume(String nameTest, int oldCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(oldCurrentVolume);
        radio.prevVolume();
        Assertions.assertEquals(radio.getCurrentVolume(), expected);
    }
}