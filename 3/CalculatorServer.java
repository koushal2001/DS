import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;
import CalculatorModule.*;
import org.omg.CosNaming.NamingContextPackage.*;

public class CalculatorServer{
    public static void main(String args[]){
        try{
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            CalculatorImpl cal= new CalculatorImpl();
            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(cal);
            Calculator h_ref = CalculatorHelper.narrow(ref);

            org.omg.CORBA.Object objref = orb.resolve_initial_references("NameService") ;
            NamingContextExt ncref= NamingContextExtHelper.narrow(objref);

            NameComponent path[]=ncref.to_name("Calculator");
            ncref.rebind(path,h_ref);

            orb.run();


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}