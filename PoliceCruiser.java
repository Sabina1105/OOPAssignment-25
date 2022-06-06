class PoliceCruiser extends Vehicle{

  protected PoliceCruiser(int distanceTraveled){
    super(distanceTraveled);
  }
  public void calculateToll(){
setToll(0);
    
  }
  public String toString(){
    return "PoliceCruiser" + "\t\t\t"+super.getDistanceTraveled()+ "\t\t"+ super.getToll();
  }
}