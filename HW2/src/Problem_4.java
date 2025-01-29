import java.util.Scanner; 

public class Problem_4 {
    public static void main(String[] args) throws Exception {

        Scanner Base_Annual_Salary_Input = new Scanner(System.in);
        System.out.print("Please enter employee's salary --> ");
        float Base_Annual_Salary = Base_Annual_Salary_Input.nextFloat();
        Base_Annual_Salary_Input.close();

        float Retroactive_Pay = ((Base_Annual_Salary / 2) * 1.076f) - (Base_Annual_Salary / 2);
        System.out.println("Retroactive Pay --> $" + Retroactive_Pay);

        float Adjusted_Annual_Salary = Base_Annual_Salary * 1.076f;
        System.out.println("New Annual Salary --> $" + Adjusted_Annual_Salary);

        float Adjusted_Monthly_Salary = Adjusted_Annual_Salary / 12;
        System.out.println("New Monthly Salary --> $" + Adjusted_Monthly_Salary);
    }
}
