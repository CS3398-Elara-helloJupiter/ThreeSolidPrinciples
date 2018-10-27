package threesolid;


public class Worker extends BaseWorker implements IEat, ISick {

	public String work() {
		System.out.format("worker is working\n");
		return "I'm working already!";
	}
	public String eat() {
		System.out.format("worker is eating\n");
		return "worker is eating";
	}
	public int sick() {
		//.... I'm sick
		int sickHours = 0;
		System.out.format("worker is sick for " + sickHours + " hours.\n");
		return sickHours;
	}
}
	
