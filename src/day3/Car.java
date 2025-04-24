package src.day3;
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPassengers = 1;
    int maxNumOfPassengers = 4;

    //constructor
    public Car(int customMinSpeed, int customMaxSpeed, double customWeight, boolean customIsTheCarOn, char customCondition, String customNameOfCar ) {
        minSpeed = customMinSpeed;
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        condition = customCondition;
        nameOfCar = customNameOfCar;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfPassengers = numberOfPassengers;
    }


    public void printVariable(){
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Min Speed: " + minSpeed);
        System.out.println("Weight: " + weight);
        System.out.println("Is the car on? " + isTheCarOn);
        System.out.println("Condition: " + condition);
        System.out.println("Name of Car: " + nameOfCar);
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }

    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getInCar(){
        if(numberOfPassengers < maxNumOfPassengers){
            numberOfPassengers++;
            System.out.println("Passenger in the car now: " + numberOfPassengers);
        } else {
            System.out.println("Car is full.");
        }
    }

    public void getOutCar(){
        if (numberOfPassengers >= 0){
            numberOfPassengers--;
            System.out.println("Passenger remaining: " + numberOfPassengers);
        } else {
            System.out.println("No passengers in the car.");
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double howMilesPerFillUp(){
        return maxFuel/mpg;
    }

    public void turnTheCarON(){
        //if statement:
        //if care is on, then doing othing
        //else
        //turn the car on
        if (isTheCarOn) {
            System.out.println("The car is already on.");
        } else {
            System.out.println("Turning the car on.");
            isTheCarOn = true;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(0, 100, 4079, false, 'A', "Lucy");

        car1.printVariable();

        System.out.println("Number of Passengers: " + car1.numberOfPassengers);
        System.out.println("Number of Passengers: " + car1.numberOfPassengers);
        System.out.println("How many miles till out of gas: " + car1.howManyMilesTillOutOfGas());
        System.out.println("How many miles per fill up: " + car1.howMilesPerFillUp());
        car1.turnTheCarON();
        car1.getInCar();
        car1.getOutCar();
    }

    
}
