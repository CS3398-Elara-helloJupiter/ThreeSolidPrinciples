package threesolid;


public class SuperWorker extends BaseWorker implements IEat, ISick {
	@Override
	public void work() {
		System.out.format("Super Worker is working");
	}
	public void eat() {
		System.out.format("Super worker is eating");
	}
	public void sick() {
		System.out.format("Super worker is sick");
	}
}
