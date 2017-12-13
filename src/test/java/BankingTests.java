import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankingTests {
	
	@Test
	public void assertThatMapSizeReturnsOne() {
		Bank underTest = new Bank();
		underTest.add(new BankAccount("1","type",0));
		int check = underTest.getSize();
		assertEquals(1, check);
	}
	
	@Test
	public void assertThatMapSizeReturnsOneAferClose() {
		Bank underTest = new Bank();
		underTest.add(new BankAccount("1","type",0));
		underTest.add(new BankAccount("2","type",0));
		underTest.closeAccount("1");
		int check = underTest.getSize();
		assertEquals(1, check);
	}
	
	@Test
	public void assertThatAccountIsFound() {
		Bank underTest = new Bank();
		underTest.add(new BankAccount("1","type",0));
		String check = underTest.getAccount("1").getAccoutNum();
		assertEquals ("1", check);
	}
	
	@Test
	public void assertThatBalanceIsCorrect() {
		Bank underTest = new Bank();
		underTest.add(new BankAccount("1","type",0));
		double check = underTest.getAccount("1").getBalance();
		assertEquals (0, check,.01);
	}

}
