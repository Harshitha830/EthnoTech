class Vehicle
{
    void vehi_fare()
    {
        System.out.println("Vehicle Booked");
    }
}
class Bike extends Vehicle
{
    void vehi_fare()
    {
        System.out.println("Bike Booked");
        System.out.println("Fare : 80");
    }
}
class Auto extends Vehicle
{
    void vehi_fare()
    {
        System.out.println("Auto Booked");
        System.out.println("Fare : 180");
    }
}
class Cab extends Vehicle
{
    void vehi_fare()
    {
        System.out.println("Cab Booked");
        System.out.println("Fare : 250");
    }
}
class Polymorphism
{
    public static void main(String[] args)
    {
        Vehicle v;
        v = new Bike();
        v.vehi_fare();
        v = new Auto();
        v.vehi_fare();
        v = new Cab();
        v.vehi_fare();
    }
}