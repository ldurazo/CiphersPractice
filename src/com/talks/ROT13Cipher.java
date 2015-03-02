package com.talks;

/**
 * Created by ldurazo on 3/1/15.
 */
public class ROT13Cipher extends CaesarCipher {

    public static final String ROT13_CIPHER = "ROT13";

    public ROT13Cipher() {
        setShiftSize(13);
    }

    @Override
    public String decrypt(String message) {
        return super.encrypt(message);
    }

    @Override
    public String getName() {
        return ROT13_CIPHER;
    }

}
