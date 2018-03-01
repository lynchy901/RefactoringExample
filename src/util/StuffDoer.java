package util;

import lib.CrazyThirdPartyLib;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class StuffDoer {
    private CrazyThirdPartyLib thirdPartyLib;

    public StuffDoer() {
        this.thirdPartyLib = new CrazyThirdPartyLib();
    }

    public Boolean doStuff(SomeDTO dto) {
        Boolean res = thirdPartyLib.doStuff(dto);

        //A bunch of other stuff

        return res;
    }
}
