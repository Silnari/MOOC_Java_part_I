public class Product {
    private double _price;
    private int _amount;
    private String _name;

    public Product(String name, double price, int amount){
        _price = price;
        _amount = amount;
        _name = name;
    }

    public void printProduct(){
        System.out.print(_name + ", price " + _price + ", amount " + _amount);
    }
}
