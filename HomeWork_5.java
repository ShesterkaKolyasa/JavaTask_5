/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework_5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 467
 */
public class HomeWork_5 {

    public static void main(String[] args){
        System.out.println("РИБО-02-21, Панкратов Максим Максимович, 5 вариант");
        FileUtils fu = new FileUtils();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input file path: ");
        String path = scan.next();
        try {
            System.out.println(fu.infoFromFile(path));
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

