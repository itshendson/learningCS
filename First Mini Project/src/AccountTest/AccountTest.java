package AccountTest;

import Account.HISA;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {

    private HISA myTestAccount;

    @Before
    public void runBefore() {
        myTestAccount = new HISA("Savings", 5000);
    }

    @Test
    public void testDeposit() {
        assertEquals(6000, myTestAccount.deposit(1000), 0);
    }

    @Test
    public void testWithdraw() {
        assertEquals(2000, myTestAccount.withdraw(3000), 0);
    }

    @Test
    public void testGetBalance() {
        assertEquals(5000, myTestAccount.getBalance(), 0);
    }

    @Test
    public void testWithdrawLimit() {
        assertThrows(5000, myTestAccount.withdraw(6000), 0);
    }
}
