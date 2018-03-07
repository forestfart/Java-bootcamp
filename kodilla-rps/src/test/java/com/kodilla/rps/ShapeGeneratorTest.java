package com.kodilla.rps;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.kodilla.rps.Shapes.*;

public class ShapeGeneratorTest {
    Shapes userShape, generatedShape;
    ShapeGenerator shapeGenerator;
    int paperCount, scissorsCount, stoneCount;

    @Before
    public void setUp() {
        paperCount = scissorsCount = stoneCount = 0;
        shapeGenerator = new ShapeGenerator();
    }

    @Test
    public void testShapeGeneratorWithStone() {
        // Given
        userShape = STONE;

        // When
        for (int i = 0; i < 100000; i++)
            switch (shapeGenerator.generateShape(userShape)) {
                case PAPER:
                    paperCount++;
                    break;
                case STONE:
                    stoneCount++;
                    break;
                case SCISSORS:
                    scissorsCount++;
            }

        // Then
        Assert.assertThat(Math.abs(paperCount-(stoneCount+scissorsCount)), Matchers.lessThan(1000));
    }

    @Test
    public void testShapeGeneratorWithPaper() {
        // Given
        userShape = PAPER;

        // When
        for (int i = 0; i < 100000; i++)
            switch (shapeGenerator.generateShape(userShape)) {
                case PAPER:
                    paperCount++;
                    break;
                case STONE:
                    stoneCount++;
                    break;
                case SCISSORS:
                    scissorsCount++;
            }

        // Then
        Assert.assertThat(Math.abs((paperCount+stoneCount)-scissorsCount), Matchers.lessThan(20000));
    }

    @Test
    public void testShapeGeneratorWithScissors() {
        // Given
        userShape = SCISSORS;

        // When
        for (int i = 0; i < 100000; i++)
            switch (shapeGenerator.generateShape(userShape)) {
                case PAPER:
                    paperCount++;
                    break;
                case STONE:
                    stoneCount++;
                    break;
                case SCISSORS:
                    scissorsCount++;
            }

        // Then
        Assert.assertThat(Math.abs(stoneCount-(paperCount+scissorsCount)), Matchers.lessThan(10000));
    }
}
