
public class TeaTest
{
    public static void main(String[] args) {
        Tea greenTea = new GreenTea();
        Tea greenMilkTea = new Milk(greenTea);
        System.out.println("greenMilkTea的配料表為"+greenMilkTea.getIngredient());
        System.out.println("greenMilkTea的價格為"+greenMilkTea.getCost());
        
        Tea blackTea = new BlackTea();
        Tea bubbleBlackTea = new Pearl(blackTea);
        Tea bubbleMilkBlackTea = new Milk(bubbleBlackTea);
        Tea sugarBubbleMilkBlackTea = new Sugar(bubbleMilkBlackTea);
        System.out.println("sugarBubbleMilkBlackTea的配料表為"+sugarBubbleMilkBlackTea.getIngredient());
        System.out.println("sugarBubbleMilkBlackTea的價格為"+sugarBubbleMilkBlackTea.getCost());
    }
}
