package Throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        try{
            scanner.nextInt();
        }catch (Exception exception){
            System.out.println("Deu ruim");
        }

        System.out.println("Continuou?");
    }
}
