package com.talks;

/**
 * Created by ldurazo on 3/1/15.
 */
public class ROT13Cipher extends CaesarCipher {
    public ROT13Cipher() {
        setShiftSize(13);
    }
}
