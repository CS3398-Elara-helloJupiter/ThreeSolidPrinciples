package threesolid;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker 
{
 private Worker w = new Worker();
 @Test
 @DisplayName("Work Method Test")
 public void testWorkMethod()
 {
   assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text" );
 }

 @Test
 @DisplayName("newtest_smh_WorkerPass")
 public void newtest_smh_WorkerPass()
 {
 	assertTrue(true==true, "It's Alive!!");
 }
 @Test
 @DisplayName("newtest_smh_WorkerFail")
 public void newtest_smh_WorkerFail()
 {
 	assertTrue(true==false, "It's dead...");
 }
}