import java.util.ArrayList;

public class JavaVarKeyword {
    public static void main (String[] args){
        /*no Java 10 a keyword "var" foi introduzida
        para detectar automaticamente o tipo de variavel*/

        var x = 5;
        System.out.println(x);

        //exemplo com tipos diferentes de variáveis

        var myNum = 5;              //int
        var myDouble = 22.98d;      //double
        var myChar = 'D';           //char
        var myBoolean = true;       //boolean
        var myString = "Hello";     //String

        /*esses valores do "var" só funcionam
        se for atribuido valores */

        //var x;        vai correr um erro
        //var x = 5;    OK

        /*uma vez que o tipo de variável é
        escolhido, ele continua igual */

        var y = 5;      //tipo int
        y = 10;         //OK
        //y = 9.99d;      //ERRO

        /*usamos o "var" em situações onde os tipos de 
        variaveis são mais complexos, como o ArrayList
        ou HashMap.
        O "var" deixa o code menor e mais fácil de ler */
    }
}
