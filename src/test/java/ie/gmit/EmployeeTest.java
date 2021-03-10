//  Jack Sheridan
//  G00326495
//  LabExam
//  10-03-21

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee s1;

    @BeforeEach
    void init() { s1 = new Employee("Jack Sheridan", "12345"); }

//    @Test
//    void testName() {
//        Employee employee = new Employee(String, String);
//        assertEquals();
//    }

    @Test
    void testNameFalse() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Jack", "12345"));
        assertEquals("Invalid name", e.getMessage());
    }


    @Test
    void testIdFalse() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Jack Sheridan", "1234"));
        assertEquals("Invalid id", e.getMessage());
    }
}
