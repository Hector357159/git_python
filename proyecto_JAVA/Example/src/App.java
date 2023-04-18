public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int age;

        User u = new User();
        u.name = "Caleb";
        u.membership = "Gold";

        User u2 = new User();
        u2.name = "Sally";
        u2.membership = "Silver";
        age = 28;

        System.out.println(u.name);
        System.err.println(u2.name);
        System.out.printf(" %d hola la suma total es :",Sumar(12,13));
    }
    // Printf: para imprimir en formato 
    // %c character
    // %d decimal (integer) number (base 10)
    // %e exponential floating-point number
    // %f floating-point number
    // %i integer (base 10)
    // %o octal number (base 8)
    // %s String
    // %u unsigned decimal (integer) number
    // %x number in hexadecimal (base 16)
    // %t formats date/time
    // %% print a percent sign
    // \% print a percent sign

    static int Sumar(int numero, int numero2) {
        int sumar = numero + numero2;
        return sumar;
    }
}
