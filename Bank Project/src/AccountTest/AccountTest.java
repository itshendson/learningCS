package AccountTest;

import Account.HISA;
import Account.WithdrawLimitException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private HISA myTestAccount;

    @Before
    public void runBefore() {
        myTestAccount = new HISA( 5000, 11111);
    }

    @Test
    public void testDeposit() {
        assertEquals(6000, myTestAccount.deposit(1000), 0);
    }

    @Test
    public void testWithdraw() throws WithdrawLimitException {
        assertEquals(2000, myTestAccount.withdraw(3000), 0);
    }

    @Test
    public void testGetBalance() {
        assertEquals(5000, myTestAccount.getBalance(), 0);
    }

    @Test
    public void testWithdrawLimit() throws WithdrawLimitException {
        assertEquals(5000, myTestAccount.withdraw(6000), 0);
    }



}
