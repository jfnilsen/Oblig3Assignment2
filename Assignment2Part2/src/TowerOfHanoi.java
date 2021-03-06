import java.util.Scanner;


public class TowerOfHanoi {
	
	static int numberOfMoves= 0;
	static int numberOfRecursiveCalls = 0;
	static int totalDisks = 0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Trekkene er: ");
		moveDisk(n, 'A', 'B', 'C');
	}

	public static void moveDisk(int n, char fromTower, char toTower, char auxTower) {
		++numberOfMoves;
		totalDisks = n;
		if(n == 1){
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
			if(numberOfMoves == (Math.pow(2,totalDisks)-1)){
				System.out.println("Totalt antall trekk: "+ numberOfMoves);
				System.out.println("Antall rekursive kall: " + (numberOfRecursiveCalls));
				numberOfMoves = 0;					
				numberOfRecursiveCalls = 0;
			}
		}else{
			numberOfRecursiveCalls++;
			moveDiskHelper(n-1, fromTower, toTower, auxTower);
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
			numberOfRecursiveCalls++;
			moveDiskHelper(n-1, auxTower, toTower, fromTower);
			
		}
	

	}
	public static void moveDiskHelper(int n, char fromTower, char toTower, char auxTower) {
		++numberOfMoves;
		if(n == 1){
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
			if(numberOfMoves == (Math.pow(2,totalDisks)-1)){
				System.out.println("Totalt antall trekk: "+ numberOfMoves);
				System.out.println("Antall rekursive kall: " + (numberOfRecursiveCalls));
				numberOfMoves = 0;					
				numberOfRecursiveCalls = 0;
			}
		}else{
			numberOfRecursiveCalls++;
			moveDiskHelper(n-1, fromTower, auxTower, toTower);
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
			numberOfRecursiveCalls++;
			moveDiskHelper(n-1, auxTower, toTower, fromTower);
			
		}
	

	}
}
