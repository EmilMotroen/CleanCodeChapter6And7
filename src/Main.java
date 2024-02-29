public class Main {
    public static void main(String[] args){
        Address address = new Address("Slottsplassen 1",
                "Slottsplassen 2", "Oslo", "Oslo", "0010");

        System.out.println(address.getCity());

        Polymorphic_Circle c = new Polymorphic_Circle();
        System.out.println("Pi: " + c.PI);


    }
}
