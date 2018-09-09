package threesolid;
// the interface can be entended to make take away tasks from the workers

public interface IWorker extends IFeedable, IWorkable {
}
interface IFeedable {
    public void eat();
        // nom nom nom
}
interface IWorkable {
    public void work();
        // work work work
}

//This Interface file is an example of the ISP principle

//Modified by: Louis Scinta 09/06/18
//Action Taken: Segregated IWorker interface into two separate interfaces 
//Reason: ISP states interfaces owned by clients
//and clients shouldn't encounter methods they don't use.
//In this case IWorker contained an eat() method which the Robot class
//and potentially future non-human classes would not need. Thus, the Robot class inherited methods from IWorker it did not need
//which violated the ISP. 
//Additionally, this also satisfies SRP in that any class which
//might request changes to the eat() method wouldn't interfere with classes which don't use that method.
//Lastly, it satisfies OCP in that the methods contained in these interfaces are extendable to classes, but their implementation is not modifiable.
//That is, every class which adopts this interface must agree to a uniform declaration of methods while still being able to implement them in ways specific to that class.
