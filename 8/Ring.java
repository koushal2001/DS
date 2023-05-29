import java.util.*;

class Process{
    int processID;
    boolean isActive;
    boolean isCoordinator;
    Process nextProcess;

    public Process(int i){
        this.processID=i;
        this.isActive=true;
        this.isCoordinator=false;
    }

    public void election(List<Process> processes){     
        if(isCoordinator){
            System.out.println(processID+" is already the coordinator ");
            return;
        }
        sendelectionmessage(processID,processes);
    }

    public void sendelectionmessage(int initiatorid, List<Process> processes){
        
        if(initiatorid==nextProcess.processID){
            System.out.println("Election Message reaches to Initiator : "+initiatorid);
            Process coordinator=gethighestpriority(processes);
            nextProcess.announceCoordinator(coordinator);
            return;
        }
        System.out.println(processID+ " forwards the election message to : "+ nextProcess.processID);
        nextProcess.sendelectionmessage(initiatorid,processes);
    }
    public Process gethighestpriority(List<Process> activelist){
        Process coordinator=null;
        int highestid=0;
        for(Process process : activelist){
            if(process.processID>highestid){
                highestid=process.processID;
                coordinator=process;
            }
        }
        return coordinator;
    }
    public void announceCoordinator(Process coordinator){
        System.out.println("Process "+coordinator.processID+" is elected as the coordinator");
    }

    
    public void sendresponse(int id){
        System.out.println("Process "+id+" received response from "+ processID);
    }
}

public class Ring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Processes\n");
        int num = sc.nextInt();
        List<Process> processes = new ArrayList<>();
        for(int i=0;i<num;i++){
            Process process= new Process(i);
            processes.add(process);
        }
        for(int i=0;i<num;i++ ){
            Process current= processes.get(i);
            Process nextprocess=processes.get((i+1)%num);
            current.nextProcess=nextprocess;
        }
        

        Process initiator= processes.get(0);
        initiator.election(processes);
        

    }
}