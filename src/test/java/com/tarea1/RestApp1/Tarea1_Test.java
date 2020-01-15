package com.tarea1.RestApp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tarea1_Test {

    @Test
    void calculateGradeTest() {
        assertEquals("Grade: D", Tarea1.calculateGrade(12));
        assertEquals("Not a Valid Grade Number", Tarea1.calculateGrade(-5));
        assertEquals("Grade: C", Tarea1.calculateGrade(49));
        assertEquals("Grade: B", Tarea1.calculateGrade(59));
        assertEquals("Grade: A", Tarea1.calculateGrade(74));
        assertEquals("Grade: O", Tarea1.calculateGrade(100));
        assertEquals("Not a Valid Grade Number", Tarea1.calculateGrade(101));
    }
}