package com.talks;

/**
 * Created by ldurazo on 3/1/15.
 */
public interface Cipher {
    String PUBLIC_KEY ="ABCDE";
    public String getName();
    public String encrypt(String message, final String key);
    public String decrypt(String message, final String key);
    public String encrypt(String message);
    public String decrypt(String message);
}
