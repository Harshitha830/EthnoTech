import java.util.Scanner;
abstract class Food
{
    abstract void display();
	void bill(int price, int qty)
    {
        int total = price * qty;
        System.out.println("Quantity : " + qty);
        System.out.println("Total Bill : ₹" + total);
		System.out.println("Order placed successfully");
    }
}
class Order extends Food
{
    int choice,qty;
    Order(int choice,int qty)
    {
        this.choice = choice;
		this.qty=qty;
    }
    void display()
    {
        switch(choice)
        {
            case 1:
                System.out.println("Food Name : Biryani");
                System.out.println("Price : ₹250");
				bill(250, qty);
                break;

            case 2:
                System.out.println("Food Name : Pizza");
                System.out.println("Price : ₹300");
				bill(300, qty);
                break;

            case 3:
                System.out.println("Food Name : Burger");
                System.out.println("Price : ₹120");
				bill(120, qty);
                break;

            case 4:
                System.out.println("Food Name : Dosa");
                System.out.println("Price : ₹50");
				bill(50, qty);
                break;

            case 5:
                System.out.println("Food Name : Idli");
                System.out.println("Price : ₹40");
				bill(40, qty);
                break;

            case 6:
                System.out.println("Food Name : Noodles");
                System.out.println("Price : ₹150");
				bill(150, qty);
                break;

            case 7:
                System.out.println("Food Name : Fried Rice");
                System.out.println("Price : ₹180");
				bill(180, qty);
                break;

            case 8:
                System.out.println("Food Name : Ice Cream");
                System.out.println("Price : ₹60");
				bill(60, qty);
                break;

            case 9:
                System.out.println("Food Name : Sandwich");
                System.out.println("Price : ₹90");
				bill(90, qty);
                break;

            case 10:
                System.out.println("Food Name : Coffee");
                System.out.println("Price : ₹50");
				bill(50, qty);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
public class FoodOrder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Available Foods:");
		System.out.println("1. Biryani");
		System.out.println("2. Pizza");
		System.out.println("3. Burger");
		System.out.println("4. Dosa");
		System.out.println("5. Idli");
		System.out.println("6. Noodles");
		System.out.println("7. Fried Rice");
		System.out.println("8. Ice Cream");
		System.out.println("9. Sandwich");
		System.out.println("10. Coffee");
		System.out.print("Select your food: ");
        int ch = sc.nextInt();
        System.out.print("Enter quantity: ");
		int qty = sc.nextInt();
		Food f = new Order(ch, qty);
		f.display();
        sc.close();
    }
}