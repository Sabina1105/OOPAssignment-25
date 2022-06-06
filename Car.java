 class Car extends Vehicle{

  private boolean hasTrailer;
   private boolean isHov;

   protected Car(int distanceTraveled, boolean hasTrailer, boolean isHov){
     super(distanceTraveled);
     this.hasTrailer=hasTrailer;
     this.isHov=isHov;
  }
   public boolean getHasTrailer(){
    return hasTrailer;
  }
  public void setHasTrailer(boolean hasTrailer){
    this.hasTrailer=hasTrailer;
  }
   public boolean getIsHov(){
    return isHov;
  }
  public void setIsHov(boolean isHov){
    this.isHov=isHov;
  }
   void calculateToll(){
     setToll(getDistanceTraveled()*0.02);
      if (hasTrailer)
       setToll(getToll()+1);
     if(isHov)
       setToll(0);
   }
   public String toString(){
     return "Car"+ "\t\t\t" + super.getDistanceTraveled()+ "\t\t"+super.getToll();
   }
}