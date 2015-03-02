import java.util.Scanner;


public class TowerOfHanoi {
	
	static int numberOfMoves= 0;
	static int numberOfRecursiveCalls = 0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Trekkene er: ");
		moveDisk(n, 'A', 'B', 'C');
		System.out.println("Totalt antall trekk: "+ numberOfMoves);
		System.out.println("Antall rekursive kall: " + (numberOfRecursiveCalls));
	}

	public static void moveDisk(int n, char fromTower, char toTower, char auxTower) {
		numberOfMoves++;
		if(n == 1){
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
		}else{
			numberOfRecursiveCalls++;
			moveDisk(n-1, fromTower, auxTower, toTower);
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
			numberOfRecursiveCalls++;
			moveDisk(n-1, auxTower, toTower, fromTower);
		}
		
	}
}
