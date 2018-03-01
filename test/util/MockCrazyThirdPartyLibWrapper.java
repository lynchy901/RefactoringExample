package util;

import lib.ICrazyThirdPartyLib;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class MockCrazyThirdPartyLibWrapper implements ICrazyThirdPartyLib {
    @Override
    public Boolean doStuff(SomeDTO dto) {
        return true;
    }
}
