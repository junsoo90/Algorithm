package Algorithm.beakjoon.chapter24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178 {
    static int arr[][];
    static boolean visit[][];
    static int nx[] = {1, -1, 0, 0};
    static int ny[] = {0, 0, 1, -1};
    static int n,m;
    static int level = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        StringTokenizer token = new StringTokenizer(str," ");

        n = Integer.parseInt(token.nextToken());
        m = Integer.parseInt(token.nextToken());

        visit = new boolean[n][m];
        arr = new int[n][m];

        for(int i=0; i<n; i++) {
            String temp = in.readLine();
            for (int j = 0; j < m;j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
                visit[i][j] = false;
            }
        }
        bfs();

        System.out.println(level);
    }

    public static void bfs() {
        Queue<Point> queue = new LinkedList<Point>();
        visit[0][0] = true;

        queue.add(new Point(0,0));

        while(true) {

            int size = queue.size();

            level++;

            for(int k=0; k<size; k++) {
                Point point = queue.poll();
                if(point.x == n-1 && point.y == m-1)
                    return;

                for(int i=0; i<4; i++) {
                    int x = point.x + nx[i];
                    int y = point.y + ny[i];

                    if(x<0 || y<0 || x>=n || y>=m) continue;
                    if(visit[x][y]) continue;
                    if(arr[x][y] == 0) continue;

                    visit[x][y] = true;
                    arr[x][y] = arr[point.x][point.y]+1;
                    queue.add(new Point(x,y));
                }
            }
        }
    }
}


class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
