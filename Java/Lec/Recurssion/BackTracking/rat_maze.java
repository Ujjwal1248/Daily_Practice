import java.util.*;

public class rat_maze{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                maze[i][j] = sc.charAt(j);
            }
        }
        print(maze, 0, 0);
    }
    public static void print(char[][] maze, int cr, int cc){
        if(cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X'){
            return;
        }
        print(maze, cr+1, cc);
        print(maze, cr, cc+1);
        print(maze, cr-1, cc);
        print(maze, cr, cc-1);
    }
}