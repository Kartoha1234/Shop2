package shop2;

public class Customer {
    public final String name;
    private final int ID;

    public Customer(String name,int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }
    @Override
    public String toString(){
        return "name = " + name + ", ID = " + ID;
    }
}
