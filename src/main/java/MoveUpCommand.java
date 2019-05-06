public class MoveUpCommand implements  MoveCommand{
    private PionReceiver _receiver;
    public MoveUpCommand(PionReceiver receiver)
    {
        _receiver=receiver;
    }

    public void Execute() {
        _receiver.MoveY(true);
    }
}
