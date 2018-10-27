package threesolid;


public class SuperWorker extends BaseWorker implements IEat, ISick {
	//@Override
	public String work() {
		//System.out.format("Super Worker is working\n");
		return "I'm working already!";
	}
	public String eat() {
		System.out.format("Super worker is eating\n");
	
		return "worker is eating";
	}
	public void sick() {
		System.out.format("Super worker is sick\n");
	}
}
