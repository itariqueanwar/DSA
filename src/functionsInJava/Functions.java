package functionsInJava;

public class Functions {
    /*
//    takes nothing return nothing
    takes something return nothing
    takes nothing return something
    takes something return something
    */

    static void print(){
        System.out.println("Hi this is a function");
    }

    static void add(int a, int b){
        System.out.println(a + b);
    }

    static float sum(){
        return 10 + 20;
    }

    static char gender(){
        return 'M';
    }


    static int multiplication(int a, int b, int c){
        return a * b * c;
    }
    public static void main(String[] args) {

        float a = sum();
        System.out.println(a);

        char gender = gender();
        System.out.println(gender);

        int prod = multiplication(10 ,20, 30);
        System.out.println(prod);
//    add(450, 20);
//        print();
//
    }
}
