package friendNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Girilen sayilarin arkadas sayi olup olmadigini bulan prog.
		//Arkadas sayi : iki sayi birbirinin kendisi haric bölenleri toplamina eþit ise bu sayilar arkadas sayidir.
		//220-284
		Scanner scan = new Scanner(System.in);
		int number1total=0;//toplam
		int number2total=0;
		System.out.print("Enter first number = ");//Birinci sayi
		int number1 = scan.nextInt();//1.sayi
		System.out.print("Enter second number = ");//ikinci sayi
		int number2 = scan.nextInt();//2.sayi
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				number1total+=i;
			}
		}

		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				number2total+=j;
			}
		}
		System.out.println(number1total);
		System.out.println(number2total);
		if (number1total==number2 && number2total==number1) {
			System.out.println(number1 + " and " + number2 + " are friends number. ");
		} else {

			System.out.println("Friends are not numbers. ");
		}
	}

}
