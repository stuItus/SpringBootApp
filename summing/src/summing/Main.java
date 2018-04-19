package summing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		System.out.println(sum + " ");
		
		//ЦИКЛИ
				//1. Створіть програму, що виводить на екран всі чотиризначні числа послідовності 1000 1003 1006 1009 1012 1015...

//				for (int i = 1000; i < 10000; i+=3) {
//					System.out.println(i);
//				}
				
				//***
				//2. Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17 ....

//				int a = -1;
//				for (int i = 0; i < 55; i++) {
//					a+=2;
//					System.out.println(a);
//				}
				
				//***
				//3. Створіть програму, що виводить на екран всі невід'ємні елементи послідовності 90 85 80 75 70 65 60 ....

//				for (int i = 90; i >= 0; i -= 5) {
//					System.out.println(i);
//				}
				
				//***
				//4. Створіть програму, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64 128 ....

//				int a = 1;
//				for (int i = 0; i < 20; i++) {
//					a*=2;
//					System.out.println(a);
//				}
				
				//***
				//5. Виведіть на екран всі члени послідовності 2an-1-1, де a1 = 2, які менше 10000.

//				for (int a = 2; a < 10000; a=2*a-1) {
//					System.out.println(a);
//				}
				
				//***
				//6. Виведіть на екран всі двозначні члени послідовності 2an-1 + 200, де a1 = -166.

//				for (int a = -166; a < 100; a=2*a+200) {
//					System.out.println(a);
//				}
				
				//***
				//7. Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури.
				
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the natural number for evaluating factorial:");
//				int n = sc.nextInt();
//				int a = 1;
//				int f = 1;
//				if(n>=0) {
//					for (int i = 1; i <= n; i++) {
//						f=a*i;
//						a=f;
//					}
//					System.out.println(n+"! = "+f);
//				}else {
//					System.out.println("Number must be positive!");
//				}
//				sc.close();
				
				//***
				//8. Виведіть на екран всі позитивні подільники натурального числа, введеного користувачем з клавіатури.

//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the natural number for finding divisors:");
//				int n = sc.nextInt();
//				if(n>0) {
//					for (int i = 1; i <= n; i++) {
//						if(n%i==0) {
//							System.out.print(i+" ");
//						}
//					}
//				}else {
//					System.out.println("Illegal number!");
//				}
//				sc.close();
				
				//***
				//9. Перевірте, чи є введене користувачем з клавіатури натуральне число - простим. Постарайтеся не виконувати зайвих дій (наприклад, після того, як ви знайшли хоча б один нетривіальний дільник вже ясно, що число складене і перевірку продовжувати не потрібно). Також врахуйте, що найменший дільник натурального числа n, якщо він взагалі є, обов'язково розташовується в відрізку [2; √n].

//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the natural number for checking the primality:");
//				int n = sc.nextInt();
//				int a = 0;
//				if(n>0) {
//					for (int i = 1; i <= n; i++) {
//						if(n%i==0) {
//							a++;
//						}
//					}
//				}else {
//					System.out.println("Illegal number!");
//				}
//				if (a>2) {
//					System.out.println("It's a composite number.");
//				}else {
//					System.out.println("It's a prime number.");
//				}
//				sc.close();
				
				//***
				//10. Створіть програму, що виводить на екран 12 перших елементів послідовності 2an-2-2, де a1 = 3 і a2 = 2.

//		 		ЗАВДАННЯ ПО-ДЕБІЛЬНОМУ ПОСТАВЛЕНЕ
				
				//***
				//11. Виведіть на екран перші 11 членів послідовності Фібоначчі. Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен наступний - сумою двох попередніх.
				
//				int a = 1;
//				int b = 1;
//				int f = 0;
//				System.out.println(a);
//				System.out.println(b);
//				for (int i = 0; i < 9; i++) {
//					f = a+b;
//					a = b;
//					b = f;
//					System.out.println(f);
//				}
				
				//***
				//12. Для введеного користувачем з клавіатури натурального числа порахуйте суму всіх його цифр (заздалегідь не відомо скільки цифр буде в числі).
				
//				System.out.println("Enter the natural number for evaluating sum of it's digits:");
//				Scanner sc = new Scanner(System.in);
//				int n = sc.nextInt();
//				int a = 0;
//				if(n>0) {
//					while(n!=0){
//						a=a+n%10;
//						n/=10;
//					}
//					System.out.println("Sum of digits: "+a);
//				}else {
//					System.out.println("Illegal number!");
//				}
//				sc.close();
				
				//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***
				//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***
				
				//МАСИВИ
