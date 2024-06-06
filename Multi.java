interface Parent1 {
    default void method1() {
        System.out.println("Parent 1");
    }
}

interface Parent2 {
    default void method2() {
        System.out.println("Parent 2");
    }
}

class Chd implements Parent1, Parent2 {
    void method3() {
        method1();
        method2();
    }
}

class Multi {
    public static void main (String args[])
    {
        Chd ob=new Chd();
        ob.method3();
    }
}