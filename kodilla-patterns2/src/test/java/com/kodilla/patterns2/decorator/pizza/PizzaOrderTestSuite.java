package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza classic (tomato sauce & cheese)", description);
    }

    @Test
    public void testPizzaWithMushroomsAndCornGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new CornOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), theCost);
    }

    @Test
    public void testPizzaWithMushroomsAndCornGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new CornOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza classic (tomato sauce & cheese) + mushroooms + corn", description);
    }

    @Test
    public void testPizzaWithAllIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseOrderDecorator(theOrder);
        theOrder = new MozzarellaOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new CornOrderDecorator(theOrder);
        theOrder = new OlivesOrderDecorator(theOrder);
        theOrder = new ProsciuttoOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(36), theCost);
    }

    @Test
    public void testPizzaWithAllIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseOrderDecorator(theOrder);
        theOrder = new MozzarellaOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new CornOrderDecorator(theOrder);
        theOrder = new OlivesOrderDecorator(theOrder);
        theOrder = new ProsciuttoOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println("description = " + description);
        //Then
        assertEquals("Pizza classic (tomato sauce & cheese) + additional cheese " +
                "+ mozzarella + mushroooms + corn + olives + prosciutto", description);
    }
}
