package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("--------------------------------------------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("--------------------------------------------------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(43210));
        System.out.println(numberToWords(56789));





    }
    public static boolean  isPalindrome(int sayi){
        String sayiStr = String.valueOf(Math.abs(sayi));
        String reversedSayiStr = "";
        for (int i = 0; i < sayiStr.length(); i++) {
            reversedSayiStr = sayiStr.charAt(i) + reversedSayiStr;
        }

        return reversedSayiStr.equals(sayiStr);
    }
    public static boolean isPerfectNumber(int sayi){
        int bolenler=0;
        for(int i = 1; i<=sayi/2 ; i++){
            if(sayi%i==0){
                bolenler = bolenler + i;
            }
        }
        return bolenler == sayi;
    }
    public static String numberToWords(int sayi){
        String result = "";
        while(!(sayi <0)){
            String sayiSTR = String.valueOf(sayi);
            for(int i = 0 ; i<sayiSTR.length();i++){
                switch (sayiSTR.charAt(i)){
                    case '0':
                        result = result + "Zero ";
                        break;
                    case '1':
                        result = result + "One ";
                        break;
                    case '2':
                        result = result + "Two ";
                        break;
                    case '3':
                        result = result + "Three ";
                        break;
                    case '4':
                        result = result + "Four ";
                        break;
                    case '5':
                        result = result + "Five ";
                        break;
                    case '6':
                        result = result + "Six ";
                        break;
                    case '7':
                        result = result + "Seven ";
                        break;
                    case '8':
                        result = result + "Eight ";
                        break;
                    case '9':
                        result = result + "Nine ";
                        break;
                }
            }
            return result.trim();
        }
        return "Invalid Value";
    }
}
