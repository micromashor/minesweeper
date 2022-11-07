public class MinesweeperGame {
        public class Mine {
                public int data;
                public boolean isHidden() {
                        return false;
                }
                public boolean reveal() {

                }
        }

        private int[][] grid;

        public MinesweeperGame(int rows, int cols, int mine_count) {
                grid = new int[rows][cols];

                for (int x = 0; x < grid.length; x++) {
                        for (int y = 0; y < grid[0].length; y++) {
                                grid[x][y] = 0;
                        }
                }
        }

        /* Accepts coordinates (x, y) and returns whether the box is already touched */
        public boolean reveal(int x, int y) {
                return false;
        }

        /* Accepts coordinates (x, y) and returns whether a flag is set on that space */
        public boolean setFlag(int x, int y) {
                return true;
        }
}