//				1. Створіть масив з усіх парних чисел від 2 до 20 і виведіть елементи масиву на екран спочатку в рядок, 
//				відокремлюючи один елемент від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент від іншого початком нового рядка). 
//				Перед створенням масиву подумайте, якого він буде розміру.
				
//				int[] arr = new int[20];
//				for (int i = 2; i <= arr.length; i++) {
//					if(i%2==0) {
//						System.out.println(i+" ");
//					}
//				}
				
				//***
//				2. Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на екран у рядок, 
//				а потім цей же масив виведіть на екран теж в рядок, але в зворотному порядку (99 97 95 93 ... 7 5 3 1).
				
//				int[] arr = new int[100];
//				for (int i = arr.length; i >= 1; i--) {
//					if(i%2==1) {
//						System.out.print(i+" ");
//					}
//				}
				
				//***
//				3. Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9]. Виведіть масив на екран. 
//				Підрахуйте скільки в масиві парних елементів і виведете цю кількість на екран на окремому рядку.
				
//				int[] arr = new int[15];
//				Random rnd = new Random();
//				int count = 0;
//				for (int i = 0; i < arr.length; i++) {
//					arr[i]=rnd.nextInt(10);
//					System.out.print(arr[i]+" ");
//					if(arr[i]%2==0) {
//						count++;
//					}
//				}
//				System.out.println();
//				System.out.println("Amount of the even numbers: "+count);
				
				//***
//				4. Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10]. Виведіть масив на екран у рядок. 
//				Замініть кожен елемент з непарним індексом на нуль. Знову виведете масив на екран на окремому рядку.
				
//				int[] arr = new int[8];
//				Random rnd = new Random();
//				for (int i = 0; i < arr.length; i++) {
//					if(i%2==0) {
//						arr[i] = 0;
//						System.out.print(arr[i]+" ");
//					}else {
//						arr[i] = 1 + rnd.nextInt(10);
//						System.out.print(arr[i]+" ");
//					}
//				}
				
				//***
//				5. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5] кожен, виведіть масиви на екран у двох окремих рядках. 
//				Порахуйте середнє арифметичне елементів кожного масиву і повідомте, 
//				для якого з масивів це значення виявилося більше (або повідомте, що їх середні арифметичні рівні).
				
//				int[] arr1 = new int[5];
//				int[] arr2 = new int[5];
//				int c1 = 0;
//				int c2 = 0;
//				Random rnd = new Random();
//				System.out.println("The first array");
//				for (int i = 0; i < arr1.length; i++) {
//					arr1[i]=rnd.nextInt(6);
//					c1=c1+arr1[i];
//					System.out.print(arr1[i]+" ");
//				}
//				System.out.println();
//				System.out.println("THe second array");
//				for (int i = 0; i < arr2.length; i++) {
//					arr2[i]=rnd.nextInt(6);
//					c2=c2+arr2[i];
//					System.out.print(arr2[i]+" ");
//				}
//				if((float)c1/arr1.length>(float)c2/arr2.length) {
//					System.out.println();
//					System.out.println("Arithmetic mean of the first array is bigger");
//				}else if((float)c1/arr1.length<(float)c2/arr2.length){
//					System.out.println();
//					System.out.println("Arithmetic mean of the second array is bigger");
//				}else {
//					System.out.println();
//					System.out.println("Arithmetic means are equal");
//				}
				
				//***
//				6. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99], виведіть його на екран у рядок. 
//				Визначити і вивести на екран повідомлення про те, чи є масив строго зростаючої послідовністю.
				
//				int arr[] = new int[4];
//				for (int i = 0; i < arr.length; i++) {
//					arr[i] = (int) (Math.random()*90+10);
//					System.out.print(arr[i]+", ");
//				}
//				for (int i = 0; i < arr.length; i++) {
//					if (i>0) {
//						if (arr[i-1]>arr[i]) {
//							break;
//						}
//					}
//					if(i==arr.length-1) {
//						System.out.println();
//						System.out.println("Array is strictly incrising!");
//					}
//				}
				
				//***
//				7. Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран. 
//				Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен наступний - сумою двох попередніх.
				
//				int a = 1;
//				int b = 1;
//				int f = 0;
//				int arr[] = new int[20];
//				arr[0] = 1;
//				arr[1] = 1;
//				System.out.print(arr[0]+", ");
//				System.out.print(arr[1]+", ");
//				for (int i = 2; i < 20; i++) {
//					f = a+b;
//					a = b;
//					b = f;
//					arr[i]=f;
//					System.out.print(arr[i]+", ");
//				}
				
				//***
