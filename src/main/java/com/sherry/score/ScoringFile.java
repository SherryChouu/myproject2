package com.sherry.score;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            System.out.println(data);
            data = fileReader.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("檔案讀取失敗");
        } catch (IIOException e){
            System.out.println("資料讀取失敗");
        }
        System.out.println("Testing");
        }
    }