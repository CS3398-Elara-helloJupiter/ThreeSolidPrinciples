package threesolid;

/**
 *Extendes <code>IWorker</code> interface
 *@author Louis Scinta
 *@version 09.15.18
 *@since 09.14.18
 */
interface ISick extends IWorker
{
  /**
   *Provides worker objects ability to report sickness
   */
  public void sick();
}
