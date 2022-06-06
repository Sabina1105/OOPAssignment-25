public abstract class Vehicle{

  private double toll;
  private int distanceTraveled;

  protected Vehicle(int distanceTraveled){
    this.distanceTraveled=distanceTraveled;
  }
  public double getToll(){
    return toll;
  }
  public void setToll(double toll){
    this.toll=toll;
  }
  public double getDistanceTraveled(){
    return distanceTraveled;
  }
  public void setDistanceTraveled(int distanceTraveled){
    this.distanceTraveled=distanceTraveled;
  }
  abstract void calculateToll();
}