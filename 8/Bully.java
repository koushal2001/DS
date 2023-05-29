import java.util.*;

class Process{
    int processID;
    boolean isActive;
    boolean isCoordinator;

    public Process(int i){
        this.processID=i;
        this.isActive=true;
        this.isCoordinator=false;
    }

    public void election(List<Process> processes){
        int highestID=0;
        for(Process process : processes){
            if(process.processID > highestID){
                highestID=process.processID;
            }
        }
        if(processID==highestID){
            isCoordinator=true;
            announceCoordinator();
        }
        else{
            for(Process process : processes){
                if(process.processID > processID){
                    sendelectionmessage(process);
                }
            }
        }


    }

    public void announceCoordinator(){
        System.out.println(processID + " Process is the coordinator");
    }

    public void sendelectionmessage(Process process){
        if(process.isCoordinator){
            System.out.println(process.processID+" is already the coordinator ");
        }
        
        System.out.println(processID + " sends election message to "+process.processID);
        if(process.isActive){
            process.sendresponse(processID);
        }
    }
    public void sendresponse(int id){
        System.out.println("Process "+id+" received response from "+ processID);
    }
}

public class Bully{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Processes\n");
        int num = sc.nextInt();
        List<Process> processes = new ArrayList<>();
        for(int i=1;i<=num;i++){
            Process process= new Process(i);
            processes.add(process);
        }
        System.out.println("Enter The process to be made inactive : ");
        num=sc.nextInt();

        for(Process process : processes){
            if(process.processID==num){
                process.isActive=false;
            }
        }

        for(Process process : processes){
            process.election(processes);
        }




    }
}