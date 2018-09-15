package threesolid;


public class Worker extends BaseWorker implements IEat, ISick{
		public void work() {
			// ....working
		}

		public void eat() {
			//.... eating in launch break
		}
		public void sick()
		{
			//IM sick
		}
	}
	
class SuperWorker extends BaseWorker implements IEat, ISick{
	@Override
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
	public void sick()
	{
		//IM sick
	}
}

class TempWorker extends BaseWorker implements IEat, ISick{
	@Override
	public void work() {
	// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
	public void sick()
	{
		//IM sick
	}
}


