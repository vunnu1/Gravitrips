package Gravitrips;

public class Board {
    private int vertical = 6;
    private int horizontal = 7;
    private Token[][] array;

    public Board(int vertical, int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;

        array = new Token[vertical][horizontal];
        fillBoard(Token.EMPTY);
    }

    public void fillBoard(Token token) {
        for (int x = 0; x < getVertical(); x++) {
            for (int y = 0; y < getHorizontal(); y++) {
                array[x][y] = token;
            }
        }
    }


    public void print() {
        System.out.println("");
        System.out.print("1 2 3 4 5 6 7");
        for (int i = 0; i < vertical; i++) {
            System.out.println(" ");
            for (int j = 0; j < horizontal; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.print("Make your move");
        System.out.println();
    }


    public Token[][] getArray() {
        return array;
    }

    public int getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public boolean gameCheck(Token token) {
        return horizontalCheck(token) || verticalCheck(token) || diagN1(token) || diagN2(token) || diagN3(token) || diagN4(token);
    }

    private boolean diagN4(Token token) {
        int tmp = 6;
        int X = 0;
        int temp = 1;
        while (tmp != 2) {
            for (int i = 0, j = temp; i < tmp; i++, j++) {
                if (array[i][j] == token) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;

            }
            tmp--;
            temp++;
        }
        return false;
    }

    private boolean diagN3(Token token) {
        int tmp = 3;
        int X = 0;
        while (tmp != 6) {
            for (int i = 5, j = tmp; j >= 0; i--, j--) {
                if (array[i][j] == token) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;
            }
            tmp++;
        }
        return false;
    }

    private boolean diagN2(Token token) {
        int tmp = 3;
        int X = 0;
        while (tmp != 0) {
            for (int i = 5, j = tmp; j < 7; i--, j++) {
                if (array[i][j] == token) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;
            }
            tmp--;
        }
        return false;
    }

    private boolean diagN1(Token token) {
        int X = 0;
        int tmp = 3;
        while (tmp != 6) {
            for (int i = tmp, j = 0; j < tmp; i--, j++) {
                if (array[i][j] == token) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;
            }
            tmp++;
        }
        return false;
    }

    private boolean verticalCheck(Token token) {
        int X = 0;
        for (int j = 0; j < horizontal; j++) {
            for (int i = 0; i < vertical; i++) {
                if (array[i][j] == token) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean horizontalCheck(Token token) {
        int X = 0;
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                if (array[i][j] == token) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}