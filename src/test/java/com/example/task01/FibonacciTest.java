package com.example.task01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Błażej on 2017-07-10.
 */
public class FibonacciTest {

 Fibonacci fibonacci = new Fibonacci();


 @Test
 public void shouldReturnZeroForZero(){
     Assert.assertEquals(0,fibonacci.fibonacci(0));


 }
    @Test
    public void shouldReturnOneForOneAndTwo(){
        Assert.assertEquals(1,fibonacci.fibonacci(2));
        Assert.assertEquals(1,fibonacci.fibonacci(1));

    }


 @Test(expected = IllegalArgumentException.class)
    public void factorialNegative(){
     fibonacci.fibonacci(-4);
 }


}