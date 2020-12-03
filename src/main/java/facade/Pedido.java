package facade;

public class Pedido {

    public Pedido (String... items) {
        this.items = items;
    }

    private String[] items;

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
    
}
