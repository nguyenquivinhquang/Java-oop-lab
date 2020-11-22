public class Product {
    private String productName, description;
    private int amount;

    public Product(String productName, int amount, String description) {
        this.amount = amount;
        this.productName = productName;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return productName + "," + amount + "," +description + "\n";
    }
    public String getProductInformation() {
        return "Name: " + productName + ",  "
                + "Amount: " + amount +" \n Description: " + description + "\n";
    }
}
