/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author user
 */
public final class EjercicioPruebasExamen {

    
 

   public static int sumarHasta(int numero_tope)
    {
        int suma = 0;
        
        for (int i = 0; i <= numero_tope; i++) 
        {
            if( i%2 == 0 )
            {
                suma = suma + i;
            }
        }
        
        return suma;
    }
    
    public static int masaCorporal(double peso, double altura_metros)
    {
        int resultado = 0;
        
        double imc = peso / (altura_metros*altura_metros);
        
        if( imc < 18.5 )
        {
            resultado = -1;
        }
        else
        {
            if( imc >= 18.5 && imc < 25 )
            {
                resultado = 1;
            }
            else
            {
                if( imc >= 25 && imc < 30 )
                {
                    resultado = 2;
                }
                else
                {
                    resultado = 3;
                }
            }
        }
        
        return resultado;
    }
    
    public static int calcularSegundos(int horas, int minutos, int segundos)
    {
        int segundos_totales = 0;
        
        segundos_totales += segundos;
        segundos_totales += (minutos * 60);
        segundos_totales += (horas * 3600);
        
        return segundos_totales;
    }
}

