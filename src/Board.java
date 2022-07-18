public class Board {
    public static int[][] random_state(int height, int width){
        int[][] board = dead_state(height, width);
        for(int x = 0; x < height; x++){
            for(int y= 0; y < width;y++){
                double random_number = Math.random();
                if(random_number > 0.5){
                    board[x][y] = 1;
                }
            }
        }
        return board;
    }
    public static int[][] dead_state(int height, int width){
        int[][] board = new int[height][width];
        for(int x = 0; x < height; x++){
            for(int y = 0; y < width; y++){
                board[x][y] = 0;
            }
        }
        return board;
    }

    public static void renderBoard(int[][] board){
        boolean firstLine = false;
        boolean lastLine = false;
        int length = board.length + 2;
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[x].length; y++){
                if(x == 0 && !firstLine){
                        for(int i = 0; i < board[x].length + 2; i++){
                            System.out.print("-");
                        }
                        firstLine = true;
                        System.out.println();
                    }
                if(y == 0){
                    System.out.print("|");
                    if(board[x][y] == 1){
                        System.out.print("#");
                    }else {
                        System.out.print(" ");
                    }
                }
                else if (y + 1 == board[x].length) {
                    if(board[x][y] == 1){
                        System.out.print("#");
                    }else {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                    if(x + 1 == board.length){
                        lastLine = true;
                    }
                }
                else {
                    if(board[x][y] == 1){
                        System.out.print("#");
                    }else {
                        System.out.print(" ");
                    }
                }
                if(x + 1 == board.length && lastLine){
                    System.out.println();
                    for(int i = 0; i < board[x].length + 2; i++){
                        System.out.print("-");
                    }
                    lastLine = true;
                }
            }
            System.out.println();
        }
    }

//    public static int[][] nextBoardState(int[][] board){
//
//    }
}
