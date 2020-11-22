import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private ArrayList<Product> products = new ArrayList();
    public List<String> list = new ArrayList<>();
    public void writeToCsv() throws IOException {
        FileWriter csvWriter = new FileWriter("data.csv", false);
        csvWriter.append("Product Name");
        csvWriter.append(",");
        csvWriter.append("Amount");
        csvWriter.append(",");
        csvWriter.append("Description");
        csvWriter.append("\n");
        for (Product p : products) {
            csvWriter.append(p.toString());
        }
        csvWriter.flush();
        csvWriter.close();
    }
    public void readCsv() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("data.csv"));
        String row;
        int x = 0;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            if (x++ == 0) continue;
            Product temp = new Product(data[0], Integer.parseInt(data[1]), data[2]);
            products.add(temp);
        }
        csvReader.close();
        for (Product temp : products) {
            System.out.println(temp.toString());
        }
    }
    public void removeProducts(Product temp) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getProductName().equals(temp.getProductName())) {
                index  = i;
                break;
            }
        }
        if (index != -1)
            products.remove(index);
    }
    public void updateList() {
        list.clear();
        for (Product p : products)
            list.add(p.getProductInformation());
    }
    public void addProducts(Product temp) {
        products.add(temp);
    }
    public Product search(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getProductName().equals(name)) {
                return p;
            }
        }
        return new Product("NULL",-1,"NULL"); // this return return when cannot find the item match name
    }


}
