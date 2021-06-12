package Strategy.Tarea15;

public class ClothesContext {
    private String season;
    private String type;
    private String color;
    private int price;

    private IStrategySales strategySales;

    public  ClothesContext(){}

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public IStrategySales getStrategySales() {
        return strategySales;
    }

    public void setStrategySales(IStrategySales strategySales) {
        this.strategySales = strategySales;
    }

    public void execute(){
        this.strategySales.execute(this);
    }

    public void showInfo(){
        System.out.println("Temporada: "+season);
        System.out.println("Tipo de prenda: "+type);
        System.out.println("Color: "+color);
        System.out.println("Precio normal: "+price);
    }
}
