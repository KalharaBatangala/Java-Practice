public class Hello {

    int x = 100;    // class variable

    public Hello(int x){
        this.x = x;     // refers to the class variable
    }

    public static void main(String[] args){
        Hello hello = new Hello(5);
        System.out.println(hello.x);
    }
    
}
