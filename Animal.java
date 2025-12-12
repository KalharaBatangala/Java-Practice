// Abstract class is a class that cannot be
// created as an object 

abstract class Animal {
    
    abstract void MakeSound();       // abstract methods 
    abstract void Move();            // do not have a body

    //normal method
    void sleep(){
        System.out.println("This animal is sleeping...");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Bird();
        Animal a3 = new Bird();

        Animal[] animals = {a1, a2, a3};
        
        for(Animal anim : animals){
            anim.MakeSound();           // runtime polymorphism
        }
    }

}

class Dog extends Animal{
    @Override
    void MakeSound(){
        System.out.println("Bark");
    }

    @Override
    void Move(){
        System.out.println("Dog moves");
    }
}


class Bird extends Animal{
    @Override
    void MakeSound(){
        System.out.println("Bird chirps: Tweet tweet");
    }

    @Override
    void Move(){
        System.out.println("Birds fly");
    }
}


