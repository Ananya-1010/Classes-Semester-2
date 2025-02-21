public class ratsinmazeExper {
        public static void solveMaze(int[][] maze, int x, int y, String path) {
            if (x == maze.length - 1 && y == maze[0].length - 1) {
                System.out.println("Path found: " + path);
                return;
            }
            if (maze[x][y] == 0 || maze[x][y] == 2) {
                return;
            }

            maze[x][y] = 2;
    
            if (x > 0) {
                solveMaze(maze, x - 1, y, path + "U");
            }
            if (x < maze.length - 1) {
                solveMaze(maze, x + 1, y, path + "D");
            }
            if (y > 0) {
                solveMaze(maze, x, y - 1, path + "L");
            }
            if (y < maze[0].length - 1) {
                solveMaze(maze, x, y + 1, path + "R");
            }
            maze[x][y] = 1;
        }
    
        public static void main(String[] args) {
            int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 1, 0},
                {0, 1, 1, 1}
            };
    
            solveMaze(maze, 0, 0, "");
        }
    }

