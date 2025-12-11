

public class Main {
    public static void main(String[] args){
    
    int x = 5;
    System.out.println("Factorial of "+x+" is : "+factorial(x));

    }  



    static int factorial(int number){
        if(number > 0){
            return number * factorial(number - 1);
        }
        else{
            return 1;
        }
    }
}


