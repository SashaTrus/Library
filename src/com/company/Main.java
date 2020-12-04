package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Admin admin = new Admin();
        User user = new User();
        Output output = new Output();
        Interaction interaction = new Interaction(admin, user);

        output.outAddBook();
        admin.addNewBook();
        //admin.addNewBook();
        admin.addNewBook();

        //admin.getListOfBooks();

        output.outGetBook();
        interaction.getBook();

        output.outBooksLib();
        admin.getListOfBooks();

        output.outBooksUser();
        user.getListOfBooks();

        output.outRreturnBook();
        interaction.returnBook();

        output.outBooksLib();
        admin.getListOfBooks();

        output.outBooksUser();
        user.getListOfBooks();
    }
}