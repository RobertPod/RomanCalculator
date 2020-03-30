import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RomanCalculatorTest {

    private RomanCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new RomanCalculator();
    }

    @Test
    @Tag("shouldIGive1")
    void shouldIGive1() {
        // when
        String roman = "I";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(1);
    }

    @Test
    void shouldIGive2() {
        // when
        String roman = "II";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(2);
    }

    @Test
    void shouldIGive3() {
        // when
        String roman = "III";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(3);
    }

    @Test
    void shouldIGive4() {
        // when
        String roman = "IV";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(4);
    }

    @Test
    void shouldIGive5() {
        // when
        String roman = "V";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(5);
    }

    @Test
    void shouldIGive8() {
        // when
        String roman = "VIII";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(8);
    }

    @Test
    void shouldIGive9() {
        // when
        String roman = "IX";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(9);
    }

    @Test
    void shouldIGive10() {
        // when
        String roman = "X";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(10);
    }

    @Test
    void shouldIGive40() {
        // when
        String roman = "XL";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(40);
    }

    @Test
    void shouldIGive44() {
        // when
        String roman = "XLIV";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(44);
    }

    @Test
    void shouldIGive50() {
        // when
        String roman = "L";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(50);
    }

    @Test
    void shouldIGive90() {
        // when
        String roman = "XC";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(90);
    }

    @Test
    void shouldIGive99() {
        // when
        String roman = "XCIX";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(99);
    }

    @Test
    void shouldIGive100() {
        // when
        String roman = "C";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(100);
    }

    @Test
    void shouldIGive999() {
        // when
        String roman = "CMXCIX";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(999);
    }

    @Test
    void shouldIGive1959() {
        // when
        String roman = "MCMLIX";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(1959);
    }

    @Test
    void shouldIGive2020() {
        // when
        String roman = "MMXX";
        // then
        assertThat(calculator.roman2Arabic(roman)).isEqualTo(2020);
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