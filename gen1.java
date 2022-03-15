class gen<T>{
    T ob;
    gen(T ob){
        this.ob=ob;
    }
    T getob(){
        return ob;
    }
    void showtype(){
        System.out.println("Type of data that given as input is:"+ob.getClass().getSimpleName());
    }
}

class genobjs{
    public static void main(String[] args) {
        gen<Integer> iob;
        gen<String> sob;

        iob = new gen<Integer>(59);
        int v = iob.getob();
        System.out.println("Value of v is:"+v);
        iob.showtype();

        sob = new gen<String>("BMSCE");
        String s = sob.getob();
        System.out.println("Value of the string object is "+s);
        sob.showtype();
    }
}
