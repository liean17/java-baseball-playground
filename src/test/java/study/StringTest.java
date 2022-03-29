package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");

    }
    @Test
    void split(){
        String[] splitNumber = "1,2".split(",");
        assertThat(splitNumber).contains("1","2");
        assertThat(splitNumber).containsExactly("1","2");
    }
    @Test
    void substring(){
        String substr = "(1,2)".substring(1,4);
        assertThat(substr).isEqualTo("1,2");
    }
    @Test
    void chatAt() throws StringIndexOutOfBoundsException{
        int num = "abc".charAt(4);
        
    }
}
