/* Operators in Java
1. Arithmetical Operators
2. Assignment Operators
3. Comparison Operator
4. Unary Operator
5. Shift Operator
6. Bitwise Operator
7. Logical Operator
8. Conditional Operator
9. Instance of and member selection operator
10. New Operator
*/

/* Precedence of Operators
Rank	Operator Type 					Operators
 1.	Function Call,dot operator			() [] .
	array reference 
 2. Unary operator						++, --,~,!
 3. Creation (or) type casting			new, (type)expression
 4. Multiplicative						*,/,%
 5. Additive							+,-
 6. Shift								>>,<<,>>>
 7. Relation inequality					>,>=,<,<=, instanceof
 8. Relation equality					==,!=
 9. Bitwise AND							&
10. Bitwise XOR							^
11. Bitwise OR							|
12. Logical AND							&&
13. Logical OR							||
14. Ternary (Conditional)				?:
15. Assignment and Shorthand Assignment	=,+=,-=,/=,%=,&=,^=,!=,<<=,>>=,>>>=
*/
import java.io.*;
class Operators{
	public static void main(String args[]) throws IOException{
		int a=10,b=30;
		/*InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter The Value of a:");
		a = br.readLine();
		System.out.println("Enter The Value of b:");
		b = br.readLine();*/
		System.out.println("a+b ="+(a+b));
		System.out.println("a-b ="+(a-b));
		System.out.println("a/b ="+(a/b));
		System.out.println("a*b ="+(a*b));
		System.out.println("a%b ="+(a%b));
		System.out.println("a<b ="+(a<b));
		System.out.println("a>b ="+(a>b));
		System.out.println("a<=b ="+(a<=b));
		System.out.println("a>=b ="+(a>=b));
		System.out.println("a==b ="+(a==b));
		System.out.println("a!=b ="+(a!=b));
		System.out.println("a++ ="+(a++));
		System.out.println("++a ="+(++a));
		System.out.println("a>>3 ="+(a>>3));
		System.out.println("a<<2 ="+(a<<2));
		System.out.println("a>>>2 ="+(a>>>2));
		System.out.println("a&b ="+(a&b));
		System.out.println("a^b ="+(a^b));
		System.out.println("a|b ="+(a|b));
		
	}
}