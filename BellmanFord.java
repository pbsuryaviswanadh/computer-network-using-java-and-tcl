import java.util.Scanner;
 
public class BellmanFord
{
    private int dist[];
    private int no_ver;
    public static final int MAX_VALUE = 999;
 
    public BellmanFord(int no_ver)
    {
        this.no_ver = no_ver;
        dist = new int[no_ver + 1];
    }
 
    public void BellmanFordEvaluation(int source, int adjmatrix[][])
    {
        for (int node = 1; node <= no_ver; node++)
        {
            dist[node] = MAX_VALUE;
        }
 
        dist[source] = 0;
        for (int node = 1; node <= no_ver - 1; node++)
        {
            for (int srcnode = 1; srcnode <= no_ver; srcnode++)
            {
                for (int destnode = 1; destnode <= no_ver; destnode++)
                {
                    if (adjmatrix[srcnode][destnode] != MAX_VALUE)
                    {
                        if (dist[destnode] > dist[srcnode] 
                                + adjmatrix[srcnode][destnode])
                            dist[destnode] = dist[srcnode]
                                + adjmatrix[srcnode][destnode];
                    }
                }
            }
        }
 
        for (int srcnode = 1; srcnode <= no_ver; srcnode++)
        {
            for (int destnode = 1; destnode <= no_ver; destnode++)
            {
                if (adjmatrix[srcnode][destnode] != MAX_VALUE)
                {
                    if (dist[destnode] > dist[srcnode]
                           + adjmatrix[srcnode][destnode])
                        System.out.println("The Graph contains negative egde cycle");
                }
            }
        }
 
        for (int vertex = 1; vertex <= no_ver; vertex++)
        {
            System.out.println("distance of source  " + source + " to "
                      + vertex + " is " + dist[vertex]);
        }
    }
 
    public static void main(String args[])
    {
        int no_ver = 0;
        int source;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the number of vertices");
        no_ver = scanner.nextInt();
 
        int adjmatrix[][] = new int[no_ver + 1][no_ver + 1];
        System.out.println("Enter the adjacency matrix");
        for (int srcnode = 1; srcnode <= no_ver; srcnode++)
        {
            for (int destnode = 1; destnode <= no_ver; destnode++)
            {
                adjmatrix[srcnode][destnode] = scanner.nextInt();
 	        if (srcnode == destnode)
                {
                    adjmatrix[srcnode][destnode] = 0;
                    continue;
                }
                if (adjmatrix[srcnode][destnode] == 0)
                {
                    adjmatrix[srcnode][destnode] = MAX_VALUE;
                }
            }
        }
 
        System.out.println("Enter the source vertex");
        source = scanner.nextInt();
 
        BellmanFord bellmanford = new BellmanFord(no_ver);
        bellmanford.BellmanFordEvaluation(source, adjmatrix);
        scanner.close();	
    }
}

