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
	 * Call AssertJ.fail()
	 * @param message
	 */
	default void assertJFail(String message) {
		AssertJ.super.fail(message);
	}
	
}
