public class Main {
    public static void main(String[] args)
    {
        GameTableInvoker invoker=new GameTableInvoker();
        PionReceiver pion=new PionReceiver();
        MoveRightCommand righCommand = new MoveRightCommand(pion);
        MoveLeftCommand leftCommand = new MoveLeftCommand(pion);
        MoveDownCommand downCommand = new MoveDownCommand(pion);
        invoker.CallCommand(righCommand);
        invoker.CallCommand(righCommand);
        invoker.CallCommand(leftCommand);
        invoker.CallCommand(downCommand);

    }
}
