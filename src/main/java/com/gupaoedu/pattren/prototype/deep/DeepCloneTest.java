package com.gupaoedu.pattren.prototype.deep;

public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng q = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆:"+(qiTianDaSheng.jingGubang == q.jingGubang));

            QiTianDaSheng q2 = qiTianDaSheng.shallowClone(new QiTianDaSheng());
            QiTianDaSheng q3 = qiTianDaSheng.shallowClone(q2);

            System.out.println("浅克隆:"+(qiTianDaSheng.jingGubang == q3.jingGubang));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
