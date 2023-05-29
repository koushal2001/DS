import StringModule.OperationsPOA;

public class StringImpl extends OperationsPOA{

    StringImpl(){
        super();
        System.out.println("String Object Created");
    }

    public String concat(String s1, String s2){
        return s1+s2;
    }
}