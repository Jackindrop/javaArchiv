package de.hsh.prog.choreov02;

import de.hsh.prog.choreov02.pub.Board;
import de.hsh.prog.choreov02.pub.Direction;
import de.hsh.prog.choreov02.pub.Player;

import java.awt.*;

public class PlayerStarter {
    public static void startPlayer(Player player, Board board) {
        Strat1 s= new Strat1(player, board);
        s.start();
    }


}