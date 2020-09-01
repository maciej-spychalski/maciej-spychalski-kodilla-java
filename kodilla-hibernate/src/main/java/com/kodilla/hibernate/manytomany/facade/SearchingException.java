package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {
    public static String ERR_NO_COMPANY = "There are no such company";
    public static String ERR_NO_EMPLOYEE = "There are no such employee";

    public SearchingException(String message) {
        super(message);
    }
}
