class product {
    void display() {
    System.out.println("id of product:"+id+" product name:"+name+" price:"+price);
        }
    int id;
    String name;
    double price;
product() {
    id=0;
    name="unknown";
    price=0.0;
}
product(int i,String n) {
    id=i;
    name=n;
    price=0.;
}
product(int i,String n,double p) {
    id=i;
    name=n;
    price=p;
}
}
public class polytech {
public static void main(String[] args) {
    product p1=new product();
    product p2=new product(101,"Oppo 2X pro");
    product p3=new product(102,"Acer E15 575G",28000);
p1.display();
p2.display();
p3.display();
}
}
    