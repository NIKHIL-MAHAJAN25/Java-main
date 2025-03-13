import java.util.Scanner;
public class graphmatrix {
    private int[][] adjacencymatrix;
    private int numvertices;
    public graphmatrix(int numvertices)
    {
        this.numvertices=numvertices;
        adjacencymatrix=new int[numvertices][numvertices];
    }
    public void addedge(int i,int j)
    {
        if(i>=0 && i<numvertices && j>=0 && j<numvertices)
        {
            adjacencymatrix[i][j]=1;
            adjacencymatrix[j][i]=1; //for undirected graph
            
        }
    }
    public void deletedge(int i,int j)
    {
        if(i>=0 && i<numvertices && j>=0 && j<numvertices)
        {
            adjacencymatrix[i][j]=0;
            adjacencymatrix[j][i]=0; //for undirected graph
        }
    }
    public void printmatrix()
    {
        for(int i=0;i<numvertices;i++)
        {
            for(int j=0;j<numvertices;j++)

            {
                System.out.println(adjacencymatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

public static void main(String[] args)
{
    graphmatrix gr=new graphmatrix(5);
    gr.addedge(0, 1);
    gr.addedge(0, 2);
    gr.addedge(1, 2);
    gr.addedge(2, 3);
    gr.addedge(4, 4);
    gr.addedge(4, 3);
    gr.addedge(4, 2);
    gr.addedge(4, 1);
    gr.addedge(4, 0);
    System.out.println("adjancy matrix:");
    gr.printmatrix();
}
}

