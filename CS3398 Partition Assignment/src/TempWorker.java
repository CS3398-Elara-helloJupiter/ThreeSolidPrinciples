package threesolid;


public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
	public void work() {
		System.out.format("Temporary worker working\n");
	}
	public void eat() {
		//.... eating in launch break
		System.out.format("Temporary worker eating\n);
	}
	public void sick() {
		//.... I'm sick
		System.out.format("Temporary worker is sick\n");
	}
}
