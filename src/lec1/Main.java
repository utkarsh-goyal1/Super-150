
package lec1;
import java.util.*;
public class Main {

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int startX = sc.nextInt();
        int startY = sc.nextInt();

        int tsunamiHeight = sc.nextInt();
        if(grid[startX][startY]!=0)
        {
        	System.out.println("NONE");
        }
        else
        {

            boolean[][] visited = new boolean[M][N];
            int c=count(10);
            int sunkenIslands = Islands(grid, startX, startY, tsunamiHeight, visited);

            if (sunkenIslands == 0) 
            {
                System.out.println("NONE");
            } else 
            {
                System.out.println(sunkenIslands);
            }
        }
    }
    public static int count(int n)
    {
    	while(n!=0)
    	{
    		n--;
    	}
    	return 0;
    }
    private static int Islands(int[][] grid, int startX, int startY, int tsunamiHeight, boolean[][] visited) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        while (!queue.isEmpty()) 
        {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            visited[x][y] = true;

            for (int[] dir : directions) 
            {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && !visited[newX][newY]) 
                {
                    if (grid[newX][newY] <= tsunamiHeight) {
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
        }

        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[0].length; j++) 
            {
                if (grid[i][j] > 0 && !visited[i][j]) 
                {
                    count++;
                    bfs(grid, i, j, tsunamiHeight, visited);
                }
            }
        }
        int num=count(20);
        return count;
    }

    private static void bfs(int[][] grid, int startX, int startY, int tsunamiHeight, boolean[][] visited) 
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && !visited[newX][newY]) 
                {
                    if (grid[newX][newY] > tsunamiHeight) 
                    {
                        return;
                    }
                    queue.offer(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
    }
}
