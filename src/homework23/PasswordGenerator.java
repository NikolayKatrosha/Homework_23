package homework23;


import java.util.Random;




// Теоретически, можно создать базу данных, в которой случайный сгенерированный пароль будет запоминаться в массив.
// И если новый пароль совпадет с тем, что в массиве, то он не будет действительным))



public class PasswordGenerator{
    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

    private static char[] generatePassword(int length) {
        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String underscore = "_";
        String numbers = "1234567890";
        String allSymbols = upperLetters + lowerLetters + underscore + numbers;
        Random random = new Random();
        char[] password = new char[8];
        for(int i = 0; i< length ; i++) {
            password[i] = allSymbols.charAt(random.nextInt(allSymbols.length()));
        }
        return password;
    }
}