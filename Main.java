import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("******************** TOLL ADMINISTRATION APPLICATION ********************");
     System.out.println("------------------------------------------------------------------------------");
    // Implement the TAA application logic here
  String type1 = "1.Car";
  String type2 = "2.Truck";
  String type3 = "3.Police Cruiser";

  Scanner sc = new Scanner(System.in);
    int i;
    System.out.println("How many vehicles would you like to calculate toll for?:");

    int num = sc.nextInt();
    
    Vehicle[] vehicles = new Vehicle[num];
     for (i = 0; i < num; i++) {
       
      System.out.println("\nCalculating the toll for Vehicle #" + (i + 1) + "...\n");
       System.out.println("Choose the vehicle type:" + "\n" + type1 + "\n" + type2 + "\n" + type3);

        int choice = sc.nextInt();

        if(choice == 1) {
         System.out.println("Distance traveled: ");
         int distanceTraveled = sc.nextInt();
         System.out.println("Does it have a trailer?:");
         boolean hasTrailer = sc.nextBoolean();
          System.out.println("Is HOV3+ on?:");
          boolean isHov = sc.nextBoolean();
        vehicles[i] = new Car(distanceTraveled, hasTrailer, isHov);
          
        System.out.println();
        System.out.println("TOLL INFO:");
        System.out.println("Vehicle\t\t\tDistance\tToll Amount");
        System.out.println("----------------------------------------");

        vehicles[i].calculateToll();
        System.out.println(vehicles[i].toString());
        }

        if(choice == 2) { 
        System.out.println("Distance traveled: ");
           int distanceTraveled = sc.nextInt();
           System.out.println("How many axles?:");
            int noOfAxles = sc.nextInt();
        vehicles[i] = new Truck(distanceTraveled, noOfAxles);

            System.out.println("TOLL INFO:");
       System.out.println("Vehicle\t\t\tDistance\tToll Amount");
       System.out.println("----------------------------------------");

         vehicles[i].calculateToll();
        System.out.println(vehicles[i].toString());
          
         }
        if(choice == 3) { 
        System.out.println("Distance traveled: ");
        int distanceTraveled = sc.nextInt();
        vehicles[i] = new PoliceCruiser(distanceTraveled);     
     System.out.println("TOLL INFO:");
     System.out.println("Vehicle\t\t\tDistance\tToll Amount");
     System.out.println("----------------------------------------");   
          
     vehicles[i].calculateToll();
     System.out.println(vehicles[i].toString()); }
       }
    System.out.println("\n\n");

    System.out.println("TOLL INFO ON ALL VEHICLES:");
    System.out.println();
    System.out.println("Vehicle\t\t\tDistance\tToll $Amount");
    System.out.println("----------------------------------------");

          for (Vehicle v : vehicles) {
         System.out.println(v.toString() + "\f");
          }    

    System.out.println("THANK YOU FOR USING THE TOLL CALCULATOR! GOODBYE!");
  }
}