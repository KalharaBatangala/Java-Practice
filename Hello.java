public class Hello {

    static void StaticMethod(){
        System.out.println("This is a static method! No need object");
    }
    

    public static void main(String[] args){
        StaticMethod();
    }
}



// Note: A static method belongs to the class itself. You can call it without creating an object,
//  but it cannot use variables or methods that belong to an object.
