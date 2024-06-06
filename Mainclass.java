class Parent {
    void methodparent() {
        System.out.println("Hi I am Parent Class");
    }
}

class Child extends Parent {
    void methodchild() {
        System.out.println("Hi I am Child Class");
    }
}

class Mainclass {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.methodparent();
        obj.methodchild();
    }
}
