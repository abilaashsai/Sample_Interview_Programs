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
        booksAvailable.put("The Shawshank Redemption (1994), Director: Frank Darabont, Rating:9.3/10",true);
        booksAvailable.put("The Godfather (1972), Director: Francis Ford Coppola, Rating:9.2/10",true);
        booksAvailable.put("The Godfather: Part II (1974), Director: Francis Ford Coppola, Rating:9.0/10",true);
        booksAvailable.put("The Dark Knight (2008), Director: Christopher Nolan, Rating:9.0/10",true);
        booksAvailable.put("Schindler's List (1993), Director: Steven Spielberg, Rating:8.9/10",true);
        booksAvailable.put("12 Angry Men (1957), Director: Sidney Lumet, Rating:8.9/10",true);
        booksAvailable.put("Pulp Fiction (1994), Director: Quentin Tarantino, Rating:8.9/10",true);
        booksAvailable.put("The Lord of the Rings: The Return of the King (2003), Director: Peter Jackson, Rating:8.9/10",true);
        booksAvailable.put("The Good, the Bad and the Ugly (1966), Director: Sergio Leone, Rating:8.9/10",true);
        booksAvailable.put("Fight Club (1999), Director: David Fincher, Rating:8.9/10",true);
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
