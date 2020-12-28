package code._0_activity;

import java.util.Arrays;
import java.util.Scanner;

public class ActivityArray {

    public static void main(String[] args) {
        String[] strings = new String[0];
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter the input: ");
        while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
            strings = Arrays.copyOf(strings, strings.length + 1);
            strings[strings.length - 1] = input;
        }
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}
