//intento de ejercicio3
public class Ejercicio3Ansa {
    public static void main(String[] args) {
        int nf = 9;
        int esp;
        for (int i = 1; i <= nf; i++) {
            for ( esp = nf; esp > i; esp--) {
                System.out.print(" . ");
            }

            for ( esp = 1; esp <= i; esp++) {
                System.out.print(esp);
            }
        }
    }
}
