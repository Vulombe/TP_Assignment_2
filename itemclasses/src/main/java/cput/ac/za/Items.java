package cput.ac.za;

/**
 * Created by student on 2016/03/04.
 */
public class Items
{
    String names;
    String desrcption;
    double price;

    public Items(String names, String desrcption, double price) {
        this.names = names;
        this.desrcption = desrcption;
        this.price = price;
    }


    public String getNames() {
        return names;
    }

    public String getDesrcption() {
        return desrcption;
    }

    public double getPrice() {
        return price;
    }

    public void setDesrcption(String desrcption) {
        this.desrcption = desrcption;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Items{" +
                "names='" + names + '\'' +
                ", desrcption='" + desrcption + '\'' +
                ", price=" + price +
                '}';
    }
}
