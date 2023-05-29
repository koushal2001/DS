import java.util.*;

public class TokenRing{

    public static void main(String[] args){
    try{
        System.out.println("Enter The number of Nodes : ");
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();

        System.out.println("The Ring Topology is as Follows :");
        for(int i=0;i<nodes;i++){
            System.out.print(i+" -> ");
        }
        System.out.print("0\n");
        int choice =1;
        int token =0;
        while(choice ==1){
            System.out.println("Enter the Sender");
            int sender = sc.nextInt();
            System.out.println("Enter the Receiver");
            int receiver = sc.nextInt();
            System.out.println("Enter the Data");
            int data = sc.nextInt();
            for(int i=token;i!=sender;i=(i+1)%nodes){
                System.out.println("Token passed from "+i+" to "+(i+1)%nodes);
            }
            System.out.println("Sender found, Sending the data : "+ data);

            for(int i=sender;i!=receiver;i=(i+1)%nodes){
                System.out.println("Token with data passed from "+i+" to "+(i+1)%nodes);
            }
            System.out.println("Receiver Recieved the data : "+data);

            token = sender;
            System.out.print("Enter 1 to continue ");
            choice = sc.nextInt();
        }

    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}