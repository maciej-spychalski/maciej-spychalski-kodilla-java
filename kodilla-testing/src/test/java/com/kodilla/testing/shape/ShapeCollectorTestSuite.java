package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        testCounter++;
        System.out.printf("Test %s has been completed\n", testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals("Triangle", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals("Square", shapeCollector.getFigure(1).getShapeName());
        Assert.assertEquals("Circle", shapeCollector.getFigure(2).getShapeName());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //When
        boolean resultTriangle = shapeCollector.removeFigure(triangle);
        boolean resultSquare = shapeCollector.removeFigure(square);
        boolean resultCircle = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(resultTriangle);
        Assert.assertTrue(resultSquare);
        Assert.assertTrue(resultCircle);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals("Triangle", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals("Square", shapeCollector.getFigure(1).getShapeName());
        Assert.assertEquals("Circle", shapeCollector.getFigure(2).getShapeName());
    }

}
