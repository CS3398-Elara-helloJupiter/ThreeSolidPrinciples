package threesolid;

/**
 *Provides functions to objects derived from BaseWorker class
 *@author Louis Scinta
 *@since 09.14.18
 */
public interface IWorker extends IEat, ISick, IReboot
{
  /**
   *Make a worker object work.
   *All worker objects inherit <code>work</code> method 
   *while having ability to use but not alter <code>eat</code>, <code>sick</code>, or <code>reboot</code> methods if needed.
   */
  public void work()
  {
    System.out.format("I called the work() method. \n"); 
  }
}
/**
 *Extended by IWorker interface
 *@author Louis Scinta
 *@since 09.14.18
 */
interface IEat
{
  /**
   *Makes worker eat
   */
  public void eat()
  {
    System.out.format("I called the eat() method. \n");
  }
}

/**
 *Extended by IWorker interface
 *@author Louis Scinta
 *@since 09.14.18
 */
interface ISick
{
  /**
   *Provides worker objects ability to report sickness
   */
  public void sick()
  {
    System.out.format("I called the sick() method. \n");
  }
}
/**
 *Extended by <code>IWorker</code> interface
 *@author Louis Scinta
 *@since 09.14.18
 */
interface IReboot
{
  /**
   *reboots non-human objects
   */
  public void reboot ()
  {
    System.out.format("I called the reboot () method. \n");
  }
}

/*
 *work() method moved to parent interface to ensure all BaseWorker child objects inherited minimum ability to work.
 *eat(), sick(), and reboot() methods segragated to satisfy ISP.
 *Non-human BaseWorker objects will likely have no need for eat or sick,
 *while human BaseWorker objects will not need reboot method.
 *Deleted workable and feedable to satisfy client specifications for Assignment 5.
 *Inserted Javadoc comments to enhance readability and allow for future API development
 */             
