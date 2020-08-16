package AccountTest;

import Account.HISA;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    @Before
    public void runBefore() {
        HISA myAccount = new HISA("Savings", 5000);
    }

    @Test
    public void testDeposit() {
        //TODO
    }

    @Test
    public void testWithdraw() {
        //TODO
    }

    @Test
    public void testWithdrawLimit() {
        //TODO
    }
}
