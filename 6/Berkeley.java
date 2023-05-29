import java.util.*;

class Process{
    int processID;
    long clockOffSet;

    public Process(int i){
        this.processID=i;
        this.clockOffSet=0;
    }

    public void synchronizeClocks(List<Process> processes){
        int numofprocesses=0;
        int sumofoffsets=0;

        for(Process process : processes){
            if(this.processID != process.processID){
            try{
                long localtime= System.currentTimeMillis();
                Random random= new Random();
                int n=random.nextInt(10);
                Thread.sleep(n*100);
                long remoteTime = process.gettime();
                long diff= remoteTime-localtime;
                sumofoffsets+=diff;
                numofprocesses++;
            }
            catch(Exception e){
                e.printStackTrace();
            }
            }
        }
        if(numofprocesses>0){
            long avgoffset=sumofoffsets/numofprocesses;
            updateClock(avgoffset);
        }
    }

    public long gettime(){
        long val = System.currentTimeMillis();
        return val;
    }

    public void updateClock(long val){
        this.clockOffSet=val;
        System.out.println("Clock Time Updated by : "+ clockOffSet +" for machine/process "+ processID);

    }
    
}


public class Berkeley{
    public static void main(String[] args){
        System.out.println("Enter The Number of Machines/Processes\n");
        Scanner sc= new Scanner(System.in);

        int num =sc.nextInt();

        List<Process> processes = new ArrayList<>();

        for(int i=1;i<=num;i++){
            Process process= new Process(i);
            processes.add(process);
        }
        for(Process process : processes){
            process.synchronizeClocks(processes);
        }
    }
}