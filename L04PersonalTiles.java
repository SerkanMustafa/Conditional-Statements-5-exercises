package ConditionalStatements5ProverkiSwitchCase;

import java.util.Scanner;

public class L04PersonalTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if(gender.equals("m"))
        {
            if(age<16)
            {
                System.out.println("Master");
            }
            else
                {
                    System.out.println("Mr");
                }
        }
        if(gender.equals("f"))
        {
            if(age<16)
            {
                System.out.println("Miss");
            }
            else
            {
                System.out.println("Ms");
            }
        }

    }
}
