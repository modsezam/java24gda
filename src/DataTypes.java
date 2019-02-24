public class DataTypes {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("\n>>> Task 1 - #datatypes");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        System.out.println("\n>>> Task 2");
        int d = 4;
        System.out.println("d * d * d = " + d * d * d);

        System.out.println("\n>>> Task 3");
        int e = 5;
        if ((e % 2) == 0)
            System.out.println( e + " is even number");
        else
            System.out.println( e + " is odd number");

        System.out.println("\n>>> Task 4");
        int f = 15;
        if ( (f % 3) == 0 && (f % 5) == 0 )
            System.out.println( f + " jest podzielne przez 3 i 5");
        else
            System.out.println( f + " nie jest podzielne przez 3 i 5");


        System.out.println("\n>>> Task 5");
        char g = 65;
        //char g2 = 'A';
        //System.out.println("A - " + (int)g2);
        for (int i = 0; i < 5; i++){
            System.out.println( (i + 1) + " the number of the Latin alphabet: " + (char)(g + i) );
        }

        char h = 1488;
        for (int i = 0; i < 5; i++){
            System.out.println( (i + 1) + " the number of the Hebrew alphabet: " + (char)(h + i) );
        }

        char j = 3840;
        for (int i = 0; i < 5; i++){
            System.out.println( (i + 1) + " the number of the Tibetan alphabet: " + (char)(j + i) );
        }

        System.out.println("\n>>> Task 6_1");
        char h1 = 74, h2 = 65, h3 = 86, h4 = 65, h5 = 32, h6 = 8658, h7 = 32, h8 = 9786;
        System.out.println( h1 + ", "  + h2 + ", " + h3 + ", " + h4 + ", "  + h5 + ", " + h6 + ", " + h7 + ", " + h8 );

        //System.out.println( (char)74 + ", "  + (char)65 + ", " + (char)86 + ", " + (char)65 + ", "  + (char)32 + ", "
        //                    + (char)8658 + ", " + (char)32 + ", " + (char)9786 );

        System.out.println("\n>>> Task 6_2");
        char[] hChar = {74, 65, 86, 65, 32, 8658, 32, 9786};
        for (int i = 0; i<7; i++){
            System.out.print(hChar[i] + ", ");
        }
        System.out.println(hChar[7]);


    }
}
