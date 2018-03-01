package lib;

import util.SomeDTO;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class CrazyLibWrapper implements ICrazyLibWrapper {
    private CrazyThirdPartyLib crazyThirdPartyLib;

    public CrazyLibWrapper() {
        crazyThirdPartyLib = new CrazyThirdPartyLib();
    }

    public Boolean doStuff(SomeDTO dto) {
        return crazyThirdPartyLib.doStuff(dto);
    }
}
