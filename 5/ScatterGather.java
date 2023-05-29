import mpi.MPI;
import mpi.*;
import java.util.*;

public class ScatterGather{
    public static void main(String[] args) {
        MPI.Init(args);
        int size=MPI.COMM_WORLD.Size();
        int rank=MPI.COMM_WORLD.Rank();

        int unitsize=5;
        int root=0;

        int nums[]=new int[unitsize*size];
        int recv_nums[]=new int[unitsize];
        int final_nums[]=new int[size];

        if(rank==root){
            for(int i=1;i<=unitsize*size;i++){
                nums[i-1]=i;
            }

        }

        MPI.COMM_WORLD.Scatter(
            nums,
            0,
            unitsize,
            MPI.INT,
            recv_nums,
            0,
            unitsize,
            MPI.INT,
            root
        );

        for(int i=1;i<unitsize;i++){
            recv_nums[0]+=recv_nums[i];
        }
        System.out.println("Intermediate output at process "+rank+" is "+recv_nums[0]);
        MPI.COMM_WORLD.Gather(
            recv_nums,
            0,
            1,
            MPI.INT,
            final_nums,
            0,
            1,
            MPI.INT,
            root
        );

        if(rank==root){
            int finalsum=0;
            for(int i=0;i<size;i++){
                finalsum+=final_nums[i];
            }
            System.out.println("Final sum is "+ finalsum);
        }

        MPI.Finalize();

    }
}
