import java.util.*;
class menu1
{

	public static void main(String[] args) {
		int num1,num2;
		Scanner x=new Scanner(System.in);


	System.out.println("\n======================================");
	System.out.println("\n\n\n\n\n\n MENU");
	System.out.println("\n======================================");
	System.out.println("\n 1. ADDITION");
	System.out.println("\n 2. SUBTRACTION");
	System.out.println("\n 3. MULTIPLICATION");
	System.out.println("\n 4. DIVISION");
	System.out.println("\n 5. REMINDER");
	System.out.println("\n 6. EXIT");
	System.out.println("\n======================================");
	System.out.print("\n Please Enter Your Choice:-");
	int choice=x.nextInt();
	switch(choice)
	{
	case 1: System.out.println("Enter 2 Nos");
			num1=x.nextInt();
			num2=x.nextInt();
			System.out.println("Sum="+ (num1+num2));
			break;
	case 2: System.out.println("Enter 2 Nos");
	num1=x.nextInt();
	num2=x.nextInt();
	System.out.println("Subtract="+ (num1-num2));
	break;

	case 3: System.out.println("Enter 2 Nos");
	num1=x.nextInt();
	num2=x.nextInt();
	System.out.println("Product="+ (num1*num2));
	break;

	case 4: System.out.println("Enter 2 Nos");
	num1=x.nextInt();
	num2=x.nextInt();
	System.out.println("DIVISION="+ (num1 / num2));
	break;

	case 5: System.out.println("Enter 2 Nos");
	num1=x.nextInt();
	num2=x.nextInt();
	System.out.println("REMINDER="+ (num1 % num2));
	break;

	case 6: System.out.println("End of the program");
	break;

	default: System.out.println("Invalid Choice Input Again");
	break;
	}
	}

}
