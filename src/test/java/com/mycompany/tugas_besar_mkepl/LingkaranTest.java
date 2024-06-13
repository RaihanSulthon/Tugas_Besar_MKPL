package com.mycompany.tugas_besar_mkepl;

import org.junit.Test;

import static org.junit.Assert.*;

public class LingkaranTest {

    Lingkaran lingkaran = new Lingkaran("Sirkel", 14);

    @Test
    public void hitungKeliling() {
        Lingkaran lingkaran = new Lingkaran("Lingkaran A", 7);
        double expectedKeliling = 2 * 3.1416 *7;
        assertEquals(expectedKeliling, lingkaran.hitungKeliling(), 0.001);
    }

    @Test
    public void hitungLuas() {
        assertEquals(615.44, lingkaran.hitungLuas(), 0);
    }
}
