class Grand {
    public void method11() {
        System.out.println("Grand Parent");
    }
}

interface P1 {
    default void method21() {
        System.out.println("Parent 1");
    }
}

interface P2 {
    default void method22() {
        System.out.println("Parent 2");
    }
}

class Kid extends Grand implements P1, P2 {
    void method31() {
        System.out.println("Kid");
        method21();
        method11();
        method22();
    }
}

class Dia {
    public static void main(String args[]) {
        Kid o = new Kid();
        o.method31();
    }
}