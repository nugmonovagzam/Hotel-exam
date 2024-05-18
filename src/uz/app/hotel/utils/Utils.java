package uz.app.hotel.utils;

import java.util.Scanner;

public class Utils {
    public static Scanner intScanner = new Scanner(System.in);
    public static Scanner strScanner = new Scanner(System.in);
    public static String getLine(String text){
        System.out.println(text);
        return strScanner.nextLine();
    }
    public static Integer getInt(String text){
        System.out.println(text);
        return intScanner.nextInt();
    }
}
