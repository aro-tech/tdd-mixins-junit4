/**
 * 
 */
package com.github.aro_tech.tdd_mixins;

/**
 * @author aro_tech
 *
 */
public interface AllAssertions extends AssertJ, JUnitAssert {
	
	/**
	 * Call org.junit.Assert.fail() 
	 * Resolves conflict between JUnit and AssertJ in favor of JUnit
	 */
	@Override
	default void fail(String message) {
		JUnitAssert.super.fail(message);
	}
	
	/**
	 * Call AssertJ.fail()
	 * @param message
	 */
	default void assertJFail(String message) {
		AssertJ.super.fail(message);
	}
}
