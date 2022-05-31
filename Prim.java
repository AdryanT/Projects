public class Prim {

    private int V;

    public Prim(int V){
        this.V=V;
    }

    public void prim(int G[][]){
        int[] vecin= new int[V];
        int[] cost = new int[V];
        boolean[] adaugat= new boolean[V];

        for (int i=0; i<V; i++){
            adaugat[i]=false;
            cost[i]=Integer.MAX_VALUE;

        }

        cost[0]=0;
        vecin[0]= -1;

        for(int count =0; count<V-1; count++){
            int u= min(cost, adaugat);
            adaugat[u]= true;


            for (int j=0; j<V; j++){
                if(G[u][j] != 0 && adaugat[j] == false && G[u][j]< cost[j]){
                    vecin[j]=u;
                    cost[j] = G[u][j];
                }
            }
        }
        print (vecin, G);
    }

    public int min ( int[] cost,boolean[] adaugat){
        int min = Integer.MAX_VALUE, min_index=-1;
        for(int i=0; i<V;i++){
            if(adaugat[i]== false && cost[i]<min){
                min = cost[i];
                min_index= i;
            }
        }
        return min_index;
    }

    public void print(int[] vecin, int [][] G){
        System.out.println("Muchia \t Costul ");
        for(int i=1 ; i<V; i++){
            System.out.println((vecin[i]+1) + " - "+ (i+1)+ "\t"+ G[i][vecin[i]]);
        }
    }
    public static void main(String[] args){
        Prim p = new Prim(7);
        int[][]G={
                {0,1,0,4,0,0,0},
                {1,0,2,6,4,0,0},
                {0,2,0,0,5,6,0},
                {4,6,0,0,3,0,4},
                {0,4,5,3,0,8,7},
                {0,0,3,0,5,0,3},
                {0,0,0,4,7,3,0}

        };
        p.prim(G);
    }



}
