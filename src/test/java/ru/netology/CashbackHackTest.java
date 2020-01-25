package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackTest {
    @Test
    void shouldReturn100IfAmountIs900() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "CashbackData.csv", numLinesToSkip = 1)
    void shouldCalculateNecessaryAmount(int amount, int expected) {

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}
