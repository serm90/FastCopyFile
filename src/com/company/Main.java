package com.company;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;

import java.nio.file.StandardCopyOption;


public class Main extends Profile{

    public static void main(String[] args) throws IOException {

        File source = new File("C://Users//serg-qa//Downloads/tor.txt");

        checkFile(source);//первоначальные проверки

        File newFile = new File("C://Users//serg-qa//Downloads/New/tor12.txt");

         // копирование файла
        Files.copy(source.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Файл успешно скопирован;");

        comparisonFile(source, newFile);//построчна проверка

    }
}





