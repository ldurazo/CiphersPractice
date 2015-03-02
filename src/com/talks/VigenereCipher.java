package com.talks;

public class VigenereCipher implements Cipher {

    public static final String VIGENERE_CIPHER = "VIGENERE";

    @Override
    public String getName() {
        return VIGENERE_CIPHER;
    }

    /**
     *
     * @param message is the message to encrypt.
     * @param key is the key to encrypt.
     * @return the message encrypted.
     */
    @Override
    public String encrypt(String message, final String key){
        String encryptedMessage = "";
        message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++) {
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
            encryptedMessage += (char) (((c + key.charAt(j) - 2 * 'A') % 26) + 'A');
            j = ++j % key.length();
        }
        return encryptedMessage;
    }

    /**
     *
     * @param message is the encrypted message to decrypt.
     * @param key is the key used for decryption.
     * @return the decrypted message.
     */
    @Override
    public String decrypt(String message, final String key) {
        String encryptedMessage = "";
        // Self explanatory upper case, to be able to perform char operations.
        message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++) {
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
            encryptedMessage += (char) (((c - key.charAt(j) + 26) % 26) + 'A');
            j = ++j % key.length();
        }
        return encryptedMessage;
    }

    @Override
    public String encrypt(String message) {
        return encrypt(message, PUBLIC_KEY);
    }

    @Override
    public String decrypt(String message) {
        return decrypt(message, PUBLIC_KEY);
    }
}
