
public abstract class TeaDecorator implements Tea
{
    protected String name;
    protected int price;
    protected Tea tea;
    public TeaDecorator(String name, int price, Tea tea){
        this.name = name;
        this.price = price;
        this.tea = tea;
    }
    
    public String getIngredient(){
        return tea.getIngredient()+" 加上 "+ name ;
    }
    
    public int getCost(){
        return price + tea.getCost();
    }
}
