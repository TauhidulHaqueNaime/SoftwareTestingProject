package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegrationTest {

	@Test
	public void INtegrationKeyTest() {
		LockUnlock junit = new LockUnlock ();
		junit.SetName("Name");
		junit.SetId(10);
		junit.SetSecret(2);
		
		Lock lock= new Lock (20);
		assertEquals (true, lock.Unlock(junit.CalculateKey()));
		assertEquals (false, lock.isLocked());
		
		lock.lock();
		
		junit.SetSecret(30);
		assertEquals (false, lock.Unlock(junit.CalculateKey()));
		assertEquals (true, lock.isLocked());
	}

}
