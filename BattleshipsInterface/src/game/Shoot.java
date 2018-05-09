package game;

import fxml.InterfaceController;

import static game.Board.board1;

public class Shoot {
    public static int tx;
    public static int ty;
    public static String texty ="";

    public static void Shoot1(int x, int y) {

        tx = x;
        ty = y;

        if (Board.board1[tx][ty].length == 1) {
            Board.board2[tx][ty] = 'X';

            texty = "Trafiony, zatopiony!";
            --Ships.lenghtShip1;
        }
        if (board1[tx][ty].length == 2) {
            Board.board2[tx][ty] = 'X';
            texty = "Trafiony";

            if (board1[tx][ty].hor && x + 1 < 10) {
                if ((board1[tx + 1][ty] != null) && (board1[tx + 1][ty].length == 2)) {
                    if ( board1[tx + 1][ty].hor && (Board.board2[tx + 1][ty] == 'X')) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip2;
                    }
                }
            }if (board1[tx][ty].hor && x - 1 >= 0) {
                if ((Board.board1[tx - 1][ty] != null) && (board1[tx - 1][ty].length == 2)) {
                    if ( board1[tx - 1][ty].hor && (Board.board2[tx - 1][ty] == 'X')) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip2;
                    }
                }
            }if (board1[tx][ty].ver && y + 1 < 10) {
                if ((Board.board1[tx][ty + 1] != null) && (board1[tx][ty + 1].length == 2)) {
                    if ( (Board.board2[tx][ty + 1] == 'X') && board1[tx][ty + 1].ver) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip2;
                    }
                }
            }if (board1[tx][ty].ver && y - 1 >= 0) {
                if ((Board.board1[tx][ty - 1] != null) && (board1[tx][ty - 1].length == 2)) {
                    if ( board1[tx][ty - 1].ver && (Board.board2[tx][ty - 1] == 'X')) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip2;
                    }
                }
            }
        }
        if (board1[tx][ty].length == 3) {
            Board.board2[tx][ty] = 'X';
            texty = "Trafiony";

            if (board1[tx][ty].hor && x + 2 < 10 && x + 1 < 10) {
                if (Board.board1[tx + 2][ty] != null && (board1[tx + 2][ty].length == 3) && ((Board.board1[tx + 1][ty] != null) && (board1[tx + 1][ty].length == 3))) {
                    if (board1[tx + 2][ty].hor && (Board.board2[tx + 2][ty] == 'X' && board1[tx + 1][ty].hor && (Board.board2[tx + 1][ty] == 'X'))) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip3;
                    }
                }
            }if (board1[tx][ty].hor && x - 2 >= 0 && x - 1 >= 0) {
                if ((Board.board1[tx - 2][ty] != null) && (board1[tx - 2][ty].length == 3) && (Board.board1[tx - 1][ty] != null) && (board1[tx - 1][ty].length == 3)) {
                    if (board1[tx - 2][ty].hor && (Board.board2[tx - 2][ty] == 'X' && board1[tx - 1][ty].hor && (Board.board2[tx - 1][ty] == 'X'))) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip3;
                    }
                }
            }if (board1[tx][ty].ver && y + 2 < 10 && y + 1 < 10) {
                if ((Board.board1[tx][ty + 2] != null) && (board1[tx][ty + 2].length == 3) && (Board.board1[tx][ty + 1] != null) && (board1[tx][ty + 1].length == 3)) {
                    if ((Board.board2[tx][ty + 2] == 'X') && board1[tx][ty + 2].ver && (Board.board2[tx][ty + 1] == 'X') && board1[tx][ty + 1].ver) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip3;
                    }
                }
            }if (board1[tx][ty].ver && y - 2 >= 0 && y - 1 >= 0) {
                if ((Board.board1[tx][ty - 2] != null) && (board1[tx][ty - 2].length == 3) && (Board.board1[tx][ty - 1] != null) && (board1[tx][ty - 1].length == 3)) {
                    if (board1[tx][ty - 2].ver && (Board.board2[tx][ty - 2] == 'X') && board1[tx][ty - 1].ver && (Board.board2[tx][ty - 1] == 'X')) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip3;
                    }
                }
            }
        }
        if(board1[x][y].length == 4){
            Board.board2[tx][ty] = 'X';
            texty = "Trafiony";

            if (board1[tx][ty].hor && x + 3 < 10 && x + 2 < 10 && x + 1 < 10) {
                if (Board.board1[tx + 3][ty] != null && (board1[tx + 3][ty].length == 4) && Board.board1[tx + 2][ty] != null && (board1[tx + 2][ty].length == 4) && ((Board.board1[tx + 1][ty] != null) && (board1[tx + 1][ty].length == 4))) {
                    if (board1[tx + 3][ty].hor && (Board.board2[tx + 3][ty] == 'X' && board1[tx + 2][ty].hor && (Board.board2[tx + 2][ty] == 'X' && board1[tx + 1][ty].hor && (Board.board2[tx + 1][ty] == 'X')))) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip4;
                    }
                }
            }if(board1[tx][ty].hor && x - 3 >= 0 && x - 2 >= 0 && x - 1 >= 0) {
                if ((Board.board1[tx - 3][ty] != null) && (board1[tx - 3][ty].length == 4) && Board.board1[tx - 2][ty] != null && (board1[tx - 2][ty].length == 4) && (Board.board1[tx - 1][ty] != null) && (board1[tx - 1][ty].length == 4)) {
                    if (board1[tx - 3][ty].hor && (Board.board2[tx - 3][ty] == 'X' && board1[tx - 2][ty].hor && (Board.board2[tx - 2][ty] == 'X' && board1[tx - 1][ty].hor && (Board.board2[tx - 1][ty] == 'X')))) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip4;
                    }
                }
            }if(board1[tx][ty].ver && y + 3 < 10 && y + 2 < 10 && y + 1 < 10) {
                if ((Board.board1[tx][ty + 3] != null) && (board1[tx][ty + 3].length == 4) && (Board.board1[tx][ty + 2] != null) && (board1[tx][ty + 2].length == 4) && (Board.board1[tx][ty + 1] != null) && (board1[tx][ty + 1].length == 4)) {
                    if ((Board.board2[tx][ty + 3] == 'X') && board1[tx][ty + 3].ver && (Board.board2[tx][ty + 2] == 'X') && board1[tx][ty + 2].ver && (Board.board2[tx][ty + 1] == 'X') && board1[tx][ty + 1].ver) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip4;
                    }
                }
            }if(board1[tx][ty].ver && y - 3 >= 0 && y - 2 >= 0 && y - 1 >= 0) {
                if ((Board.board1[tx][ty - 3] != null) && (board1[tx][ty - 3].length == 4) && (Board.board1[tx][ty - 2] != null) && (board1[tx][ty - 2].length == 4) && (Board.board1[tx][ty - 1] != null) && (board1[tx][ty - 1].length == 4)) {
                    if (board1[tx][ty - 3].ver && (Board.board2[tx][ty - 3] == 'X') && board1[tx][ty - 2].ver && (Board.board2[tx][ty - 2] == 'X') && board1[tx][ty - 1].ver && (Board.board2[tx][ty - 1] == 'X')) {
                        texty = "Trafiony, zatopiony!";
                        --Ships.lenghtShip4;
                    }
                }
            }
        }
        if(Ships.lenghtShip1+Ships.lenghtShip2+Ships.lenghtShip3+Ships.lenghtShip4 == 0){
            texty = "! WYGRALES W "+ InterfaceController.moves +" RUCHACH !";
        }
    }
}