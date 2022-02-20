/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackArrayListTest {




	@Test
	 public void testCount() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		miStack.push(3);
		miStack.push(3);
		assertEquals(3, miStack.count());
	}
        @Test
        public  void testIsEmpty() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		assertEquals(true, miStack.isEmpty());
	}
           @Test
        public void testPeek() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals((Integer)5,miStack.peek());
		
	}
        
	@Test
	public void testPush() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals((Integer)5, miStack.peek());
	}

	/**
	 * Test method for {@link com.uvg.main.StackArrayList#pull()}.
	 */
	@Test
	public void testPull() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals((Integer)5, miStack.pull());
	}

	}