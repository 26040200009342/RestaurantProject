package MakeOrder.Menu;

public abstract class Menu {
    private String menu;
    private int quantity;
    public double totalPrice;

    public Menu(){
    }
    public Menu(String menu,int quantity){
        this.menu=menu;
        this.quantity=quantity;
    }
    public String getMenu() {
        return menu;
    }
    public double getPrice() {
        return quantity * totalPrice;
    }
    public abstract double price();
    public int getQuantity() {
        return quantity + 1;
    }
}
