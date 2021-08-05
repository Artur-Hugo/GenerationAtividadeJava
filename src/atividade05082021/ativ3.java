package atividade05082021;
import java.util.*;
public class ativ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz1[][] = new int[4][6], matriz2[][] = new int[4][6] , mmatriz1[][] = new int[4][6],  mmatriz2[][] = new int[4][6];;
		Random r = new Random();
				for(int l = 0; l < 4; l++){
						for(int c = 0; c < 6; c++){
							matriz1[l][c] = 1 + r.nextInt(300);
							matriz2[l][c] = 1 + r.nextInt(300);
							mmatriz1[l][c] = matriz1[l][c] + matriz2[l][c];
							mmatriz2[l][c] = matriz1[l][c] - matriz2[l][c];
							
						}
					
					}
				


				
				System.out.println("Matriz N1\n");
						for(int l = 0; l < 4; l++){
						for(int c = 0; c < 6; c++){
							System.out.print(matriz1[l][c]+", ");
							
							
						}
						System.out.println();
					}
						System.out.println();

			System.out.println("Matriz N2\n");
						for(int l = 0; l < 4; l++){
						for(int c = 0; c < 6; c++){
							System.out.print(matriz2[l][c]+ ", ");
							
						}
						System.out.println();
					}
						

						System.out.println("\n\nMatriz M1\n");
				for(int l = 0; l < 4; l++){
						for(int c = 0; c < 6; c++){
							
									System.out.print(mmatriz1[l][c]+ ", ");
							 
							
							
						}
						System.out.println();
					}
				System.out.println("\n");

				System.out.println("\n\nMatriz M2\n");
					for(int l = 0; l < 4; l++){
						for(int c = 0; c < 6; c++){
							System.out.print(mmatriz2[l][c]+ ", ");
							 
							
							
						}
						System.out.println();
					}


	}

}
