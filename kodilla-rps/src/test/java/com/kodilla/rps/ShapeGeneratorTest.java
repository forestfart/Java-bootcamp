package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeGeneratorTest {
    String userShape, generatedShape;
    ShapeGenerator shapeGenerator;

    @Before
    public void setUp() {
        shapeGenerator = new ShapeGenerator();
    }

    @Test
    public void testShapeGeneratorWithStone() {
        // When
        userShape = "stone";
        generatedShape = shapeGenerator.generateShape(userShape);

        // Then
        Assert.assertTrue(generatedShape.length() > 4);
    }

    @Test
    public void testShapeGeneratorWithPaper() {
        // When
        userShape = "paper";
        generatedShape = shapeGenerator.generateShape(userShape);

        // Then
        Assert.assertTrue(generatedShape.length() > 4);
    }
    @Test
    public void testShapeGeneratorWithScissors() {
        // When
        userShape = "scissors";
        generatedShape = shapeGenerator.generateShape(userShape);

        // Then
        Assert.assertTrue(generatedShape.length() > 4);
    }
}
