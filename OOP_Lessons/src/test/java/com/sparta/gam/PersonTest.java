package com.sparta.gam;
import com.sparta.gam.SafariPark.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class PersonTest {
    @Test
    @DisplayName("When a person is constructed they have the correct name")
    public void testName() {
        Person p = new Person("Cathy", "French", 35);
        var result = p.getFullName();
        Assertions.assertEquals("Cathy French", result);
    }



    @Test
    @DisplayName("When a person is constructed they have the correct age")
    public void testAge() {
        Person p = new Person("Cathy", "French", 25);
        var result = p.getAge();
        Assertions.assertEquals(25, result);
    }




    @ParameterizedTest
    @DisplayName("Only positive ages can be set")
    @CsvSource({
            "45, 45",
            "0, 0",
            "-1, 20",
            "-5, 20"
    })
    public void setAgeTest(int inputAge, int expectedNewAge) {
        Person p = new Person("Cathy", "French", 20);
        p.setAge(inputAge);
        Assertions.assertEquals(expectedNewAge, p.getAge());
    }

    //TEST SETNUMPASSENGERS ????

}