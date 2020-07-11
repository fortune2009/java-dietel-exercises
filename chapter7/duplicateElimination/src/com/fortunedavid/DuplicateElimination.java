package com.fortunedavid;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElimination {
    private ArrayList<Integer> numbers;
    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setFiveNumbers() {
        numbers = new ArrayList<>();
        for(int i=0; i<5; i++) {
            int dig = scanner.nextInt();
            if(dig > 100 || dig < 10) {
                System.out.print("Please enter correct input: ");
                i--;
                continue;
            }
            else {
                Integer bigDig = dig;
                if(!numbers.contains(bigDig)) {
                    numbers.add(i,bigDig);
                }
                else {
                    System.out.printf("This number %d already exist, Try again: ", bigDig);
                    i--;
                    continue;
                }
            }
            if(i != 4){
                for(int view=0; view<numbers.size(); view++)
                    System.out.printf("%s ", numbers.get(view));

                System.out.printf("%nEnter %d more number: ", (5-1)-i);
            }
        }
        System.out.println();
    }

    public ArrayList<Integer> getFiveNumbers() {
        return numbers;
    }

}
