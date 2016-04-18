/**
 * 
 */
package com.github.aro_tech.tdd_mixins;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.github.aro_tech.extended_mockito.ExtendedMockito;

/**
 * Unit test(s) to verify that mixins are present
 * @author aro_tech
 *
 */
public class AllAssertionsTest implements ExtendedMockito, AllAssertions {


	@Test
	public void verify_presence_of_AllAsserts() {
		assertThat("football").startsWith("foot").endsWith("ball");
		assertTrue(true);
	}

	@Test
	public void verify_presence_of_ExtendedMockito() throws SQLException {
		ResultSet mock = mock(ResultSet.class);
		when(mock.getString(anyInt())).thenReturn("foo");
		assertThat(mock.getString(1)).isEqualTo("foo");
	}

	
}
