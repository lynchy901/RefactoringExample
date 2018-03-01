package main;

import lib.CrazyLibWrapper;
import util.SomeDTO;
import util.StuffDoer;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class App {
    public static void main (String args[]) {
        StuffDoer stuffDoer = new StuffDoer(new CrazyLibWrapper());
        stuffDoer.doStuff(new SomeDTO());
    }
}
