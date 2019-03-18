package com.gupaoedu.pattren.prototype.deep;

import java.io.Serializable;

public class JingGubang implements Serializable {

    double h = 100;
    double d = 20;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
