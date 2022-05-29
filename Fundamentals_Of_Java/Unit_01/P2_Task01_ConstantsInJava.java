package Unit_01;

public class P2_Task01_ConstantsInJava {
	private static final double Pi=3.14;
	public static void main(String[] args) {
		final int a=10;
		//a=11;		//ERROR ARISES BECAUSE WE MAKE THE STATIC REFERENCE TO NON-STATIC VARIABLES
		System.out.println(a);
		int x=add(1,2);
		System.out.println(x);
	}
	static int add(int a,int b) {
		System.out.println(a);
		System.out.println(Pi);
		return(a+b);
	}
}