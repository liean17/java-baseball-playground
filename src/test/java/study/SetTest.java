package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void setSize(){
        Assertions.assertThat(numbers.size()).isEqualTo(3);
    }
    @ParameterizedTest
    @CsvSource(value = {"1:4","2:5","3:6"},delimiter = ':')
    void isContain(int n, int e){
        int RN = n;
        assertEquals(e,RN);
    }

    @Test
    void 몰라(){
        int[] arr = {1,23,4,5};
        int asd = arr[arr.length-1];
        System.out.println("asd = " + asd);
    }






}
