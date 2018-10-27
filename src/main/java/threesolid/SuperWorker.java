package threesolid;


public class SuperWorker extends BaseWorker implements IEat, ISick {
	//@Override
	public String work() {
		//System.out.format("Super Worker is working\n");
		return "I'm working already!";
	}
	public String eat() {
		System.out.format("Super worker is eating\n");
		return "Super worker is eating\n";
	}
	public int sick() {
		int sickHours = 8;
		System.out.format("Super worker is sick\n");
		return sickHours;
	}
}
