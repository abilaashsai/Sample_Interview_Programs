package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testinitBooks(){
        LinkedHashMap<String,Boolean> books=new LinkedHashMap<String, Boolean>();
        BookDetails bookDetails=new BookDetails();
        books=bookDetails.initBooks();
    }

    @Test
    public void testSearchBook() {
        LinkedHashMap<String,Boolean> books=new LinkedHashMap<String, Boolean>();
        BookDetails bookDetails=new BookDetails();
        books.put("JAVA",true);
        assertTrue(bookDetails.searchBook("JAVA",books));

    }

    @Test
    public void testReturnValid(){
        LinkedHashMap<String,Boolean> books=new LinkedHashMap<String, Boolean>();
        BookDetails bookDetails=new BookDetails();
        books.put("JAVA",true);
        assertFalse(bookDetails.validBookReturn("JAVA",books));

    }

    }
