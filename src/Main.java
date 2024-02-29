public class Main {
    public static void main(String[] args){
        Address address = new Address("Street 1", "Street 2",
                "City", "State", "0123");

        System.out.println(address.getCity());

        Polymorphic_Circle c = new Polymorphic_Circle();
        System.out.println("Pi: " + c.PI);

    }
}
