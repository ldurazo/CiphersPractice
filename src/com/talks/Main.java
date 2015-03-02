package com.talks;

public class Main {
    private static VigenereCipher vigenereCipher = new VigenereCipher();
    private static CaesarCipher caesarCipher = new CaesarCipher();
    private static ROT13Cipher rot13Cipher = new ROT13Cipher();
//    private static final String MESSAGE_TO_ENCRYPT = "EEEEEEEEEEEEEEEEEEEEE";
    private static final String MESSAGE_TO_ENCRYPT = "A CHUCHITA LA BOLSEARON";
//    private static final String MESSAGE_TO_ENCRYPT = "THIS IS SO WRONG IS WRONG A WRONG";
//    private static final String MESSAGE_TO_ENCRYPT = "THIS IS SO WRONG IS WRONG WRONG";

    public static void main(String[] args) {
        System.out.println("-----------------------VIGENERE CIPHER-----------------------------------");

        String encryptedMessage = vigenereCipher.encrypt(MESSAGE_TO_ENCRYPT, Cipher.PUBLIC_KEY);
        String decryptedMessage = vigenereCipher.decrypt(encryptedMessage, Cipher.PUBLIC_KEY);

        System.out.println("MESSAGE TO ENCRYPT: "+ MESSAGE_TO_ENCRYPT);
        System.out.println("ENCRYPTED: "+encryptedMessage);
        System.out.println("DECRYPTED: "+ decryptedMessage);


        System.out.println("");
        System.out.println("-----------------------CAESAR CIPHER-----------------------------------");

        String caesarEncrypted = caesarCipher.encrypt(MESSAGE_TO_ENCRYPT);
        String caesarDecrypted = caesarCipher.decrypt(caesarEncrypted);

        System.out.println("MESSAGE TO ENCRYPT: "+ MESSAGE_TO_ENCRYPT);
        System.out.println("ENCRYPTED: "+caesarEncrypted);
        System.out.println("DECRYPTED: "+ caesarDecrypted);


        System.out.println("");
        System.out.println("-----------------------ROT13 CIPHER-----------------------------------");

        String rot13Encrypted = rot13Cipher.encrypt(MESSAGE_TO_ENCRYPT);
        String rot13Decrypted = rot13Cipher.encrypt(rot13Encrypted);

        System.out.println("MESSAGE TO ENCRYPT: "+ MESSAGE_TO_ENCRYPT);
        System.out.println("ENCRYPTED: "+rot13Encrypted);
        System.out.println("DECRYPTED: "+ rot13Decrypted);




//        String messageToEncrypt = "KNICKEBEIN KLEVE IST AUF PUNKT DREIUNDFUNFZIG GRAD VIERUNDZWANZIG MINUTEN NORD UND EIN GRAD WEST EINGERICHTET";
//        String firstSend = VigenereCipher.encrypt(messageToEncrypt, Cipher.PUBLIC_KEY);
//        String seconSend = VigenereCipher.encrypt(firstSend, "PRIVATEKEY");
//        String thirdSend = VigenereCipher.decrypt(seconSend, Cipher.PUBLIC_KEY);
//        String fourthSend = VigenereCipher.decrypt(thirdSend, "PRIVATEKEY");
//        System.out.println(firstSend);
//        System.out.println(seconSend);
//        System.out.println(thirdSend);
//        System.out.println(fourthSend);

    }
}
