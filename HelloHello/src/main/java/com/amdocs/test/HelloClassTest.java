package com.amdocs.test;

import org.junit.Test;

import junit.framework.TestCase;

public class HelloClassTest extends TestCase {

		String message = "Hello World!!";
		HelloClass h = new HelloClass();
		
		@Test
		public void testHello() {
			assertEquals(h.hello(),message);
		}

	}

