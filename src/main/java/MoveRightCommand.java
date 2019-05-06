public class MoveRightCommand implements  MoveCommand{
    private PionReceiver _receiver;
    public MoveRightCommand(PionReceiver receiver)
    {
        _receiver=receiver;
    }

    public void Execute() {
        _receiver.MoveX(true);
    }
}
