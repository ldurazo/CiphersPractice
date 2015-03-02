package com.talks;

/**
 * Created by ldurazo on 3/1/15.
 */
public class CipherFactory {
    public static Cipher createCipher(String cipherName){
        switch (cipherName){
            case VigenereCipher.VIGENERE_CIPHER:
                return new VigenereCipher();
            case ROT13Cipher.ROT13_CIPHER:
                return new ROT13Cipher();
            case CaesarCipher.CAESAR_CIPHER:
                return new CaesarCipher();
            default:
                return null;
        }
    }
}
