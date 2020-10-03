import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Knight {
    static int x;
    static int y;
    static int avilable;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Point start = new Point();
        x=5;
        y=5;
        avilable = 0;
        start.x = in.nextInt();
        start.y = in.nextInt();
        in.close();
        int[][] graph = new int[x][y];
        findAWay(start, graph ,1);
        System.out.println(avilable);
    }

    public static void findAWay(Point state,int[][] graph,int step){
        if(graph[state.x][state.y]!=0)return;
        graph[state.x][state.y] = step;
        ArrayList<Point> dest = overLook(state);
        if(step==x*y){
            avilable++;
            for(int i = 0;i<x;i++){
                for(int j = 0;j<y;j++)
                    System.out.print(graph[i][j]+" ");
                System.out.println();
            }
            System.out.println("***********************************************");
        }
        while(dest.size()!=0){
            Point tmp = dest.remove(0);
            findAWay(tmp,graph,step+1);
        }
        graph[state.x][state.y] = 0;
    }

    public static ArrayList<Point> overLook(Point state){
        ArrayList<Point> dest = new ArrayList<Point>();
        Point tmp = new Point(state);
        if ((tmp.x = state.x - 2) >= 0 && (tmp.y = state.y - 1) >= 0) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x - 1) >= 0 && (tmp.y = state.y - 2) >= 0) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x + 1) < x && (tmp.y = state.y - 2) >= 0) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x + 2) < x && (tmp.y = state.y - 1) >= 0) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x + 2) < x && (tmp.y = state.y + 1) < y) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x + 1) < x && (tmp.y = state.y + 2) < y) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x - 1) >= 0 && (tmp.y = state.y + 2) < y) {
            dest.add(new Point(tmp));
        }
        if ((tmp.x = state.x - 2) >= 0 && (tmp.y = state.y + 1) < y) {
            dest.add(new Point(tmp));
        }
        return dest;
    }
}
