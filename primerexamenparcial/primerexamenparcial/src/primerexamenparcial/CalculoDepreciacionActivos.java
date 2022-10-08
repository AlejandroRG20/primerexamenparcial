package primerexamenparcial;
import java.util.Scanner;
public class CalculoDepreciacionActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double CostoActivo, Valordesecho, VidaUtil;
		String Nempresa, adq;
		String nmes;
		int entrada1, entrada2, dia, mes, año;
	
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("******CALCULO DE DEPRECIACION*****");
		
		System.out.println("Como se llama la empresa?:");
		Nempresa=n.next();
		
		
		System.out.println("Que adquirio la empresa?:");
		adq=n.next();
	do {	
		System.out.println("1.De Edificios\n2. De Equipo de trasporte\n3. De Maquinaria y Equipo\nEn que categoria se encuentra la adquisicion?\n ");
		entrada1=n.nextInt();
		if(entrada1<=0 || entrada1>3) {System.out.println("Error, seleccione una opcion correcta");}
	}while(entrada1<=0 || entrada1>3);
	
		switch(entrada1) {
		
		case 1:
			
			System.out.println("1. Industriales\n2. Comerciales\n3. Residencia del propietario destinada ala explotacion agropecuaria\n4. Instalaciones Fijas en explotacion agropecuaria\n5. Para los Edificios de alquiler\n Dentro de que clasificasion se encuentra?");
			entrada2=n.next();
			
			if(entrada2==1) {
				
				System.out.println("En que fecha lo adquirio?:");
				do {	
					System.out.println("Dia:");
					dia=n.nextInt();
					if(dia<0 || dia>31) {System.out.println("Error, digite el dato correcto");}
				}while(dia<0 || dia>31);
					
				do {	
					System.out.println("Mes:");
					mes=n.nextInt();
					if(mes<0 || mes>12) {System.out.println("Error, digite el dato correcto");}
				}while(mes<0 || mes>12);
				
				switch(mes) {
				
				case 1: nmes = "Enero";
				break;
				case 2: nmes="Febrero";
				break;
				case 3: nmes="Marzo";
				break;
				case 4: nmes="Abril";
				break;
				case 5: nmes="Mayo";
				break;
				case 6: nmes="Junio";
				break;
				case 7: nmes="Julio";
				break;
				case 8: nmes="Agosto";
				break;
				case 9: nmes="Septiembre";
				break;
				case 10: nmes="Octubre";
				break;
				case 11: nmes="Noviembre";
				break;
				case 12: nmes="Diciembre";
				break;
				
				}
				
			  do {
				  System.out.println("Anio:");
				  año=n.nextInt();
				  if(año<0) {System.out.println("Error, digite un dato correcto");}
			  }while(año<0);
				
			}
			
		
		
		}
		
		System.out.println("En que fecha lo adquirio?:");
	do {	
		System.out.println("Dia:");
		dia=n.nextInt();
		if(dia<0 || dia>31) {System.out.println("Error, digite el dato correcto");}
	}while(dia<0 || dia>31);
		
	do {	
		System.out.println("Mes:");
		mes=n.nextInt();
		if(mes<0 || mes>12) {System.out.println("Error, digite el dato correcto");}
	}while(mes<0 || mes>12);
	
	switch(mes) {
	
	case 1: nmes = "Enero";
	break;
	case 2: nmes="Febrero";
	break;
	case 3: nmes="Marzo";
	break;
	case 4: nmes="Abril";
	break;
	case 5: nmes="Mayo";
	break;
	case 6: nmes="Junio";
	break;
	case 7: nmes="Julio";
	break;
	case 8: nmes="Agosto";
	break;
	case 9: nmes="Septiembre";
	break;
	case 10: nmes="Octubre";
	break;
	case 11: nmes="Noviembre";
	break;
	case 12: nmes="Diciembre";
	break;
	
	}
	
  do {
	  System.out.println("Anio:");
	  año=n.nextInt();
	  if(año<0) {System.out.println("Error, digite un dato correcto");}
  }while(año<0);
	
  
  
  
	}

}
