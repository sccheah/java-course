public class Purchase {
    private String product;
    private int productAmount;
    private int productPrice;

    public Purchase(String product, int productAmount, int productPrice) {
        this.product = product;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
    }

    public int price() { return productPrice; }
    public int amount() { return productAmount; }
    public void increaseAmount() { productAmount++; }

    public String toString() {
        return product + ": " + productAmount;
    }
}