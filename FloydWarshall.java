public class FloydWarshall {

    int V;
    static int INF = 99999;

    public FloydWarshall(int V) {
        this.V = V;
    }

    void floydWarshall(int G[][]) {
        int D[][] = new int[V][V];
        int i, j, k;
        //initializare matrice
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                D[i][j] = G[i][j];
            }
        }
        //algoritmul
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (D[i][k] + D[k][j] < D[i][j]) {
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }

        print(D);

    }

    void print (int D[][]){
        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                if (D[i][j]== INF){
                    System.out.print("INF ");
                }
                else {
                    System.out.print(D[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int G[][]= {
                {0, INF, -2, INF},
                {4, 0, 3, INF},
                {INF, INF, 0, 2},
                {INF, -1, INF, 0}
        };
        FloydWarshall a = new FloydWarshall(4);
        a.floydWarshall(G);
    }
}
