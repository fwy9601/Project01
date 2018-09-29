package cn.fan.bean;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    public static String str;
    /**
     * 1
     */
    private int a = 0;
     
    public static void main(String[] args) {
        System.out.println("helloworld!!");
        Date date = new Date();

        ArrayList<String> list = new ArrayList<>();
//      list.add()

    }

    public void method() {
        try {
            new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
