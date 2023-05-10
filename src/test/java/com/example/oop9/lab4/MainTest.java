package com.example.oop9.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main main;
  @BeforeEach
  void setUp() {
        main = new Main();
  }
  @ParameterizedTest
  @CsvSource({
          "0, 0.2",
           "175, 0.9",
            "450, 2.0"
  })
    void testMadeArrayOfX(int index, double w){
      double[] x = main.madeArrayOfX(Main.start, Main.finish, Main.step);
      assertEquals(w, x[index],1e-6);
  }

  @ParameterizedTest
  @CsvSource({
          "0, -1.8423992928315016",
          "175, 0.6094155175576891",
          "450, 1.402861146402831"
  })
  void testMadeArrayOfY(int index, double w){
      double[] x = main.madeArrayOfX(Main.start, Main.finish, Main.step);
      double[] y = main.madeArrayOfY(x);
      assertEquals(w,y[index],1e-6);
  }

    @Test
    void testCountSteps() {
        assertEquals(451, main.сountSteps(0.2, 2.0, 0.004));
  }
    @Test
    void testMinElement() {
        double[] array = new double[] {1, 2.5, 3.425, -4.097, 5, 6.32, 7, 8.01, 9, 0.00004};
        assertEquals(3, main.minElement(array));
    }
    @Test
    void testMaxElement() {
        double[] array = new double[] {1, 2.5, 3.425, 4.097, 5, 6.32, 7, 8.01, 9, 0.00004};
        assertEquals(8, main.maxElement(array));
    }
    @Test
    void testSumElements() {
      double[] array = new double[] {1, 2.5, 3.425, 4.097, 5, 6.32, 7, 8.01, 9, 0.00004};
    assertEquals(46.35204, main.sumElements(array),1e-6);
    }
    @Test
    void testArifSumElements() {
        double[] array = new double[] {1, 2.5, 3.425, 4.097, 5, 6.32, 7, 8.01, 9, 0.00004};
        assertEquals(4.635204, main.arifSumElements(array));
    }
}