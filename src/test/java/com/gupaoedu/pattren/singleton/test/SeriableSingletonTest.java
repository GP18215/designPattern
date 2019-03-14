package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton s1 = null;

        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try{
           fos = new FileOutputStream("SeriableSingleton.obj");
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(s2);
           oos.close();
           fos.close();

           FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
           ObjectInputStream ois = new ObjectInputStream(fis);

           s1 = (SeriableSingleton) ois.readObject();

           System.out.println(s1);
           System.out.println(s2);

           System.out.println(s1 == s2);//false

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
