package unidad2condicionales;

public class Ejemplo1Condicional 
{

	public static void main(String[] args) 
	{
		
		int sueldo=1400;
		int edad=(int)(Math.random()*84)+16;
		
		//Si el empleado tiene mas de 55 años le  añadimos 400 euros al sueldo
		if (edad>55) 
		{
			//Codigo que se ejecuta si la condicion es cierta
			sueldo=sueldo+400;
		}
		//Mostramos por pantalla los datos
		System.out.println("La edad es " + edad + ", y su sueldo es " + sueldo);

	}

}
