package com.fortunedavid;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTransaction {
    private static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    private static void openFile() {
        try{
            output = new Formatter("trans.txt");
        }
        catch (SecurityException securityException){
            System.err.println("Write permission denied. Terminating");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
    }

    private static void addRecords() {
        Scanner record = new Scanner(System.in);
        System.out.printf("%s %s%n%s%n? ", "Enter Account Number", "and Amount",
                "Use the end-of-file indicator to end input");
        while(record.hasNext()){
            try{
                output.format("%d %.2f%n", record.nextInt(), record.nextDouble());
            }
            catch (FormatterClosedException formatterClosedException){
                System.err.println("Error writing file. Terminating");
                break;
            }
            catch (NoSuchElementException noSuchElementException){
                System.err.println("Invalid input. Terminating");
                record.nextLine();
            }
            System.out.print("? ");
        }
    }

    private static void closeFile() {
        if(output != null){
            output.close();
        }
    }
}
