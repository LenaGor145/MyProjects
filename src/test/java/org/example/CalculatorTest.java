package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    void testAdd(){
        Calculator calculator = new Calculator();// создаем объект калькулятора
        assertNotEquals(10, calculator.add(10,20));// не соответствует чему
    }
    @Test
    void testSubstract() {
        Calculator calculator = new Calculator();// создаем объект калькулятора
        assertEquals(30, calculator.substract(50,20),"2 + 3 should equal 5");// assertEquals сравнивает что ожидается
    }
    @Test
    void shouldDivideCorrectly(){
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.devide(9,3));
        assertThrows(IllegalArgumentException.class, () -> {//Я ожидаю, что при вызове devide(12, 0) будет выброшено IllegalArgumentException"
            calculator.devide(12, 0);
        });

    }
    @Test
    void testDivideByZeroMessage() {
        Calculator calculator = new Calculator();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calculator.devide(12, 0);
        });

        assertEquals("На ноль делить нельзя", ex.getMessage());
    }
    @Test
    void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(150, calculator.multiplication(3,50));
        assertEquals(0, calculator.multiplication(3,0));
    }


    }

