/* 	This is deprecated method.
	Compiler will generate warning message.
*/
import java.io.*;
class InteractiveInput{
	public static void main(String args[]){
		String s=" ";
		DataInputStream val = new DataInputStream(System.in);
		try{
			System.out.println("Enter Your Name:");
			s = val.readLine();
		}
		catch(Exception e){}
		System.out.println(s+" Welcome to Java.");
	}
}