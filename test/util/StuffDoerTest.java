package util;

import lib.ICrazyThirdPartyLib;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by nathanlynch on 3/1/18.
 */
public class StuffDoerTest {
    private ICrazyThirdPartyLib crazyThirdPartyLibWrapper;

    private StuffDoer stuffDoer;

    @Before
    public void setup() {
        crazyThirdPartyLibWrapper = new MockCrazyThirdPartyLibWrapper();
        stuffDoer = new StuffDoer(crazyThirdPartyLibWrapper);
    }

    @Test
    public void doStuff() throws Exception {
        SomeDTO mockDTO = new SomeDTO();
        mockDTO.setName("Hello World");

        assertTrue(stuffDoer.doStuff(mockDTO));
    }

}