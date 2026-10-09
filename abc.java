
class abc {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    boolean compare(abc obj) {
        return this.a == obj.a;
    }
}

class demo {
    public static void main(String[] args) {

        abc obj1 = new abc();
        obj1.setA(10);

        abc obj2 = new abc();
        obj2.setA(10);

        abc obj3 = new abc();
        obj3.setA(20);

        System.out.println("Obj1 and Obj2: " + obj1.compare(obj2));
        System.out.println("Obj1 and Obj3: " + obj1.compare(obj3));
    }
}