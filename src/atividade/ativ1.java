package atividade;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in); 
		 Calendar cal = Calendar.getInstance();
		 int  anos, meses, dias, diasconcatenados;
		  
		  
		  
	      System.out.println("Digite a idade em anos:\n");
	      anos = leitor.nextInt();
	      
	      System.out.println("Digite a idade em meses:\n");
	      meses = leitor.nextInt();
	      
	      System.out.println("Digite a idade em dias:\n");
	      dias = leitor.nextInt();
	      
	      cal.set(anos,meses,dias);

	      
	      
		  anos = anos * 365;
		  meses = (meses * 30);
		 
		  diasconcatenados = anos + meses + dias;
		  
		  System.out.println("A idade em dias é: " + "\nDias: " + diasconcatenados);

		  leitor.close();
	
	}

}
