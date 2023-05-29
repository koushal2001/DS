import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import StringModule.*;
import java.util.*;


public class StringClient{
    public static void main(String[] args){
        try{
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
            org.omg.CORBA.Object objref = orb.resolve_initial_references("NameService");
            NamingContextExt ncref = NamingContextExtHelper.narrow(objref);

            Operations impl = OperationsHelper.narrow(ncref.resolve_str("Operations"));
            System.out.println("Enter two Strings");
            Scanner sc= new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println(s1+s2); 


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}