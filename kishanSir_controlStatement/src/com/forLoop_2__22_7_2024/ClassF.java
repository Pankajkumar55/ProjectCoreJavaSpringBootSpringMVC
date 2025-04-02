package com.forLoop_2__22_7_2024;

public class ClassF {
    public static void main(String[] args) {
        ClassF f = new ClassF();
        f.meth1();
        f.meth2();
        f.meth3();
        f.meth4();
        f.meth5();
        f.meth6();
        f.meth7();
        f.meth8();
        f.meth9();

    }

    void meth1() {
        System.out.println("--------meth1()--------");
        for (int i = 1; i < 5; i++) {
            System.out.println(" i value : " + i);
        }
        System.out.println("meth1() called");
    }

    void meth2() {
        System.out.println("--------meth2()--------");
        for (int i = 1; i < 10; ++i) {
            System.out.println(" i value : " + i);
            i++;
        }
        System.out.println("meth2() called");
    }

    void meth3() {
        System.out.println("--------meth3()--------");
        int j = 5;
        for (int i = 1; i < 5; i++) {
            for (; j >= 0; j--) {
                System.out.println(i + " " + j);
            }
            System.out.println("meth3() called");
        }

    }

    void meth4() {
        System.out.println("--------meth4()--------");
        for (int i = 1; i < 5; ) {
            for (int j = 5; j >= 1; i++, j--) {
                System.out.println(i + " " + j);
            }
            System.out.println("--------------");
        }
        System.out.println("meth4() called");
    }

    int meth5() {
        System.out.println("--------meth5()--------");
        return 'A';
    }

    void meth6() {
        System.out.println("----------------");
    }

    void meth7() {
        System.out.println("---------meth7()-----------");
        for (int i = new ClassF().meth5() - 64; i < 5; new ClassF().meth6()) {
            System.out.println("i value : " + i);
            i++;

        }
        System.out.println("meth7() called");

    }

    void meth8() {
        int i = 1;
        for (System.out.println("-----meth8()"),System.out.println("-------") ; i <= 5;){
            System.out.println("i value : " + i);
        }
        System.out.println("meth8() called");

    }

    void meth9() {
        System.out.println("-------meth9()--------");
        int i = 1;
        for (; ; ) {
            System.out.println("i value : " + i++);
            break;
        }
        System.out.println("meth9() called");
    }

}
