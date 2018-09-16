package threesolid;
//Modified by Mary Gutierrez 
//OPEN CLOSE - the Robot class is added in a separate class which 
// will allow to add interfaces in the future if we decide to 
//without changing the original functionalities of the Robot class
//the implementation of interface are independent of each other.

//SINGLE RESPONSIBILITY- by making the Robot class its on separate class it 
//falls into the Single responsibility principle because it is isolating the work of
//the Robot, meaning that the robot class is only responsible for the robot tasks
// which will help if we want to add new tasks to robot, because it will only apply 
//to this type of worker.

//INTERFACE SEGREGATION- This principle is applied in a way that this class does not use all methods 
// of the implementation because the Robot does not "eat" which means,
//keeping the interfaces separate so that the Robot does not depend on it 
//which will allow us to make the class independent from the interface 
//and will only use it when needed.

public abstract class Robot extends BaseWorker implements IReboot{
	 public void work() {
		 System.out.format("Robot working..\n");
	 }
	 public void reboot() {
		 //rebooting !
		 System.out.format("Rebooting robot. beep..boop\n");
		 
	 }

}
