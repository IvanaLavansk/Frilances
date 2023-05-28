package ru.netology.services.free.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreeService;

public class FreeServiceTest {
    @Test
    public void WhenVacation() {
        FreeService service = new FreeService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

}