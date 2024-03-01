package junitdemo;

import org.example.DemoUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void setupAfterEach() {
        demoUtils = new DemoUtils();
        System.out.println("@AfterEach");
        System.out.println();
    }


    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("@BeforeAll");
        System.out.println();
    }

    @AfterAll
    static void setupAfterAll() {
        System.out.println("@AfterAll");
    }


    //@DisplayName("Equals and Not Equals")
    @Test
    void test_Equals_And_Not_Equals() {
        System.out.println("Running test : testEqualsAndNotEquals");
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 4), "2+4 must not be 6");

    }

    //@DisplayName("Null and Not Null")
    @Test
    void test_Null_And_Not_Null() {
        System.out.println("Running test : testEqualsAndNotEquals");
        String str1 = null;
        String str2 = "Tamer";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }


    @DisplayName("Same And Not Same")
    @Test
    void testSameAndNotSame() {
        String str = "Tamer";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object Should be to Same Object");
        assertNotSame(str, demoUtils.getAcademy(), "Object Should not refer to Same Object");

    }


    @DisplayName("True and False")
    @Test
    void testTrueAndFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This Should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This Should return false");

    }


    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {
        String[] stringsArray = {"A", "B", "C"};
        assertArrayEquals(stringsArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Array should be the Same");
    }


}
