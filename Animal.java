// An interface is a completely "abstract class" that is used to 
// group related methods with empty bodies
interface Animal{
    public void animalSound();
    public void run();
}


class Pig implements Animal{
    public void animalSound(){
        System.out.println("Pig: wee wee");
    }

    public void run(){
        System.out.println("Pig runs");
    }
}

