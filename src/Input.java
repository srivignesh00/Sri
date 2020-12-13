import java.util.Scanner;

public interface Input {
    Scanner sc = new Scanner(System.in);
    public static void select(){
        System.out.println("Category : 1.Mobiles  2.Electronics");
        String category = sc.nextLine().toLowerCase();

        if(category.equals("mobiles")) {
            new ExaminationPage().mobile();
        }

        else if(category.equals("electronics")){
            new ExaminationPage().electronics();
        }
        else
            System.out.println("Sorry, Not found");


    }
}