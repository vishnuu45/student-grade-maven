package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGradeA() {
        App app = new App();
        assertEquals("A", app.calculateGrade(95));
    }

    @Test
    public void testGradeFail() {
        App app = new App();
        assertEquals("Fail", app.calculateGrade(30));
    }
}
