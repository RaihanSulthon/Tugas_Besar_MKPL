package com.mycompany.tugas_besar_mkepl;

import org.junit.Test;

import static org.junit.Assert.*;

public class LingkaranTest {

    Lingkaran lingkaran = new Lingkaran("Sirkel", 14);

    @Test
    public void hitungKeliling() {
        Lingkaran lingkaran = new Lingkaran("Lingkaran A", 7);
        double expectedKeliling = 2*3.14*7;
        assertEquals(expectedKeliling, lingkaran.hitungKeliling(), 0.001);
    }

    @Test
    public void hitungLuas() {
        Lingkaran lingkaran = new Lingkaran("Lingkaran A", 7);
        double expectedLuas = 3.14*7*7;
        assertEquals(expectedLuas,lingkaran.hitungLuas(),0.001);
    }
}
