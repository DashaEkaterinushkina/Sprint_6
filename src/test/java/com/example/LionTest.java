package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;
    @Mock
    private Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        lion = new Lion("Самка", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString()); }

    @Test
    public void lionExceptionTest(){
        try{
            new Lion("Используйте допустимые значения пола животного - самей или самка", feline);
        }catch (Exception ex) {
            System.out.println("Проверено исключение");
        }
    }
}