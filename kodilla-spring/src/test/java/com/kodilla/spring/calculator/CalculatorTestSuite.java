package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculatorAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 1;
        double b = 2;
        System.out.print(a + " + " + b + " = ");
        double results = calculator.add(a, b);
        //Then
        Assert.assertEquals(3, results, 0.0);
    }

    @Test
    public void testCalculatorSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5;
        double b = 1.5;
        System.out.print(a + " - " + b + " = ");
        double results = calculator.sub(a, b);
        //Then
        Assert.assertEquals(3.5, results, 0.0);
    }

    @Test
    public void testCalculatorMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 2.5;
        double b = 3;
        System.out.print(a + " * " + b + " = ");
        double results = calculator.mul(a, b);
        //Then
        Assert.assertEquals(7.5, results, 0.001);
    }

    @Test
    public void testCalculatorDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 10;
        double b = 4;
        System.out.print(a + " / " + b + " = ");
        double results = calculator.div(a, b);
        //Then
        Assert.assertEquals(2.5, results, 0.001);
    }
}
