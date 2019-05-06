import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GameTableInvoker {
    private List<MoveCommand> _moveHistory=new ArrayList<MoveCommand>();

    public void CallCommand(MoveCommand command)
    {
        command.Execute();
        _moveHistory.add(command);
    }

    public void Undo()
    {
        MoveCommand lastCommand = _moveHistory.get(_moveHistory.size()-1);
        _moveHistory.remove(lastCommand);

    }
}
