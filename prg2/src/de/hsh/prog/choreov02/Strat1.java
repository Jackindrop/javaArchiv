package de.hsh.prog.choreov02;

import de.hsh.prog.choreov02.pub.Board;
import de.hsh.prog.choreov02.pub.Direction;
import de.hsh.prog.choreov02.pub.Player;

import java.awt.*;

public class Strat1 extends Thread {
    public Player p;
    public Board b;

    @Override public void run() {
        Point tmp= b.getCurrentPosition(p);
        boolean changeDirec= false;
        int x= 0;
        while (true) {
                if (!changeDirec && b.canMove(p, Direction.WEST)) {
                    b.move(p, Direction.WEST);
                    ++x;
                } else {
                    changeDirec = true;
                }

                if (changeDirec && b.canMove(p, Direction.EAST)) {
                    b.move(p, Direction.EAST);
                    ++x;
                } else {
                    changeDirec = false;
                }
        }
    }
    public Strat1(Player p, Board b) {
         this.p= p;
         this.b= b;
    }
}
