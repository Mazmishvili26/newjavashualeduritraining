import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FamilyMember {

    private String name () {
        String firstName = "Nikoloz";
        return firstName;
    }

    private String lastName() {
        String lastName = "Mazmishvili";
        return lastName;
    }

    private int age () {
        int age = 21;
        return age;
    }

    private String status () {
        String status = "Student";
        return status;
    }

    public FamilyMember () {
        this.name();
        this.lastName();
        this.age();
        this.status();
    }


    public void TextGenerator () {

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\nikam\\IdeaProjects\\JavaTraining\\src/family.txt");
            FamilyMember fm  = new FamilyMember();

            pw.println(fm.name());
            pw.println(fm.lastName());
            pw.println(fm.age());
            pw.println(fm.status());
            pw.close();

            System.out.println("success!!! \n");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void takeMoney () {
        FamilyBudget fg = new FamilyBudget();
        int money = fg.getMoney();

        int getMoney;
        Scanner sc = new Scanner(System.in);
        System.out.println("moitxovet sasurveli tanxa : ");
        getMoney = sc.nextInt();

        if(getMoney <= money){
            System.out.println("motxovna warmatebit shesrulda!!!");
        }
        else if(getMoney > money){
            System.out.println("motxovnis uaryofa, motxovnili tanxa agemateba arsebuls!!!");
        }

    }


}
