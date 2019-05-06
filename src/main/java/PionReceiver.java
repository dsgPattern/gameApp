public class PionReceiver {
    private int _x,_y;
    private int _moveUnit = 2;
    public void MoveX(boolean right)
    {
        if(right)
            _x+=_moveUnit;
        else
            _x-=_moveUnit;
        WriteCurrentPosition();
    }

    public void MoveY(boolean up)
    {
        if(up)
            _y+=_moveUnit;
        else
            _y-=_moveUnit;
        WriteCurrentPosition();
    }

    public void WriteCurrentPosition()
    {
        System.out.println(_x + " "+_y);
    }

}
