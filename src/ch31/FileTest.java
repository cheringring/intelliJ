package ch31;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileTest {
    public void readFile(String fileName) throws Exception {
        var br = new BufferedReader(new FileReader(fileName));
        // 원 기능에 기능을 더 append함. 파일리더에 버퍼기능을 append
    }


    public static void main(String[] args) {

        var test = new FileTest();
        try {
            test.readFile("co.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

