package es.studium.Simetrica;

import java.util.Scanner;

public class Simetrica
{

	public static void main(String[] args)
	{
		int tabla [][] = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		boolean simetrica = false;
		//Leemos los valores de la tabla
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Ingrese los valores: ("+i+"-"+j+")");
				tabla[i][j]=teclado.nextInt();

			}

		}
		teclado.close();
		//Recorremos la tabla para ver si es sim�trica
		for(int i=0; i<3&&(simetrica); i++)
		{
			for(int j=0; j<3&&(simetrica); j++)
			{
				if(tabla[i][j]!=tabla[j][i])
				{
					simetrica=false;
				}
			}
		}
		if(simetrica)
		{
			System.out.println("La matriz si es sim�trica");
		}
		else
		{
			System.out.println("La matriz no es sim�trica");
		}

	}

}
