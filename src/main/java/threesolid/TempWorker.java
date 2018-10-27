package threesolid;


public class TempWorker extends BaseWorker implements IEat, ISick {
	//@Override
	public String work() {
		//System.out.format("Temporary worker working\n");
		return "I'm working already!";
	}
	public String eat() {
		//.... eating in launch break
		System.out.format("Temporary worker eating\n");
		return "Temporary worker is eating";
	}
	public int sick() {
		//.... I'm sick
		int sickHours = 8;
		System.out.format("Temporary worker is sick\n");
		return sickHours;
	}
}
