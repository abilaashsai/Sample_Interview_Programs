package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class BibliotecaApp {

    public static void main(String[] args) {
        boolean flag=true;
        int exitStatus=4;
        int input=exitStatus;
        PrintStatement printStatement = new PrintStatement();
        printStatement.printWelcomeStatement();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Boolean> books=new LinkedHashMap<String, Boolean>();
        BookDetails bookDetails = new BookDetails();
        books=bookDetails.initBooks();

        do{
        try {
                printStatement.printMainMenu();
                input = Integer.parseInt(bufferedReader.readLine());

        switch (input) {
            case 1:
                bookDetails.booksAvailable(books);
                break;
            case 2:
                books=bookDetails.bookCheckout(books);
                break;

            case 3:
                bookDetails.bookReturn(books);
                break;

            case 4:
                flag = false;
                break;
            default:printStatement.printValidInput();

        }
        } catch (IOException e) {
            System.out.print("invalid input");

        }
    }while(flag);


    }


}
