package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animal;
    private final List<String> foodList;

    public AnimalTest(List<String> foodList, String animal) {
        this.animal = animal;
        this.foodList = foodList;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] data() {
        return new Object[][]{
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"},
                {List.of("Трава", "Различные растения"), "Травоядное"},
                {List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник"), "Млекопитающее"}
         };
    }

    @Test
    public void checkGetFoodAnimalTest() {
        Animal animals = new Animal();
        animals.getFamily();
        try {
            String.valueOf(animals.getFood(animal)).toString();
        } catch (Exception ex) {
            try {
                String.valueOf(animals.getFood(animal)).toString();
            } catch (Exception exception) {
                System.out.println(ex.getMessage());
            }
        }
    }
}