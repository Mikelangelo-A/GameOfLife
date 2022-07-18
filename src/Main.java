public class Main {
    public static void main(String[] args) {
        int[][] board = Board.random_state(10,10);
//        System.out.println(Arrays.deepToString(board));
        Board.renderBoard(board);

    }
}