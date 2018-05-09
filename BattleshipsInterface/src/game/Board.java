package game;

import fxml.InterfaceController;

import static game.Shoot.texty;

public class Board {
    public static Ships[][] board1 = new Ships[11][11];
    public static int boardx[][] = new int[11][11];
    public static char board2[][] = new char[11][11];
    public static int px;
    public static int py;
    public static Ships ship4a = new Ships(4, true, false);
    public static Ships ship4b = new Ships(4, false, true);
    public static Ships ship3a = new Ships(3, true, false);
    public static Ships ship3b = new Ships(3, false, true);
    public static Ships ship2a = new Ships(2, true, false);
    public static Ships ship2b = new Ships(2, false, true);
    public static Ships ship1 = new Ships(1, false, true);


    public static int string;

    public static void InitialBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                boardx[i][j] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board2[i][j] = ' ';
            }
        }
    }


    public static void Ships1Placement() {
        while (Ships.quantityShip1 > 0) {
            int x = random.rint(0, 9);
            int y = random.rint(0, 9);

            if (board1[x][y] == null) {
                board1[x][y] = ship1;
                boardx[x][y] = 1;
                Ships.quantityShip1--;
            } else {
                Ships1Placement();
            }
        }
    }

    public static void Ships2Placement() {
        while (Ships.quantityShip2 > 0) {
            int x = random.rint(0, 9);
            int y = random.rint(0, 9);


            if (board1[x][y] == null) {
                if (x + 1 < 10) {
                    if (board1[x + 1][y] == null) {
                        board1[x + 1][y] = ship2a;
                        board1[x][y] = ship2a;

                        boardx[x][y] = 2;
                        boardx[x + 1][y] = 2;
                        Ships.quantityShip2--;
                        Ships2Placement();
                    }
                } else if (y + 1 < 10) {
                    if (board1[x][y + 1] == null) {
                        board1[x][y] = ship2b;
                        board1[x][y + 1] = ship2b;
                        boardx[x][y] = 2;
                        boardx[x][y + 1] = 2;
                        Ships.quantityShip2--;
                        Ships2Placement();
                    } else {
                        Ships2Placement();
                    }
                }
            }
        }
    }

    public static void Ships3Placement() {
        while (Ships.quantityShip3 > 0) {
            int x = random.rint(0, 9);
            int y = random.rint(0, 9);

            if (board1[x][y] == null) {
                if (x + 2 < 10 && x + 1 < 10) {
                    if (board1[x + 2][y] == null && board1[x + 1][y] == null) {
                        board1[x + 2][y] = ship3a;
                        board1[x + 1][y] = ship3a;
                        board1[x][y] = ship3a;

                        boardx[x + 2][y] = 3;
                        boardx[x + 1][y] = 3;
                        boardx[x][y] = 3;
                        Ships.quantityShip3--;
                        Ships3Placement();
                    }
                } else if (y + 2 < 10 && x + 1 < 10) {
                    if (board1[x][y + 2] == null && board1[x][y + 1] == null) {
                        board1[x][y + 2] = ship3b;
                        board1[x][y + 1] = ship3b;
                        board1[x][y] = ship3b;

                        boardx[x][y + 2] = 3;
                        boardx[x][y + 1] = 3;
                        boardx[x][y] = 3;
                        Ships.quantityShip3--;
                        Ships3Placement();
                    }
                }
            }
        }
    }

    public static void Ships4Placement() {
        while (Ships.quantityShip4 > 0) {
            int x = random.rint(0, 9);
            int y = random.rint(0, 9);

            if (board1[x][y] == null) {
                if (x + 3 < 10 && x + 2 < 10 && x + 1 < 10) {
                    if (board1[x + 3][y] == null && board1[x + 2][y] == null && board1[x + 1][y] == null) {
                        board1[x + 3][y] = ship4a;
                        board1[x + 2][y] = ship4a;
                        board1[x + 1][y] = ship4a;
                        board1[x][y] = ship4a;

                        boardx[x + 3][y] = 4;
                        boardx[x + 2][y] = 4;
                        boardx[x + 1][y] = 4;
                        boardx[x][y] = 4;
                        Ships.quantityShip4--;
                        Ships4Placement();
                    }
                } else if (y + 3 < 10 && y + 2 < 10 && x + 1 < 10) {
                    if (board1[x][y + 3] == null && board1[x][y + 2] == null && board1[x][y + 1] == null) {
                        board1[x][y + 3] = ship4b;
                        board1[x][y + 2] = ship4b;
                        board1[x][y + 1] = ship4b;
                        board1[x][y] = ship4b;

                        boardx[x][y + 3] = 4;
                        boardx[x][y + 2] = 4;
                        boardx[x][y + 1] = 4;
                        boardx[x][y] = 4;
                        Ships.quantityShip4--;
                        Ships4Placement();
                    }
                }
            }
        }
    }
}