public class JavaCharacters {
    public static void main (String[] args){
        char myGrade = 'C';
        System.out.println("My grade: " + myGrade);

        //também é possível usar ASCII values
        char myVar1 = 65, myVar2= 66, myVar3= 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        
        //STRINGS

        String greetings = "Hello World\n";
        System.out.println(greetings);

        //USO EM CONTEXTO VIDA REAL

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '€';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
