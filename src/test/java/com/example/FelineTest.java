package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    public Feline feline;

    @Before
    public void setup(){
        feline = new Feline();
    }

    @Test
    public void felineEatMeatTest() {
        Animal animal = new Animal();
        List<String> animalList = List.of("Животные", "Птицы", "Рыба");
        try {
            feline.eatMeat();
        } catch (Exception e) {
            try {
                animal.getFood("Хищник");
            } catch (Exception exception) {
                Assert.assertEquals(exception.getMessage(), animalList);    //Обработка ошибки
            }
        }
    }

    @Test
    public void felineGetFamilyTest() {
        Assert.assertEquals(feline.getFamily(),"Кошачьи");
    }

    @Test
    public void felineGetKittensTest() {
        Assert.assertEquals(feline.getKittens(),1);
    }
}