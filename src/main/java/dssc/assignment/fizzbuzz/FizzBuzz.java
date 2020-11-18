package dssc.assignment.fizzbuzz;


public class FizzBuzz {

    public static void main(String... args) {

        boolean a3=false, a5=false;
        for(int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                a3 = true;
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                a5 = true;
                System.out.print("Buzz");
            }
            if(a3 || a5) {
                System.out.println();
                a3 = a5 = false;
            }
            else
                System.out.println(i);
        }



    }

}
