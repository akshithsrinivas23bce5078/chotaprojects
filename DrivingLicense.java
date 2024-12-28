/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class LicenseNumberExceededException  extends Exception{
    public LicenseNumberExceededException(String message){
        super(message);
    }
}
class HeavyVehicleException extends Exception{
    public HeavyVehicleException(String message){
        super(message);
    }
}
class DrivingLicenseDetails{
    private String name;
    private int age;
    private String licensenumber;
    private String vehicletype;
    public DrivingLicenseDetails(String name, int age, String licensenumber, String vehicletype){
        this.name = name;
        this.age = age;
        this.licensenumber = licensenumber;
        this.vehicletype = vehicletype;
    }
    public void displaydetails(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("License Number:" + licensenumber);
        System.out.println("Vehicle Type:" + vehicletype);
    }
}
class TrafficRules{
    public void displaytrafficrules(){
        System.out.println("The rules are shown below. It is responsible for all to follow:");
        System.out.println("1. Always wear a seatbelt while driving.");
        System.out.println("2. Do not use mobile phones while driving.");
        System.out.println("3. Follow speed limits.");
        System.out.println("4. Follow Road signs and be alert during traffic.");
        System.out.println("5. Always stop at red lights");
        System.out.println("6. Give way to emergency vehicles");
        System.out.println("7. Use indicators while turning");
        System.out.println("8. Never drink and drive");
    }
}
class DrivingLicense{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Enter your name:");
            String name = scan.nextLine();
            System.out.print("Enter your age:");
            int age = scan.nextInt();
            if(age < 18 || age > 65){
                throw new InvalidAgeException("The minimum age should be 18 and maximum age should be 65");
            }
            System.out.print("Enter your driving license id:");
            String licenseid = scan.next();
            if(licenseid.length() > 10){
                throw new LicenseNumberExceededException("License Number cannot be greater than 10");
            }
            scan.nextLine();
            System.out.print("Enter vehicle name:");
            String vehicle = scan.nextLine();
            if(!vehicle.equals("Car")&&!vehicle.equals("Bike")){
                throw new HeavyVehicleException("Cannot drive heavy vehicles.Vehicle should be a car or a bike");
            }
            DrivingLicenseDetails licensedetails = new DrivingLicenseDetails(name,age,licenseid,vehicle);
            System.out.println("Menu:");
            System.out.println("1. View Driving license details");
            System.out.println("2. View Traffic rules");
            System.out.println("3. Exit");
            int choice;
            do{
                System.out.println("Enter your choice:");
                choice = scan.nextInt();
                switch(choice){
                    case 1:
                        licensedetails.displaydetails();
                        break;
                    case 2:
                        TrafficRules rules = new TrafficRules();
                        rules.displaytrafficrules();
                        break;
                    case 3:
                        System.out.println("Goodbye! Thanks!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }while(choice != 3);
        }
        catch(InvalidAgeException e){
            System.out.println("InvalidAgeException:" + e.getMessage());
        }
        catch(LicenseNumberExceededException e){
            System.out.println("LicenseNumberExceededException:" + e.getMessage());
        }
        catch(HeavyVehicleException e){
            System.out.println("HeavyVehicleException:" + e.getMessage());
        }
    }
}