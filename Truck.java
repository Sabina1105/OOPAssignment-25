class Truck extends Vehicle{

  private int noOfAxles;

  protected Truck(int distanceTraveled, int noOfAxles){
    super(distanceTraveled);
    this.noOfAxles=noOfAxles;
  }
  public int getNoOfAxles(){
    return noOfAxles;
  }
  public void setNoOfAxles(int noOfAxles){
    this.noOfAxles=noOfAxles;
}
  void calculateToll(){
    if (noOfAxles == 4)
      setToll(getDistanceTraveled()*0.04);
    if (noOfAxles == 6)
      setToll(getDistanceTraveled()*0.045);
    if (noOfAxles == 8)
      setToll(getDistanceTraveled()*0.048);
  }
  public String toString(){
    return "Truck"+ "\t\t\t "+super.getDistanceTraveled()+"\t\t" + super.getToll();
  }
}