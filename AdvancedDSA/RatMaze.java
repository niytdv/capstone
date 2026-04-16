public class RatMaze {
    static int N = 4;

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int[][] solution = new int[N][N];

        if (solveMaze(maze, solution, 0, 0)) {
            printSolution(solution);
        } else {
            System.out.println("No solution found");
        }
    }

    static boolean solveMaze(int[][] maze, int[][] solution, int x, int y) {

        if (x == N - 1 && y == N - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            solution[x][y] = 1;

            if (solveMaze(maze, solution, x + 1, y)) {
                return true;
            }

            if (solveMaze(maze, solution, x, y + 1)) {
                return true;
            }

            solution[x][y] = 0; // backtrack
        }

        return false;
    }

    static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    static void printSolution(int[][] solution) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
