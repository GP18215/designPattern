package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Pojo());

        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("Enum.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);

            oos.close();
            fos.close();


            FileInputStream fis = new FileInputStream("Enum.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
