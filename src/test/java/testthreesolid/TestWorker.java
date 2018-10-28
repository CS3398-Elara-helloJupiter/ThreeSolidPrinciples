
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
 @DisplayName("newtestJCWorkerFail")
 public void newtestJCWorkerFail()
 {
	
   assertTrue(w.work() == "I'm taking a self-care day!", "Test failed - Mismatch between test text and method text");
 }

  @Test
 @DisplayName("newtestJCWorkerPass")
 public void newtestJCWorkerPass()
 {
	
   assertNotEquals(w.eat() == "I'm taking a 2 hour lunch brb", "Test failed - Mismatch between test text and method text");
 }
 
}