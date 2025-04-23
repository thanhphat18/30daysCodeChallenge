package src.day2;
public class Car {

    //creating variables
    //1. declare the variable
    //2. assign the variable
    //3. initialize the variable


    //instance variables
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

    //constructor
    public Car(int customMinSpeed, int customMaxSpeed, double customWeight, boolean customIsTheCarOn, char customCondition, String customNameOfCar) {
        minSpeed = customMinSpeed;
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        condition = customCondition;
        nameOfCar = customNameOfCar;
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
        numberOfPassengers++;
    }

    public void getOutCar(){
        numberOfPassengers--;
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double howMilesPerFillUp(){
        return maxFuel/mpg;
    }

    public static void main(String[] args) {
        Car car1 = new Car(0, 100, 4079, false, 'A', "Lucy");

        car1.printVariable();

        car1.getInCar();
        System.out.println("Number of Passengers: " + car1.numberOfPassengers);
        car1.getOutCar();
        System.out.println("Number of Passengers: " + car1.numberOfPassengers);
        System.out.println("How many miles till out of gas: " + car1.howManyMilesTillOutOfGas());
        System.out.println("How many miles per fill up: " + car1.howMilesPerFillUp());
    }

    
}
