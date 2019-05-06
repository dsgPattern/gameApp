public class MoveDownCommand implements  MoveCommand{
    private PionReceiver _receiver;
    public MoveDownCommand(PionReceiver receiver)
    {
        _receiver=receiver;
    }

    public void Execute() {
        _receiver.MoveY(false);
    }
}
