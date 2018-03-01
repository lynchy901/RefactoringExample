package lib;

import util.SomeDTO;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class CrazyThirdPartyLib {
    private boolean isConnectedToProd = false;

    public Boolean doStuff(SomeDTO dto) {
        if (isConnectedToProd)
            return true;
        return null;
    }

}
