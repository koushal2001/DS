import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import CalculatorModule.*;
import java.util.*;
public class CalculatorClient{

    public static void main (String[] args){

       try{ 
        org.omg.CORBA.ORB orb= org.omg.CORBA.ORB.init(args,null);

        org.omg.CORBA.Object objref= orb.resolve_initial_references("NameService");
        NamingContextExt ncref= NamingContextExtHelper.narrow(objref);
        
        Calculator cal= CalculatorHelper.narrow(ncref.resolve_str("Calculator"));

        double d1=10;
        double d2=10;
        System.out.println(cal.sub(d1,d2));
       }
       catch(Exception e){
        e.printStackTrace();
       }


    }
}