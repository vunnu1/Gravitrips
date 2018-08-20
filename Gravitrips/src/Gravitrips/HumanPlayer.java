package Gravitrips;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public void move(Token[][] array) {
        Scanner scanner = new Scanner(System.in);
        int input, i = 5;
        input = scanner.nextInt();
        boolean a = false;
        while (!a) {
            if (array[i][input - 1] == Token.EMPTY) {
                array[i][input - 1] = Token.X;
                a = true;
            } else i--;
        }
    }
}