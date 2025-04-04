class idle{
    void imidle() {
        System.out.println("Im idle. i am either sitting, sleeping or watching my phone.");
    }
}
class eating extends idle {
    void eat() {
        System.out.println("I am hungry. i want to go to the mess hall to eat.."); 
    }
}
class pickupplate extends eating {
    void plate() {
        System.out.println("I went to pick up my plate, to eat at the mess hall.");
    }
}
class bathroom extends idle{
    void bathroom() {
        System.out.println("I felt the need to go to the restroom so i got up");
    }
}
class slippers extends bathroom {
    void slipper() {
        System.out.println("I went to wear my bathroom slippers");
    }
}
public class Whattodo{
    public static void main(String[] args){
        idle i=new idle();
        eating e=new eating();
        pickupplate p=new pickupplate();
        bathroom b=new bathroom();
        slippers s=new slippers();
        i.imidle();
        e.eat();
        p.plate();
        b.bathroom();
        s.slipper();

    }
}