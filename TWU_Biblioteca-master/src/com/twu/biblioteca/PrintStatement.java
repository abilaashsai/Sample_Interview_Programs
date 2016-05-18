package com.twu.biblioteca;

/**
 * Created by abilashr on 5/18/16.
 */
public class PrintStatement {

    public void printWelcomeStatement() {
        System.out.println("Hello, Welcome to Biblioteca!");
    }

    public void printMainMenu() {
        System.out.println("Main Menu");
        System.out.println("1.List Books");
        System.out.println("2.Checkout");
        System.out.println("3.Return");
        System.out.println("4.Quit");
    }

    public void printValidInput() {
        System.out.println("Select a valid option!");
    }

    public void availableBooks() {
        System.out.println("Available Books");

    }
    public void enterBookName()
    {
        System.out.println("Enter the name of book");

    }
    public void bookNotFound(){
        System.out.println("Entered book does not exist in library");

    }
    public void returnSuccess(){
        System.out.println("Book Successfully returned");

    }
    public void checkoutSuccess(){
        System.out.println("Thank you! Enjoy the book");


    }



}