//				8. Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15]. 
//				Визначте який елемент є в цьому масиві максимальним і повідомте індекс його останнього входження в масив.
				
//				int arr[] = new int[12];
//				int max = -15;
//				int index = 0;
//				for (int i = 0; i < arr.length; i++) {
//					arr[i] = (int) (Math.random()*31)-15;
//					System.out.print(arr[i]+", ");
//		        	if (arr[i]>max) {
//		        		max = arr[i];
//		        		index = i;
//		        	}
//				}
//				System.out.println();
//				System.out.println("Max number in the array: " + max + "; It's "+ (index+1) + "th element!");
				
				//***
//				9. Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] і третій масив з 10 дійсних чисел. 
//				Кожен елемент з i-им індексом третього масиву повинен дорівнювати відношенню елементу з першого масиву з i-им індексом до елементу з другого масиву з i-им індексом. 
//				Вивести всі три масиву на екран (кожен на окремому рядку), потім вивести кількість цілих елементів в третьому масиві.
				
//				int intg1[] = new int[10];
//				int intg2[] = new int[10];
//				int count = 0;
//				double real[] = new double[10];
//				System.out.println("First array:");
//				for (int i = 0; i < intg1.length; i++) {
//					intg1[i] = (int) (Math.random()*9)+1;
//					System.out.print(intg1[i]+", ");
//				}
//				System.out.println();
//				System.out.println("Second array:");
//				for (int i = 0; i < intg2.length; i++) {
//					intg2[i] = (int) (Math.random()*9)+1;
//					System.out.print(intg2[i]+", ");
//				}
//				System.out.println();
//				System.out.println("Third array:");
//				for (int i = 0; i < real.length; i++) {
//					real[i] = (double) intg1[i]/intg2[i];
//					System.out.print(real[i]+", ");
//					if (real[i]%1==0) {
//						count++;
//					}
//				}
//				System.out.println();
//				System.out.println("Amount of integer numbers in third array: "+count);
				
				//***
//				10. Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1], виведіть масив на екран у рядок. 
//				Визначте який елемент зустрічається в масиві найчастіше і виведіть про це повідомлення на екран. 
//				Якщо два якихось елемента зустрічаються однакову кількість разів, то не виводьте нічого.
				
//				int arr[] = new int[11];
//				int count0 = 0;
//				int countM1 = 0;
//				int count1 = 0;
//				for (int i = 0; i < arr.length; i++) {
//					arr[i] = (int) (Math.random()*3)-1;
//					System.out.print(arr[i]+", ");
//					if (arr[i]==-1) {
//						countM1++;
//					} else if (arr[i]==1) {
//						count1++;
//					} else if (arr[i]==0) {
//						count0++;
//					}
//				}
//				System.out.println();
//				if(countM1>count1 && countM1>count0) {
//					System.out.println("-1 is the oftenest");
//				} else if (count1>countM1 && count1>count0) {
//					System.out.println("1 is the oftenest");
//				} else if (count0>countM1 && count0>count1){
//					System.out.println("0 is the oftenest");
//				}
				
				//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***
				//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***//***
				
//				ДВОМІРНИЙ МАСИВ
//				1. Створити двовимірний масив з 8 рядків по 5 стовпців в кожній з випадкових цілих чисел з відрізка [10; 99]. Вивести масив на екран.
				
//				int arr[][] = new int[8][5];
//				for (int i = 0; i < 8; i++) {
//					for (int j = 0; j < 5; j++) {
//						arr[i][j] = (int) (Math.random()*90)+10;
//						System.out.print(arr[i][j]+" ");
//					}
//					System.out.println();
//				}
						
//				2. Створити двовимірний масив з 5 рядків по 8 стовпців в кожній з випадкових цілих чисел з відрізка [-99; 99]. Вивести масив на екран. 
//				Після на окремому рядку вивести на екран значення максимального елемента цього масиву (його індекс не має значення).
				
//				int arr[][] = new int[5][8];
//				int max = -99;
//				for (int i = 0; i < 5; i++) {
//					System.out.println();
//					for (int j = 0; j < 8; j++) {
//						arr[i][j] = (int) (Math.random()*199)-99;
//						System.out.print(arr[i][j]+" ");
//						if(arr[i][j]>max) {
//							max=arr[i][j];
//						}
//					}
//				}
//				System.out.println();
//				System.out.println("Max element: "+max);
	}
}
