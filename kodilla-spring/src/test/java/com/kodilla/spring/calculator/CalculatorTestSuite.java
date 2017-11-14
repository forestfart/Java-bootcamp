package com.kodilla.spring.calculator;

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
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sumResult = calculator.add(1.0,2.0);
        double subResult = calculator.sub(2.2, 1.1);
        double mulResult = calculator.mul(2,3);
        double divResult = calculator.div(4,2);

        //Then
        Assert.assertEquals(3.0, sumResult, 0.01);
        Assert.assertEquals(1.1, subResult, 0.01);
        Assert.assertEquals(6, mulResult, 0.01);
        Assert.assertEquals(2, divResult, 0.01);
    }
}
