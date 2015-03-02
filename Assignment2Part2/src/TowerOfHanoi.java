import java.util.Scanner;


public class TowerOfHanoi {
	
//	static int numberOfMoves= 0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Trekkene er: ");
		moveDisk(n, 'A', 'B', 'C');
//		System.out.println("Totalt antall trekk: "+ numberOfMoves);
	}

	public static void moveDisk(int n, char fromTower, char toTower, char auxTower) {
		if(n == 1){
//			numberOfMoves++;
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
		}else{
//			numberOfMoves++;
			moveDisk(n-1, fromTower, auxTower, toTower);
			System.out.println("Beveg disk " + n + " fra " + fromTower + " til " + toTower);
			moveDisk(n-1, auxTower, toTower, fromTower);
		}
		
	}
}
