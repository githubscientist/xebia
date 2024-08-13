class A {
    constructor(a, b) {
        this.a = a;
        this.b = b;
    }

    sum() {
        return this.a + this.b;
    }
}

class B extends A {
    constructor(a, b, c) {
        // calling the parent class constructor
        super(a, b);
        this.c = c;
    }

    sum() {
        // calling the parent class method
        return super.sum() + this.c;
    }
}

const obj = new B(1, 2, 3);

console.log(obj.sum()); // 3