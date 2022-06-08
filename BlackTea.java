
public class BlackTea implements Tea
{
    private String name = "Blacktea";
    private int price = 20;
    
    public String getIngredient(){
        return name;
    }
    public int getCost(){
        return price;
    }
}
