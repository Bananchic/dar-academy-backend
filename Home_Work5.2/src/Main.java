public class Main {
    public static void main(String[] args) {
        //5.4

        int [] myarray = {1,2,3,4,5};
        int result = 0;

        for ( int i = 4; i >= 0; i--) {
            result = myarray[i];
            System.out.print(result);
        }

        //5.5

        int number = 34;
        System.out.println();

        if (number > 1 && number % 2 != 0 && number % number == 0) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }

        // 5.6 i

        char symvol = '*';

        for ( int i = 0; i < 4; i++) {
            for ( int j = 0; j < 10; j++) {
                System.out.print(symvol);
            }
            System.out.println();
        }

        System.out.println();

        // 5.6 ii

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i +1; j++ ) {
                System.out.print(symvol);
            }
            System.out.println();
        }

        System.out.println();

        // 5.6 iii

        for ( int i = 0; i < 6; i++) {
            // для печати пробелов
            for ( int j = i; j < 5; j++ ) {
                System.out.print(" ");
            }
            // для вывода
            for ( int k = 1; k <= i; k++) {
                System.out.print(k);
                if (k > 1)
                    System.out.print(k);
            }

            // дл перехода на следующую линию
            System.out.println();
        }

        System.out.println();

        //5.6.2.7

        int a = 1;
        int b = 5;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        System.out.println();
        //5.6.7.8

        double salary = 100000;
        double prem = 0;
        boolean classA = false;
        boolean classB = false;
        boolean classC = false;

        if (classA) {
            prem = salary * 0.5;
            salary = salary + prem;
            System.out.println(salary);
        }
        else if (classB) {
            prem = salary * 0.25;
            salary = salary + prem;
            System.out.println(salary);
        }
        else if (classC) {
            System.out.println(salary);
        }
        else {
            System.out.println("Error Employee not found");
        }

        System.out.println();

        //5.6.2.9

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int fib = 0;

        System.out.print(n1 + " ");
        System.out.print(n2 +" ");
        System.out.print(n2 +" ");

        for ( int i = 0; i <= 9; i++) {
            n3 = n1 + n2;
            fib = n2+n3;
            System.out.print(fib + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}