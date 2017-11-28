package indi.shuyu.base.encrypt.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import indi.shuyu.base.encrypt.DESEncryptAlgorithm;

public class DESEncryptAlgorithmTest {
	
	@Test
	public void evaluatesExpression() {
		
		DESEncryptAlgorithm obj = new DESEncryptAlgorithm();
		String value = obj.getResult();
		assertEquals(obj.getResult(), "1");
	}
}
