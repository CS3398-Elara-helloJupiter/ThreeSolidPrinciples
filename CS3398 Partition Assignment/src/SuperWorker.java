package threesolid;


public class SuperWorker extends BaseWorker implements IEat, ISick {
	@Override
	public void work() {
		System.out.format("Super Worker is working\n");
	}
	public void eat() {
		System.out.format("Super worker is eating\n");
	}
	public void sick() {
		System.out.format("Super worker is sick\n");
	}
}
