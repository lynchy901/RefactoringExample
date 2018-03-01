package util;

import lib.ICrazyLibWrapper;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class StuffDoer {
    private CrazyLib thirdPartyLib;

    public StuffDoer(CrazyLib thirdPartyLib) {
        this.thirdPartyLib = thirdPartyLib;
    }

    public Boolean doStuff(SomeDTO dto) {
        Boolean res = thirdPartyLib.doStuff(dto);

        //A bunch of other stuff

        return res;
    }
}
