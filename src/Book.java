public class Book {
    private String name;
    private String author;
    private int price;
    private int amount;
    private double weight;

    public Book(){
    }

    public Book(String _name, String _author, int _price, int _amount, double _weight){
        this.name = _name;
        this.author = _author;
        this.price = _price;
        this.amount = _amount;
        this.weight = _weight;
    }

    public double getTottalPrice (){
        return this.amount * this.price;
    }

    public double getTottalWeight(){
        return this.amount * this.weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
