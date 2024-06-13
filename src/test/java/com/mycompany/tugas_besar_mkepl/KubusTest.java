package com.mycompany.tugas_besar_mkepl;
import static org.junit.Assert.*;
import org.junit.Test;

public class KubusTest {

    private Kubus kubus = new Kubus(5, "kiub");

    @Test
    public void hitungLuasPermukaan() {
        Lingkaran lingkaran = new Lingkaran("Lingkaran A", 7);
        double expectedLuas = 3.14*7*7;
        assertEquals(expectedLuas, lingkaran.hitungLuas(), 0.001);
    }

    @Test
    public void hitungKeliling(){
        Lingkaran lingkaran = new Lingkaran("Lingkaran A", 7);
        double expectedKeliling = 2*3.14&7;
        assertEquals(expectedLuas, lingkaran.hitungKeliling(), 0.001);
    }

    @Test
    public void hitungVolume() {
        assertEquals(125.0, kubus.hitungVolume(), 0);
    }
}
