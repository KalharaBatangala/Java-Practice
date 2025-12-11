

public class Main {
    public static void main(String[] args){
     
    int x = 5;
    double y = 5.2;

    System.out.println("plus Function with int: "+plusFunction(x));
    System.out.println("plus Function with double "+plusFunction(y));

    }  


    static int plusFunction(int x){
        return ++x;
    }

    static double plusFunction(double x){
        return ++x;
    }
}


