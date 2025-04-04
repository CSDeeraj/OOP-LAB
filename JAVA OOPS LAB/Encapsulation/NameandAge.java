class Person {
    private String name;
    private int age;

    public String getname() { 
        return name; 
    }

    public void setname(String name) { 
        this.name = name; 
    }

    public int getage() { 
        return age; 
    } 

    public void setage(int age) { 
        this.age = age; 
    }
}

public class NameandAge {
    public static void main(String[] args) {
        Person p = new Person();
        p.setname("Deeraj");
        p.setage(18);
        System.out.println("Name: " + p.getname());
        System.out.println("Age: " + p.getage());
    }
}
