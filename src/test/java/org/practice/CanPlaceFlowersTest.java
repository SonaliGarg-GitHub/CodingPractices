package org.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void testCanPlaceFlowersTest() {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        assertTrue(cpf.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertFalse(cpf.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertTrue(cpf.canPlaceFlowers(new int[]{0,0,0,0,0}, 3));
        assertFalse(cpf.canPlaceFlowers(new int[]{1,1,1,1,1}, 1));
    }
}