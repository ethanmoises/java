public class GroceryItem {

    private String name;
    private int idNum;
    private double price;

    public String getName(){
        return name;
    }
    public boolean isDiscounted() {
        return discounted;
    }

    public int getIdNum() {
        return idNum;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    private boolean discounted;
    private double discountRate;
    GroceryItem(String name, int idNum, double price, boolean discounted, double discountRate) {
        this.name = name;
        this.idNum = idNum;
        this.price = price;
        this.discounted = discounted;
        this.discountRate = discountRate;
    }
    public double finalPrice(){
        if(discounted) {
            return price * (1 - discountRate);
        }

        return price;
    }
}
