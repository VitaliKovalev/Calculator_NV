package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @BeforeAll
    public static void setUp(){
        System.out.println("Выполняется до теста");
    }
@BeforeEach
public void BeforeEach(){
        System.out.println("Выполняется перед каждым тестом");
}
@AfterAll
public static void AfterAll(){
        System.out.println("После выполнения тестов");
}
@AfterEach
public void AfterEach(){
        System.out.println("После каждого теста");
}


    @Test
    @DisplayName("Проверка суммирования")
        @Tag("Сложение")
    void summ() {
        Calc calc = new Calc ();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Некорректный результат");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка вычитания")
    @Tag("Вычитание")
    void subtract() {
        Calc calc = new Calc ();
        int result = calc.subtract(5,3);
        Assertions.assertEquals(2, result, "Некорректный результат");
    }
    @ParameterizedTest (name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка сложения")
    @Tag ("param")
    void summ(int a, int b, int expectedresult) {
        Calc calc = new Calc ();
        int result = calc.summ(b,a);
        Assertions.assertEquals(expectedresult, result, "Некорректный результат");
    }
    @ParameterizedTest (name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 5, -4", "8, 3, 5", "6, -3, 9"})
    @DisplayName("Проверка вычитания")
    @Tag ("param")
    void subtract(int a, int b, int expectedresult) {
        Calc calc = new Calc ();
        int result = calc.subtract(a, b);
        Assertions.assertEquals(expectedresult, result, "Некорректный результат");
    }
}