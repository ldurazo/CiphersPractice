package com.talks;
/**
 * Created by ldurazo on 3/1/15.
 */
public class CaesarCipher implements Cipher{
    public static final String CAESAR_CIPHER = "CAESAR";

    @Override
    public String getName() {
        return CAESAR_CIPHER;
    }

    protected int shiftSize = 3;

    protected int getShiftSize() {
        return shiftSize;
    }

    protected void setShiftSize(int shiftSize) {
        this.shiftSize = shiftSize;
    }

    @Override
    public String encrypt(String message) {
        String encryptedMessage = "";
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            //We get the char of the message at i position.
            char c = message.charAt(i);

            //If there is a symbol different from the alphabet, we skip adding the char unless
            //blank space is found.
            if(c==' '){
                encryptedMessage+=c;
                continue;
            }
            if ((c < 'A' || c > 'Z')) {
                continue;
            }
            encryptedMessage += (char) (((c + getShiftSize() - 'A') % 26) + 'A');
        }
        return encryptedMessage;
    }

    @Override
    public String decrypt(String message) {
        String encryptedMessage = "";
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            //We get the char of the message at i position.
            char c = message.charAt(i);

            //If there is a symbol different from the alphabet, we skip adding the char unless
            //blank space is found.
            if(c==' '){
                encryptedMessage+=c;
                continue;
            }
            if ((c < 'A' || c > 'Z')) {
                continue;
            }
            encryptedMessage += (char) (((c - getShiftSize() - 'A') % 26) + 'A');
        }
        return encryptedMessage;
    }

    @Override
    public String encrypt(String message, String key) {
        return encrypt(message);
    }

    @Override
    public String decrypt(String message, String key) {
        return decrypt(message);
    }
}
