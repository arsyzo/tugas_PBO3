/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_cth.matematika;

/**
 *
 * @author Marsy
 */
public class DemoKonversiSuhu {
    public static void main(String[] args){
        KonversSuhu s1 = new KonversSuhu();
        KonversiSuhu2 s2 = new KonversiSuhu2();
        
        double celcius = 25;
        double fahrenheit = 77;
        
        System.out.print("celcius ke fahrenheit: " + s1.celciusToFahrenheit(celcius));
        System.out.print("celcius ke reamur: " + s1.celciusToReamur(celcius));
        System.out.print("fahrenheit ke reamur: " + s2.fahrenheitToreamur(fahrenheit));
//        System.out.print(celcius);
    }

}
