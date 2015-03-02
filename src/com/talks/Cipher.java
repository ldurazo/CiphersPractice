package com.talks;

/**
 * Created by ldurazo on 3/1/15.
 */
public interface Cipher {
    String PUBLIC_KEY ="ABCDE";
    String getName();
    String encrypt(String message, final String key);
    String decrypt(String message, final String key);
    String encrypt(String message);
    String decrypt(String message);
}
