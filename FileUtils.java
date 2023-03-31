/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_5;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author 467
 */
public class FileUtils {
    
    public File[] infoFromFile(String path) throws FileNotFoundException, IOException{
        File mainFolder = new File(path);
        File listOfFiles[] = mainFolder.listFiles();
        File[] listOfDirectories = new File(path).listFiles(File::isDirectory);
//        if (listOfDirectories != null){
//            System.out.println(listOfDirectories);
//            for(int i=0; i<listOfDirectories.length; i++){
//                path = listOfDirectories[i].getPath();
//                infoFromFile(path);
//            }
//        }
        for(int i=0; i<listOfFiles.length; i++) {
            if(listOfFiles[i].isFile()){
                System.out.println(listOfFiles[i] + " " + listOfFiles[i].length());
            }else{
                System.out.println(listOfFiles[i] + " folder");
            }
        }
        if (listOfDirectories != null){
//            System.out.println(listOfDirectories);
            for(int i=0; i<listOfDirectories.length; i++){
                path = listOfDirectories[i].getPath();
                infoFromFile(path);
                //System.out.println(listOfFiles[i] + " folder" );
            }
        }
        return listOfFiles;
    }
}
