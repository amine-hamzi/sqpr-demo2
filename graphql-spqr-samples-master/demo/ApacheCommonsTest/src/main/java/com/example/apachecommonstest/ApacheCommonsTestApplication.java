package com.example.apachecommonstest;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ApacheCommonsTestApplication {

    public static void main(String[] args) {

        /*System.out.print("Get abbreviation of string : ");
        String val  = StringUtils.abbreviate("Delft", 4);
        System.out.println(val);
        System.out.print("Capitalize string : ");
        val  = StringUtils.capitalize("delft");
        System.out.println(val);
        System.out.print("Chop string : ");
        val  = StringUtils.chop("delft");
        System.out.println(val);
        System.out.print("Compare two strings : ");
        int a  = StringUtils.compare("Del","Delee");
        System.out.println(a);
        System.out.print("find substring in string : ");
        boolean b  = StringUtils.contains("delft", "ft");
        System.out.println(b);
        System.out.print("Find index of a char in string : ");
        int c  = StringUtils.indexOf(val,'f');
        System.out.println(c);
        System.out.print("Find last index of a char in string : ");
        int d  = StringUtils.lastIndexOf("delftstack",'t');
        System.out.println(d);
        System.out.print("Lowercase string : ");
        val  = StringUtils.lowerCase("DELFSTACK");
        System.out.println(val);
        System.out.print("Repeat string : ");
        val  = StringUtils.repeat("DELF", 2);
        System.out.println(val);
        System.out.print("Reverse string : ");
        val  = StringUtils.reverse("Delft");
        System.out.println(val);
        System.out.print("Truncate string : ");
        val  = StringUtils.truncate("Delft",2);
        System.out.println(val);
        System.out.print("Uppercase string : ");
        val  = StringUtils.upperCase("Delft");
        System.out.println(val);*/

        /*List<String> list1 = Arrays.asList("s4","s2","s3");
        List<String> list2 = Arrays.asList("s6","s2","s3");
        List<String> list3 = CollectionUtils.collate(list1, list2);
        for(String s : list3)
        System.out.println(s);*/

        /*Customer customer1 = new Customer(1, "Daniel", new Address("locality1", "city1"));
        Customer customer2 = new Customer(2, "Fredrik", new Address("locality2", "city2"));
        Customer customer3 = new Customer(3, "Kyle", new Address("locality3", "city3"));
        Customer customer4 = new Customer(4, "Bob", new Address("locality4", "city4"));
        Customer customer5 = new Customer(5, "Cat", new Address("locality5", "city5"));
        Customer customer6 = new Customer(6, "John", new Address("locality6", "city6"));

        List<Customer> list1 = Arrays.asList(customer1, customer2, customer3);
        Collection<Address> addressCol = CollectionUtils.collect(list1,
                new Transformer<Customer, Address>() {
                    public Address transform(Customer customer) {
                        return customer.getAddress();
                    }
                });
        for(Address s : addressCol)
            System.out.println(s.city);*/

    }
    /*public static class Customer {
        private Integer id;
        private String name;
        private Address address;

        public Customer(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public Address getAddress() {
            return address;
        }

        // standard getters and setters
    }

    public static class Address {
        private String locality;
        private String city;

        public Address(String locality, String city) {
            this.locality = locality;
            this.city = city;
        }

        // standard getters and setters
    }*/
}

