import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RomanCalculatorByDTest {

    private RomanCalculatorByD calculator;

    @BeforeEach
    void setUp() {
        calculator = new RomanCalculatorByD();
    }

    @Test
    void shouldReturnRomanWhenArabicIsGiven() {

        assertAll("Should change roman to arabic",
            () -> assertThat(calculator.roman2Arabic("I")).isEqualTo(1),
            () -> assertThat(calculator.roman2Arabic("II")).isEqualTo(2),
            () -> assertThat(calculator.roman2Arabic("III")).isEqualTo(3),
            () -> assertThat(calculator.roman2Arabic("IV")).isEqualTo(4),
            () -> assertThat(calculator.roman2Arabic("V")).isEqualTo(5),
            () -> assertThat(calculator.roman2Arabic("IX")).isEqualTo(9),
            () -> assertThat(calculator.roman2Arabic("X")).isEqualTo(10),
            () -> assertThat(calculator.roman2Arabic("L")).isEqualTo(50),
            () -> assertThat(calculator.roman2Arabic("XL")).isEqualTo(40),
            () -> assertThat(calculator.roman2Arabic("XC")).isEqualTo(90),
            () -> assertThat(calculator.roman2Arabic("C")).isEqualTo(100),
            () -> assertThat(calculator.roman2Arabic("XLIV")).isEqualTo(44),
            () -> assertThat(calculator.roman2Arabic("XCIX")).isEqualTo(99),
            () -> assertThat(calculator.roman2Arabic("CMXCIX")).isEqualTo(999),
            () -> assertThat(calculator.roman2Arabic("MMXX")).isEqualTo(2020),
            () -> assertThat(calculator.roman2Arabic("MCMLIX")).isEqualTo(1959)
        );
    }

    @Test
    void shouldIGive2848() {
        // when
        String roman = "MmdCcCXlViii";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(2848);
    }

    @Test
    void shouldIGiveNullPointerException() {
        // when
        String roman = "MmdaCcCXlVii";
        // then
        assertThrows(NullPointerException.class, () -> calculator.roman2Arabic(roman));
    }
}