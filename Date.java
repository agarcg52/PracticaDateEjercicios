package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +	" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia

		if (day < 1 || day > 31) {
			throw new DateException("Dia " + day + " no valido" +	" Valores posibles entre 1 y 31.");
		} else {
			this.day = day;
		}
	}


	public String getNameOfMonth(int mes){

		StringBuffer nombre = new StringBuffer();		
		
		switch(mes){

			case 1: nombre.append("Enero"); 
				break;
			case 2: nombre.append("Febrero"); 
				break;
			case 3: nombre.append("Marzo"); 
				break;
			case 4: nombre.append("Abril"); 
				break;
			case 5: nombre.append("Mayo");  
				break;
			case 6: nombre.append("Junio");  
				break;
			case 7: nombre.append("Julio");  
				break;
			case 8: nombre.append("Agosto"); 
				break;
			case 9: nombre.append("Septiembre");
				break;
			case 10: nombre.append("Octubre");  
				break;
			case 11: nombre.append("Noviembre");
				break;
			case 12: nombre.append("Diciembre");
				break;
			default: System.out.println("Número de mes incorrecto.");
			break;
		}
		return nombre.toString;

	}

	public String getEstacion(int mes){

		StringBuffer salida = new StringBuffer();

		switch(mes){
			case 1:
			case 2:
			case 3:
				salida.append("Invierno");
				break;
			case 4:
			case 5:
			case 6:
				salida.append("Primavera");
				break;
			case 7:
			case 8:
			case 9:
				salida.append("Verano");
				break;
			case 10:
			case 11:
			case 12:
			salida.append("Invierno");
			break;

		}

		return salida.toString();
	}

	public String getMesesRestantes(int mes){

		int i;
		StringBuffer salida = new StringBuffer();

		for(i=mes;i <= 12;i++){
			salida.append(getNameOfMonth(i) + "\n");
		}

		return salida.toString();
	}

	public String diasRestantes(int dia){

		int i;
		StringBuffer salida = new StringBuffer();

		for(i=dia;i <= 31;i++){
			salida.append(i + " ");
		}

		return salida.toString();
	}

	public String mismosDiasMes(int mes){

		StringBuffer salida = new StringBuffer();

		switch (mes){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			salida.append("Enero Marzo Mayo Julio Agosto Octubre Diciembre");
			break;

			case 2:
			salida.append("Febrero");
			break;

			case 4:
			case 6:
			case 9:
			case 11:
			salida.append("Abril Junio Septiembre Noviembre");
			break;
		}

		return salida.toString();
	}

	public boolean comprobacionDia(int mes){


		boolean check = true;

		switch (mes){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			if (dia < 1 || dia > 31){
				check = false;
			}
			break;

			case 2:
			if (dia < 1 || dia > 28){
				check = false;
			}
			break;

			case 4:
			case 6:
			case 9:
			case 11:
			if (dia < 1 || dia > 31){
				check = false;
			}
			break;
		}
	
		return check;
	}

	public boolean checkMonth(){

		
		boolean check = true;

		if (mes < 1 && mes > 12){
			check = false;
		}

		return check;
	}

	public boolean isSameMonth(int mes){

		if(this.month == mes){

			return true;
		}
		return false;
	}

	public boolean isSameYear(int anyo){

		if(this.year == anyo){

			return true;
		}
		return false;;
	}

	public boolean isSameDay(int day){

		if(this.day == day){

			return true;
		}
		return false;
	}

	public boolean isSame(){

		if( isSameMonth() && isSameDay() && isSameYear() ){

			return true;
		else	
			return false;
	}


	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}
