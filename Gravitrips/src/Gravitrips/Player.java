package Gravitrips;

public abstract class Player {
    private Token token;

    public void setToken(Token token) {
        this.token = token;
    }

    public boolean won = false;

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public abstract void move(Token[][] array);
}