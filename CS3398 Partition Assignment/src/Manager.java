package threesolid;
//the following class is using the Open close principle
// we want the manager class to be absolutetly its own class 
// because when modifying or extending it will just call the commands.
// the tasks will be applied accordying to the worker type

public class Manager {
	BaseWorker worker;

	public void Manager() {

	}
	public void setWorker(BaseWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}

}
