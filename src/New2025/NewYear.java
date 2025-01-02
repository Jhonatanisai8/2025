package New2025;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class NewYear {
    public static void main(String[] args) throws InterruptedException {
        int year = LocalDate.now().getYear();

        boolean noRendirse = true;

        if (year == 2025) {
            System.out.println("¡Bienvenido al 2025!");
            System.out.println("Que este año esté lleno de éxitos, alegría y grandes logros para ti.");
            System.out.println(
                    "Aprovecha cada día al máximo con actividades como viajar, disfrutar, y programar mucho. 🚀");

            for (int dia = 1; dia <= 365; dia++) {
                System.out.println("Día " + dia + " del 2025: ");
                System.out.println("- 🌍 ¡Viaja y descubre nuevos lugares!");
                System.out.println("- 😊 Disfruta de los momentos con tus seres queridos.");
                System.out.println("- 💻 Dedica tiempo a programar y aprender algo nuevo.");
                System.out.println("- 🎯 Recuerda: cada día es una nueva oportunidad para crecer.");

                if (noRendirse) {
                    System.out.println("- 💪 ¡No te rindas! Estás en el camino correcto.");
                } else {
                    System.out.println("- 😓 ¡Recuerda que todo es parte del proceso! No te rindas.");
                }
                System.out.println();

                TimeUnit.HOURS.sleep(24);
            }

            if (noRendirse) {
                System.out.println("¡Has llegado al final del 2025 sin rendirte! 🎉");
            } else {
                System.out
                        .println("Recuerda, el 2025 estuvo lleno de lecciones, ¡sigue adelante en el próximo año! 💪");
            }
        }
    }
}
