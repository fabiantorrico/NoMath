import java.util.Scanner;
public class NoMath{
	public static void main(String [] args){
	output(f(x())+g(y()));
	output(pow(x()));
	output(sqrt(v())+ abs(w())+ f(x())+ g(y()));
	}
		public static void output(int x){
			System.out.println(x);}
		public static int f(int x){
			return x;
	}
		public static int g(int y){
			return y;
	}			public static int x(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for x");
		return keyboard.nextInt();}
	public static int y(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for y");
		return keyboard.nextInt();}
	
		public static int v(){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a number to square root");
			return keyboard.nextInt();
			}	
		public static int abs(int w){
			if (w<0){
				w=(w/-1);}
			return w;}
		public static int w(){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter number to find the absolute value");
			return keyboard.nextInt();
			}	
		public static int pow(double x){
			return (int) (x*x*x*x*x*x*x*x*x*x);
			}
					
		public static int sqrt(int v){
			double t;
			double sr = v/2;
			do{t=sr;
			sr=(t+(v/t))/2;}
			while ((t-sr)!=0);
			return (int) v;}	
}

