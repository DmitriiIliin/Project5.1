
package ru.netology.projectcyle.projectcyclemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.projectcyle.projectcyclemvn.services.CountService;

public class CountServiceTest {
    @Test
    public void testOne() {
        CountService service = new CountService();
        // Начальные данные:
        int threshold = 150000; // сумма, достаточная для отдыха
        int income = 100000;    // доход
        int expenses = 60000;   // расходы
        int expected = 2;        // ожидаемое число месяцев отдыха в год
        //(в Мaine была бы = count)

        // Вызываю метод:
        // actual - фактический (рассчитанный) результат
        // actual в Мaine  тоже была бы = count
        int actual = service.calculate(threshold, income, expenses);

        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void testSecond(){
            CountService service = new CountService();
            // Начальные данные:
            int threshold = 20000; // сумма, достаточная для отдыха
            int income = 10000;    // доход
            int expenses = 3000;   // расходы
            int expected =3;        // ожидаемое число месяцев отдыха в год
            //(в Мaine была бы = count)

            // Вызываю метод:
            // actual - фактический (рассчитанный) результат
            // actual в Мaine  тоже была бы = count
            int actual  = service.calculate(threshold, income, expenses);

            //System.out.println(count);
            Assertions.assertEquals(expected, actual);
    }
}