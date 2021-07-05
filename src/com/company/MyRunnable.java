package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyRunnable implements Runnable {

    @Override
    public synchronized void run() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        File file = new File("C:\\Users\\Abrams\\IdeaProjects\\Exercise54\\src\\com\\company\\thread.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (int i = 0; i < array.length; i++) {
                bufferedWriter.write(String.valueOf(array[i]));
                bufferedWriter.write(" ");
            }
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Failed to write into file");
        }
    }
}
