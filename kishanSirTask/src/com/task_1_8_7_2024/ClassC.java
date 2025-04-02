package com.task_1_8_7_2024;

public class ClassC {
    public static void main(String[] args) {
        ClassC cobj = new ClassC();
        cobj.meth1();
        System.out.println("------------------------");
        cobj.meth2();
        System.out.println("------------------------");
        cobj.meth3();
        System.out.println("------------------------");
        cobj.meth4();

    }

    void meth1() {
        System.out.println("meth1() called");
        int x = 7, y = 3;
        boolean isEqual = x == y;
        boolean isGreaterThan = x > y;
        boolean isLessThan = x < y;
        boolean isNotEqual = x != y;

        System.out.println("Is Equal : " + isEqual);
        System.out.println("Is Greater Than : " + isGreaterThan);
        System.out.println("Is Less Than : " + isLessThan);
        System.out.println("Is Not Equal : " + isNotEqual);

    }

    void meth2() {

        System.out.println("meth2() called");

        boolean p = true, q = false;
        boolean logicalAnd = p && q;
        boolean logicalOr = p || q;
        boolean logicalNotP = !p;
        boolean logicalNotQ = !q;

        System.out.println("Logical AND : " + logicalAnd);
        System.out.println("Logical OR : " + logicalOr);
        System.out.println("Logical NOT of P : " + logicalNotP);
        System.out.println("Logical NOT of Q : " + logicalNotQ);


    }

    void meth3() {
        int a = 10;
        int b = 5;

        //Assginment Operators

        int equalAssignment = a;
        int additionAssignment = a += b; //Eqivalent to : a=a+b;
        int substractionAssignment = a -= b;  //Eqivalent to : a=a-b;
        int multiplicationlAssignment = a *= b; //Eqivalent to : a=a*b;
        int divisionAssignment = a /= b;  //Eqivalent to : a=a/b;

        System.out.println("Equal Assignment : " + equalAssignment);
        System.out.println("additionAssignment : " + additionAssignment);
        System.out.println("Substraction Assignment : " + substractionAssignment);
        System.out.println("additionAssignment : " + multiplicationlAssignment);
        System.out.println(" divisionAssignment : " + divisionAssignment);


    }

    void meth4() {
        System.out.println("meth4() called");

        boolean a = true, b = false, c = true, d = false;

        boolean flag1 = (a && b) && (c || d);
        boolean flag2 = (a || b) && (c || d);
        boolean flag3 = !(a && b) || !(c && d);

        boolean flag4 = a && (b || (c && d));
        boolean flag5 = (a && b) || (c && d);

        System.out.println("flage1 : " + flag1);
        System.out.println("flage2 : " + flag2);
        System.out.println("flage3 : " + flag3);
        System.out.println("flage4 : " + flag4);
        System.out.println("flage5 : " + flag5);


    }

}