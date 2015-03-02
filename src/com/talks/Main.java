package com.talks;

public class Main {
//    private static final String MESSAGE_TO_ENCRYPT = "EEEEEEEEEEEEEEEEEEEEE";
    private static final String MESSAGE_TO_ENCRYPT = "Lorem ipsum dolor sit amet id officiis pertinacia mediocritatem";
//    private static final String MESSAGE_TO_ENCRYPT = "THIS IS SO WRONG IS WRONG A A WRONG";
//    private static final String MESSAGE_TO_ENCRYPT = "THIS IS SO WRONG IS WRONG WRONG";

    public static void main(String[] args) {
        Cipher cipher = CipherFactory.createCipher(ROT13Cipher.ROT13_CIPHER);
        System.out.println("-----------------------"+cipher.getName()+" CIPHER-----------------------------------");

        String encryptedMessage = cipher.encrypt(MESSAGE_TO_ENCRYPT, Cipher.PUBLIC_KEY);
        String decryptedMessage = cipher.decrypt(encryptedMessage, Cipher.PUBLIC_KEY);

        System.out.println("MESSAGE TO ENCRYPT: "+ MESSAGE_TO_ENCRYPT);
        System.out.println("ENCRYPTED: "+encryptedMessage);
        System.out.println("DECRYPTED: "+decryptedMessage);


//        System.out.println("ASYMMETRIC KEYS");
//        String firstSend = cipher.encrypt(MESSAGE_TO_ENCRYPT, Cipher.PUBLIC_KEY);
//        String secondSend = cipher.encrypt(firstSend, "PRIVATEKEY");
//        String thirdSend = cipher.decrypt(secondSend, Cipher.PUBLIC_KEY);
//        String fourthSend = cipher.decrypt(thirdSend, "PRIVATEKEY");
//        System.out.println(firstSend);
//        System.out.println(secondSend);
//        System.out.println(thirdSend);
//        System.out.println(fourthSend);

    }
}
