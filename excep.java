import java.util.*;

class WrongAge extends Exception{
    public int SonAge,FatherAge;
    WrongAge(int FatherAge){
        System.out.println("WrongAge(FatherAge) exception is handled");
        System.exit(0);
    }
    WrongAge(int SonAge,int FatherAge){
        System.out.println("WrongAge(SonAge,FatherAge) exception is handled");
    }
}

class Father{
    int fage;
    Father(int fage){
        try {
            // WrongAge Wa = new WrongAge(age);
            if(fage<0)
            throw new WrongAge(fage);
            this.fage=fage;
        }
        catch (WrongAge e){
            System.out.println("Father age cannot be negative");
        }
    }
}
class Son extends Father{
    int sage;
    Son(int sage,int fage){
        super(fage);
        this.sage=sage;
        try{
            if(sage>fage){
                throw new WrongAge(sage,fage);
            }
        }catch(WrongAge e){
            System.out.println("Son age cannot be greater than Father age!");
        }
    }
}

class agecheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fage,sage;
        System.out.println("Enter father age");
        fage = sc.nextInt();
        Father father = new Father(fage);

        System.out.println("Enter son age");
        sage = sc.nextInt();
        Son son = new Son(sage,fage);
        
    }
}