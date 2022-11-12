import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {

    private int money = 40000;

    public int getMoney () {
        this.money = money;
        return money;
    }

    String moneySaver;


    public void MoneySaver() {
        if(money >= 40000){
            System.out.println("mdidaria");
            moneySaver = "mdidaria";
        }else if (money >= 10000){
            System.out.println("sashualo");
            moneySaver = "sashualo";
        }else{
            System.out.println("gharibia");
            moneySaver = "gharibia";
        }
    }

    public void FamilyBudgetSaver() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\nikam\\IdeaProjects\\JavaTraining\\src/budget.txt");
            fw.write(moneySaver);
            fw.close();
            System.out.println("successs!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
