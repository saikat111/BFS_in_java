import java.util.PriorityQueue;
import java.util.Queue;
public class BFS {
    public static void main(String args[]) {
        Queue<Integer> queue = new PriorityQueue<>();
        //BFS
        int node;
        int i = 1;
        int visitedNode[] ={0, 0, 0, 0, 0, 0, 0};
        int adjacency[][] ={
                {0, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0}
        };
        System.out.print(i);
        visitedNode[i] = 1;
        queue.add(i);// exploration
        while (!queue.isEmpty()){
             node = queue.remove();
             for(int j=0;j<7;j++){
                 if(adjacency[node][j] == 1 && visitedNode[j] == 0){
                     System.out.print(j);
                     visitedNode[j] = 1;
                     queue.add(j);
                 }
             }
        }
        System.out.println();
    }
}


