package threesolid;


public class Worker extends BaseWorker implements IEat, ISick {

	public void work() {
		System.out.format("worker is working\n");
	}
	public void eat() {
		System.out.format("worker is eating\n");
	}
	public void sick() {
		//.... I'm sick
		System.out.format("worker is sick\n");
	}
}
	
