class A {
    int a, b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum() {
        return a + b;
    }
}

class B extends A {
    int c;

    B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    // method overriding
    int sum() {
        return super.sum() + c;
    }

    public static void main(String[] args) {
        B obj = new B(1, 2, 3);
        System.out.println(obj.sum());
    }
}
