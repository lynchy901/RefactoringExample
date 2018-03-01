package main;

import lib.CrazyThirdPartyLib;
import util.SomeDTO;
import util.StuffDoer;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class App {
    public static void main (String args[]) {
        StuffDoer stuffDoer = new StuffDoer(new CrazyThirdPartyLib());
        stuffDoer.doStuff(new SomeDTO());
    }
}
