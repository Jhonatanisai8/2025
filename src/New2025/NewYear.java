package New2025;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class NewYear {
    public static void main(String[] args) throws InterruptedException {
        int year = LocalDate.now().getYear();

        boolean rendirse = false;

        if (year == 2025) {

            System.out.println("¡Bienvenido al 2025!");
            System.out.println("🙏 En este 2025, con Dios todo es posible.");
            System.out.println("💪 Con Su ayuda, nada es imposible.");
            System.out.println("¡Bendiciones y fuerza para este año! 🙌");

            System.out.println("Que este año esté lleno de éxitos y alegría. 🚀");

            for (int dia = 1; dia <= 365; dia++) {
                System.out.println("Día " + dia + " del 2025: ");
                System.out.println("- 🌍 ¡Viaja y disfruta de la vida!");
                System.out.println("- 😊 ¡Haz que cada momento cuente!");
                System.out.println("- 💻 Sigue aprendiendo y creciendo. ");

                if (!rendirse) {
                    System.out.println("- 💪 ¡No te rindas! Estás en el camino correcto.");
                } else {
                    System.out.println("- 😓 ¡Recuerda que todo es parte del proceso! No te rindas.");
                }
                System.out.println();

                TimeUnit.HOURS.sleep(24);
            }

            if (!rendirse) {
                System.out.println("¡Has llegado al final del 2025 sin rendirte! 🎉");
                System.out.println("Recuerda, Dios tiene un propósito para ti. 💪");
            } else {
                System.out
                        .println("Recuerda, el 2025 estuvo lleno de lecciones, ¡sigue adelante en el próximo año! 💪");
            }
        }
    }
}
