package ch32;

import java.io.*;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import  java.io.FileOutputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")))){
//            String str ;
//            while ((str = br.readLine()) != null){
//                System.out.println(str);
//            }
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());

        try (BufferedReader br = new BufferedReader(new FileReader("b.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {

        }
    }
}

