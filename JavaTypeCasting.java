public class JavaTypeCasting {
    public static void main (String[] args){
        /*Type Casting significa transformar
        um data type em outro, como int para double.
        No Java existem 2 tipos de Casting:

        Widening Casting (automatico): converte um 
        data type menor num maior
        byte -> short -> char -> int -> long -> float -> double
        
        Narrowing Casting (manual): converte um data type maior
        num menor
        double -> float -> long -> int -> char -> short -> byte */

        //WIDENING CASTING
        int myInt1 = 9;
        double myDouble1 = myInt1;

        System.out.println(myInt1);
        System.out.println(myDouble1);

        //NARROWING CASTING
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; //manual casting: double to int

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
