
public class GreenTea implements Tea
{
    private String name = "Greentea";
    private int price = 20;
    
    public String getIngredient(){
        return name;
    }
    public int getCost(){
        return price;
    }
}
