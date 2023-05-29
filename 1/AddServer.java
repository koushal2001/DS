import java.rmi.*;

public abstract class AddServer{

    public static void main(String args[]){
        try{
            AddServerImpl addserverimpl= new AddServerImpl();
            Naming.bind("AddServer",addserverimpl);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}