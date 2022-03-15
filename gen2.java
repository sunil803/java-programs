class Gen2<A,B>{
    A ob1;
    B ob2;

    Gen2(A a,B b){
        ob1 = a;
        ob2 = b;
    }

    A getA(){
        return ob1;
    }

    B getB(){
        return ob2;
    }

    void showType(){
        System.out.println("Type of A is "+ob1.getClass().getSimpleName());
        System.out.println("Type of B is "+ob2.getClass().getSimpleName());
    }
}

class genobjs2{
    public static void main(String[] args) {
        Gen2<Integer,String> genobj;

        genobj = new Gen2(00,"BMS College");

        int x = genobj.getA();
        System.out.println("int value is "+x);
        String s = genobj.getB();
        System.out.println("String value is "+s);

        genobj.showType();
    }
}