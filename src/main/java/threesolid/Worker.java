package threesolid;


public class Worker extends BaseWorker implements IEat, ISick {

	public String work() {
		//System.out.format("worker is working\n");
		return "I'm working already!";
	}
	public void eat() {
		System.out.format("worker is eating\n");
	}
	public void sick() {
		//.... I'm sick
		System.out.format("worker is sick\n");
	}
}
	
