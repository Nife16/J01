package weekTwo.notes.Inheritance;

public class Fish extends Animal {

    public Fish(){ super(); }
    
    public void eat() { System.out.println("Bloop bloop");}
    
    public void eat(String food) { System.out.println("Bloop bloop : " +  food);}
    
}
