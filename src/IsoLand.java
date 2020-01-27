import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class IsoLand {
    public static void main(String[] args) {

        int[][] grid = new int[][]{{},{},{},{}};
        boolean[][] visited = new boolean[10][10];

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1) {
                    count++;
                    DFS(grid, i, j, visited);
                }
            }
        }


        System.out.println(count);

    }

    private static void DFS(int[][] matrix, int i, int j, boolean[][] visited) {

        if (i < 0 || i > matrix.length || j < 0 || j < matrix.length || !visited[i][j] || matrix[j][i] == 0) {
            return;
        }
        matrix[i][j] = 0;
        DFS(matrix, i + 1, j, visited);
        DFS(matrix, i - 1, j, visited);
        DFS(matrix, i, j + 1, visited);
        DFS(matrix, i, j - 1, visited);

    }


}
