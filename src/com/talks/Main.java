package com.talks;

public class Main {
//    private static final String MESSAGE_TO_ENCRYPT = "EEEEEEEEEEEEEEEEEEEEE";
    private static final String MESSAGE_TO_ENCRYPT = "A CHUCHITA LA BOLSEARON";
//    private static final String MESSAGE_TO_ENCRYPT = "THIS IS SO WRONG IS WRONG A WRONG";
//    private static final String MESSAGE_TO_ENCRYPT = "THIS IS SO WRONG IS WRONG WRONG";

    public static void main(String[] args) {
        Cipher cipher = CipherFactory.createCipher(VigenereCipher.VIGENERE_CIPHER);
        System.out.println("-----------------------"+cipher.getName()+" CIPHER-----------------------------------");

        String encryptedMessage = cipher.encrypt(MESSAGE_TO_ENCRYPT, Cipher.PUBLIC_KEY);
        String decryptedMessage = cipher.decrypt(encryptedMessage, Cipher.PUBLIC_KEY);

        System.out.println("MESSAGE TO ENCRYPT: "+ MESSAGE_TO_ENCRYPT);
        System.out.println("ENCRYPTED: "+encryptedMessage);
        System.out.println("DECRYPTED: "+decryptedMessage);


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
