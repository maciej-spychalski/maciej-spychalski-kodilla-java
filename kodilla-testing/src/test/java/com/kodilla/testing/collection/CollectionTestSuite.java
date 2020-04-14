package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> allNumber = new ArrayList<>();
        //When
        ArrayList<Integer> rightNumber = OddNumbersExterminator.exterminate(allNumber);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(rightNumber.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> allNumber = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            allNumber.add(i);
        }
        //When
        ArrayList<Integer> rightNumber = OddNumbersExterminator.exterminate(allNumber);
        System.out.println("Testing OddNumberExterminator method");
        //Then
        boolean isProperElement;
        for (int i = 0; i < rightNumber.size(); i++) {
            isProperElement = rightNumber.get(i) % 2 == 0;
            Assert.assertTrue(isProperElement);
        }
    }
}

// Zadanie: kolekcjonujemy figury (i testujemy to!)
//
// Celem zadania jest przetestowanie klasy, którą musisz napisać, o nazwie — powiedzmy — ShapeCollector, przy
// następujących założeniach:
//
// Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt
// (oczywiście użyj angielskich nazw klas).
// Wszystkie figury implementują interfejs Shape, który musisz przygotować. Zawiera on dwie metody:
//      jedna zwraca nazwę figury ("square", "triangle" oraz "circle"),
//      a druga zwraca obliczone pole powierzchni tej figury.
// Klasy figur implementują interfejs Shape.
// Klasa ShapeCollector ma trzy metody:
//      jedną dodającą figurę do kolekcji,
//      drugą usuwającą figurę z kolekcji,
//      trzecią pobierającą z kolekcji figurę z pozycji n listy.
//
// Aby przygotować rozwiązanie zadania:
//
// W katalogu src/main/java utwórz pakiet com.kodilla.testing.shape.
// W stworzonym pakiecie utwórz interfejs Shape, zawierający dwie metody: getShapeName() oraz getField().
// Utwórz klasy reprezentujące poszczególne figury — posiadające już właściwe implementacje metod interfejsu.
// Utwórz klasę ShapeCollector z metodami: addFigure(Shape shape), removeFigure(Shape shape), getFigure(int n) oraz
// showFigures().
// W katalogu src/test/java utwórz pakiet com.kodilla.testing.shape.
// Stwórz w tym pakiecie klasę testową (zbiór testów) ShapeCollectorTestSuite.
// Napisz testy sprawdzające metody klasy ShapeCollector.
