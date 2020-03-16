package interfaces;

public class MarioGame implements GamingConsole{

    @Override
    public String up() {
        return "Jump";
    }

    @Override
    public String down() {
        return "Goes into a hole";
    }

    @Override
    public String left() {
        return "";
    }

    @Override
    public String right() {
        return "Go Forward";
    }

}
