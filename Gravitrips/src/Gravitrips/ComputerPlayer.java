package Gravitrips;

import java.util.Random;

public class ComputerPlayer extends Player {
    public void move(Token[][] array) {
        Random random = new Random();
        int input, i = 5;
        input = random.nextInt(7);
        boolean a = false;
        while (!a) {
            if (array[i][input] == Token.EMPTY) {
                array[i][input] = Token.O;
                a = true;
            } else i--;
        }
    }
}