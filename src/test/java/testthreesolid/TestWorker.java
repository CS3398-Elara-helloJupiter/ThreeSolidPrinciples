package threesolid;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	private Worker w = new Worker();


	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod()
	{
		assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text" );
	}


	@Test
	@DisplayName("Eat Method Test")
	public void newtest_AH_WorkerPass()
	{
		String eatingOutput= "worker is eating";
		assertTrue(eatingOutput == w.eat(), "Test failed, incorrect output from eat() method");
	}

	@Test
	@DisplayName("Sick Method Test")
	public void newtest_AH_WorkerFail()
	{
		int notSick = 0; 
		assertNotEquals(notSick, w.sick(), "Test failed, worker needs to report more than 0 hours sick");
	}	

}