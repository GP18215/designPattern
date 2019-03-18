package com.gupaoedu.pattren.prototype.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JingGubang jingGubang;

    public QiTianDaSheng() {
        this.jingGubang = new JingGubang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());

            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }

    }

    public QiTianDaSheng shallowClone(QiTianDaSheng traget){
         QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

         qiTianDaSheng.hieght = this.hieght;
         qiTianDaSheng.weight = this.weight;
         qiTianDaSheng.jingGubang = this.jingGubang;
         qiTianDaSheng.birthday = new Date();
         return  qiTianDaSheng;
    }
}
