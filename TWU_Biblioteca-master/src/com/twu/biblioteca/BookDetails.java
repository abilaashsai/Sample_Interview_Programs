package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by abilashr on 5/18/16.
 */
public class BookDetails {

    public LinkedHashMap<String, Boolean> initBooks(){
        LinkedHashMap<String,Boolean> booksAvailable=new LinkedHashMap<String, Boolean>();
        booksAvailable.put("JAVA",true);
        booksAvailable.put("C",true);
        booksAvailable.put("C++",true);
        booksAvailable.put("C#",true);
        booksAvailable.put("Python",true);
        return booksAvailable;
    }
    public void booksAvailable(LinkedHashMap<String,Boolean> books)
    {
        Set set=books.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Boolean> print=(Map.Entry<String,Boolean>)iterator.next();
            if(print.getValue())
                System.out.println(print.getKey());

        }
    }
    public void booksToReturn(LinkedHashMap<String,Boolean> books)
    {
        Set set=books.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Boolean> print=(Map.Entry<String,Boolean>)iterator.next();
            if(!print.getValue())
                System.out.println(print.getKey());

        }
    }
    public void bookReturn(LinkedHashMap<String,Boolean> books) {
        PrintStatement printStatement=new PrintStatement();
        BookDetails bookDetails=new BookDetails();
        bookDetails.booksToReturn(books);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        printStatement.enterBookName();
        try {
            boolean flag=true;
            do {
                String input = bufferedReader.readLine();
                boolean check = bookDetails.validBookReturn(input,books);
                if (check) {
                    books.put(input,true);
                    printStatement.returnSuccess();
                    flag=false;
                } else {
                    printStatement.bookNotFound();

                }
            }while (flag);
        }
        catch (IOException e){
            System.out.println("Enter valid input");
        }

    }

    public LinkedHashMap<String,Boolean> bookCheckout(LinkedHashMap<String,Boolean> books)
    {
        PrintStatement printStatement=new PrintStatement();
        printStatement.availableBooks();
        BookDetails bookDetails=new BookDetails();
        bookDetails.booksAvailable(books);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean flag=true;
            do {
                printStatement.enterBookName();
                String input = bufferedReader.readLine();
                boolean check = bookDetails.searchBook(input,books);
                if (check) {
                    books.put(input,false);
                    printStatement.checkoutSuccess();
                    flag=false;
                } else {
                    printStatement.bookNotFound();

                }
            }while (flag);
        }
        catch (IOException e){
            System.out.println("Enter valid input");
        }


        return books;

    }

    public boolean searchBook(String input,LinkedHashMap<String,Boolean> books)
    {
        Set set=books.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Boolean> print=(Map.Entry<String,Boolean>)iterator.next();
            if(print.getValue()) {
                if (print.getKey().equals(input)) {
                    return true;

                }
            }
        }
        return false;

    }
    public boolean validBookReturn(String input,LinkedHashMap<String,Boolean> books)
    {
        Set set=books.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Boolean> print=(Map.Entry<String,Boolean>)iterator.next();
            if(!print.getValue()) {
                if (print.getKey().equals(input)) {

                    return true;

                }
            }
        }
        return false;

    }
}
