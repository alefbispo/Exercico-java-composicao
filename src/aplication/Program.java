package aplication;

import aplication.entites.Client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter cliente data: ");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
       String email=scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());
        Client client = new Client(name,email,birthDate);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");




        scanner.close();
    }
}
