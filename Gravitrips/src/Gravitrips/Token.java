package Gravitrips;

public enum Token {

    X("X"),
    O("O"),
    EMPTY(".");

    private String token;

    Token(String name) {
        this.token = name;
    }

    @Override
    public String toString() {
        return token;
    }
}