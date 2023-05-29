import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.PortableServer.*;
import StringModule.*;

public class StringServer{
    public static void main(String[] args){
        try{
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            StringImpl impl = new StringImpl();

            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(impl);
            Operations h_ref= OperationsHelper.narrow(ref);

            org.omg.CORBA.Object objref= orb.resolve_initial_references("NameService"); 
            NamingContextExt ncref= NamingContextExtHelper.narrow(objref);

            NameComponent path[]= ncref.to_name("Operations");
            ncref.rebind(path,h_ref);

            orb.run();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}