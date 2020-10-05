
import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceOrder {
    public static void main(String[] args) {
        Order order = new Order();

        int n = 0;

        Scanner myObj = new Scanner(System.in);
        System.out.print("Order Id: ");
        order.setId(myObj.nextInt());
        System.out.print("Number of items: ");
        n = myObj.nextInt();

        for (int i = 0; i < n; i++) {
            Items item = new Items();
            System.out.print("Item id: ");
            item.setId(myObj.nextInt());
            System.out.print("Item name: ");
            String name = myObj.next();
            item.setName(name);
            System.out.print("Item price ");
            item.setPrice(myObj.nextDouble());
            order.setItems(item);
        }
        System.out.println(order.calculateAverageCost());
        myObj.close();
    }
}

class Items {
    int id;
    double price;
    String name;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

class Order {
    private int id;
    public int sizeOfItems = 0;
    ArrayList<Items> items = new ArrayList<>();

    public double calculateAverageCost() {
        double sum = 0.0;
        for (Items it : items)
            sum += it.getPrice();
        return sum / items.size();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setItems(Items temp) {
        items.add(temp);
    }
}
