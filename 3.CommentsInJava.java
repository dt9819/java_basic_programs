/**
 This is Documentation Comment.
 @author Deepak Tyagi
 @depricated 
 @exception
 @return
 @see
 @throws
 @version 1.0
*/

class comments_in_java{
	public static void main(String args[]){
	int a=10; // Assign 10 to a, this is single line comment.
	int b=20; // Assign 20 to b, this is also single line comment.
	int c= a+b;
	/* this is multi line comment
	 and is ignored by javadoc.
	*/
	System.out.println("a+b=" +c);
	}
}