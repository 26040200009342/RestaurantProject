package Bill;
import MakeOrder.Menu.Menu;

public abstract class Bill extends Menu{
    private Menu[] menus;

    public Bill(Menu[] menus) {
        this.menus = menus;
    }
    @Override
    public double price() {
        return getPrice();
    }
    
    public void printBill() {
        double total = 0.0;
        System.out.println("------ Bill ------");
        for (Menu menu : menus) {
            String menuName = menu.getMenu();
            double price = menu.price();
            int quantity = menu.getQuantity();
            total += price;
            System.out.printf("%s           %d          %.2f\n", menuName, quantity, price);
        }
        System.out.printf("Total: %.2f\n", total);
    }
}