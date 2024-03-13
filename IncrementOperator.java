class IncrementOperator
{
	public static void main(String[] args) 
	{
		// int a = 2;    //2
		// int b = a++;  //2(3)
		// int c = ++a;  //4(5)
		// System.out.print(a + ++b + ++c);  //12
		// 			   //2+3+5 		


		// int a = 2;  //2
		// int b =++a;	//3
		// System.out.print(++b + ++a);   //8
		// 			   //4+4


		// int a = 3;		//3
		// int b = a++;	//3(5)
		// int c = a++;	//4(5)
		// System.out.print(a++ + b++ + c++ + a + b++ + c++); //27
	    //                  //5(6)+3(4)+4(5)+6+4+5


		// int a = 4;   // 4
		// int b =3;    //3
		// System.out.print(a++ + a + b++ +a + b);  //21
		// 				//4(5)+5+3(4)+5+4


		// int a =2;	//2
		// int b=a;	//2
		// int c=b++;	//2(3)
		// System.out.print(a++ + b++ + c++ + a + b + c);  //17
		// 				//2+3(4)+2(3)+3+4+3

		// int a=4;	//4
		// int b=a++;	//4(5)
		// int c=a;	//5
		// System.out.print(a+b+c); //14
		// 				//4+5+5


		// int a 5++;
		// System.out.print(a);    //cte


		int c=3;	//3
		int d=c++;	//3(4)
		int e=d++;	//3(4)
		// System.out.println(c++ + d++ + e++); //11
					    //4(5)+4(5)+3(4)
		// System.out.println(c+d);
						//4+4
		// System.out.println(c++ + c++ + c++ + c - c++);
		// 				//3(4)+4(5)+5(6)+6-6
		// System.out.println(c + c++ + c++ + c);
		// 				//3+3(4)+4(5)+5
		// System.out.println(c++ + c + c++);
		// 				//3(4)+4+4(5)



    }
}