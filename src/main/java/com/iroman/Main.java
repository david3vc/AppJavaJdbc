package com.iroman;

import com.iroman.dao.ConnectionCore;
import com.iroman.entity.Category;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        ConnectionCore connection = new ConnectionCore();

        connection.getConnection();

        System.out.println("Connection successful!");
    }
}