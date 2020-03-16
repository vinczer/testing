package interfaces;

public class ChessGame implements GamingConsole{

    @Override
    public String up() {
        return "Move piece up";
    }

    @Override
    public String down() {
        return "Move piece down";
    }

    @Override
    public String left() {
        return "Move piece left";
    }

    @Override
    public String right() {
        return "Move piece right";
    }

}
