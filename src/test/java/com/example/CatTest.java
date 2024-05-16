package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {
    public Feline feline;
    public Cat cat;

    Predator predator;

    @Before
    public void setup(){
        feline = new Feline();
        cat = new Cat(feline);
    }
    @Test
    public void getSoundTest() {
        try {
            cat.getFood();
        } catch (Exception e) {
            try {
                predator.eatMeat();
            } catch (Exception ex) {
                System.out.println("Обработано искдючение");
            }
        }
    }

    @Test
    public void getFoodTest() {
        Assert.assertEquals(cat.getSound(), "Мяу");
    }
}