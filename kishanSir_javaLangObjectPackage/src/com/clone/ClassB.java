package com.clone;

public class ClassB implements Cloneable // Marker Interface
{
    int a = 100;
    int b = 200;

    public ClassB createClone() throws CloneNotSupportedException {
        ClassB bobj = (ClassB) super.clone();
        return bobj;
    }
}
