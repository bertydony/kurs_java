package berty.tictac;

public class CheckIfYouWon {
    private String[][] board;

    public CheckIfYouWon(){
        board=new String[3][3];
    }



    public boolean isWon(String xOrO) {
        for (int wiersz = 0; wiersz < 3; wiersz++) {
            if (board[wiersz][0].equals(xOrO) &&
                    board[wiersz][1].equals(xOrO) &&
                    board[wiersz][2].equals(xOrO)) {
                return true;
            }
        }
        for (int kolumna = 0; kolumna < 3; kolumna++) {
            if (board[0][kolumna].equals(xOrO) &&
                    board[1][kolumna].equals(xOrO) &&
                    board[2][kolumna].equals(xOrO)) {
                return true;
            }
        }
        if (board[0][0].equals(xOrO) &&
                board[1][1].equals(xOrO) &&
                board[2][2].equals(xOrO)) {
            return true;
        }

        if (board[0][2].equals(xOrO) &&
                board[1][1].equals(xOrO) &&
                board[2][0].equals(xOrO)) {
            return true;
        }

        return false;
    }
}
