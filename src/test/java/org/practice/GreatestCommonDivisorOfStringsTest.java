// File: src/test/java/org/practice/GreatestCommonDivisorOfStringsTest.java
package org.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    @Test
    void testGcdOfStrings() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("ABC", gcd.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", gcd.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", gcd.gcdOfStrings("LEET", "CODE"));
        assertEquals("", gcd.gcdOfStrings("AAAAAB", "AAA"));
        assertEquals("A", gcd.gcdOfStrings("A", "A"));
        assertEquals("", gcd.gcdOfStrings("ABAB", "ABAC"));
    }

    @Test
    void testBothStringsSame() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("XYZ", gcd.gcdOfStrings("XYZ", "XYZ"));
    }

    @Test
    void testOneStringEmpty() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("", gcd.gcdOfStrings("", "ABC"));
        assertEquals("", gcd.gcdOfStrings("ABC", ""));
        assertEquals("", gcd.gcdOfStrings("", ""));
    }

    @Test
    void testOneIsMultipleOfOther() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("AA", gcd.gcdOfStrings("AAAAAA", "AA"));
        assertEquals("ABAB", gcd.gcdOfStrings("ABAB", "ABABABAB"));
    }

    @Test
    void testNoCommonDivisor() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("", gcd.gcdOfStrings("ABCDEF", "XYZ"));
        assertEquals("", gcd.gcdOfStrings("AABBAABB", "AABBCC"));
    }

    @Test
    void testSingleCharacterStrings() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("A", gcd.gcdOfStrings("A", "A"));
        assertEquals("", gcd.gcdOfStrings("A", "B"));
    }

    @Test
    void testDifferentLengthsSamePattern() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("XY", gcd.gcdOfStrings("XYXYXY", "XYXY"));
    }

    @Test
    void testLongStrings() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        String s1 = "A".repeat(1000);
        String s2 = "A".repeat(500);
        assertEquals("A".repeat(500), gcd.gcdOfStrings(s1, s2));
    }

    @Test
    void testEdgeCases() {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        assertEquals("A", gcd.gcdOfStrings("A", "A"));
        assertEquals("", gcd.gcdOfStrings("A", "B"));
        assertEquals("", gcd.gcdOfStrings("A", ""));
    }
}