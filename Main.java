public class Main {

    // methods are declared within a class

    public void fullThrottle(){
        System.out.println("Car is moving at top speed!");
    }

    public void maxSpeed(int maxSpeed){
        System.out.println("Max speed"+maxSpeed);
    }
    public static void main(String[] args){
        

        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.maxSpeed(120);
    }
}