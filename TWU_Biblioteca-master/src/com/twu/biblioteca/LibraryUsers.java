package com.twu.biblioteca;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by abilashr on 5/18/16.
 */
public class LibraryUsers {
    public Boolean initCustomer(String number){
        LinkedHashMap<String,String> customerName=new LinkedHashMap<String, String>();
        LinkedHashMap<String,String> customerEmail=new LinkedHashMap<String, String>();
        LinkedHashMap<String,String> customerPhone=new LinkedHashMap<String, String>();
        customerName.put("111-1111","aaa");
        customerEmail.put("111-1111","aaa@thought.com");
        customerPhone.put("111-1111","9999999999");

        customerName.put("222-2222","bbb");
        customerEmail.put("222-2222","bbb@thought.com");
        customerPhone.put("222-2222","8888888888");

        customerName.put("333-3333","ccc");
        customerEmail.put("333-3333","ccc@thought.com");
        customerPhone.put("333-3333","7777777777");

        customerName.put("444-4444","ddd");
        customerEmail.put("444-4444","ddd@thought.com");
        customerPhone.put("444-4444","6666666666");

        customerName.put("555-5555","eee");
        customerEmail.put("555-5555","eee@thought.com");
        customerPhone.put("555-5555","5555555555");
        if(printDetail(number,customerName,customerEmail,customerPhone))
        {return true;
        }else{
            return false;
        }


    }
    public boolean printDetail(String number, LinkedHashMap<String, String> customerName, LinkedHashMap<String, String> customerEmail, LinkedHashMap<String, String> customerPhone)
    {
        Set set=customerName.entrySet();
        Iterator iterator=set.iterator();

        Set set1=customerEmail.entrySet();
        Iterator iterator1=set1.iterator();

        Set set2=customerPhone.entrySet();
        Iterator iterator2=set2.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,String> print=(Map.Entry<String,String>)iterator.next();
            Map.Entry<String,String> print1=(Map.Entry<String,String>)iterator1.next();
            Map.Entry<String,String> print2=(Map.Entry<String,String>)iterator2.next();
            if (print.getKey().equals(number)) {
                System.out.println("Name: "+print.getValue());
                System.out.println("Email: "+print1.getValue());
                System.out.println("Phone number: "+print2.getValue());
                return true;
            }

        }
        return false;    }
}
