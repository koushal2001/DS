import java.rmi.*;

public class AddClient{
    public static void main(String args[]){
        try{
            String addserverurl="rmi://"+args[0]+"/AddServer";
            AddServerInf addserverinf= (AddServerInf)Naming.lookup(addserverurl);
            double d1=Double.valueOf(args[1]).doubleValue();
            double d2=Double.valueOf(args[2]).doubleValue();

            System.out.println("The sum is "+addserverinf.add(d1,d2));

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}