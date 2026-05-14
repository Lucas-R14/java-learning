public class JavaNumbers {
    public static void main (String[] args){
        byte myByte = 100; //consegue armazenar de -128 até 127
        System.out.println("Byte: " + myByte);

        short myShort = 5000; //consegue armazenar de -32768 to 32767
        System.out.println("Short: " + myShort);
        
        int myInt = 100000; //consegue armazenar de -2147483648 to 2147483647
        System.out.println("Int: " + myInt);

        long myLong = 15000000000L; //consegue armazenar de -9223372036854775808 to 9223372036854775807 | deve terminar a variavel com um "L"
        System.out.println("Long: " + myLong);

        // FLOATING POINT TYPES

        float myFloat = 5.75f; //consegue armazenar valores com casas decimais, tem que terminar com f
        System.out.println("Float: " + myFloat);
        
        double myDouble = 9.99d; //consegue armazenar valores com casas decimais, tem que terminar com d
        System.out.println("Double: " + myDouble);

        //SCIENTIFIC NUMBERS

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("Numero cientifico float: " + f1);
        System.out.println("Numero cientifico double:" + d1);
    }
}
