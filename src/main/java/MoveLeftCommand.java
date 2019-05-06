public class MoveLeftCommand implements  MoveCommand{
    private PionReceiver _receiver;
    public MoveLeftCommand(PionReceiver receiver)
    {
        _receiver=receiver;
    }

    public void Execute() {
        _receiver.MoveX(false);
    }
}
