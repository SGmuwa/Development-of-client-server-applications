package ru.mirea.webPetShop.myPets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private static ConfigurableApplicationContext ctx;

    /**
     * Запускает http сервер.
     * @param args Аргументы запуска. Не используются сейчас.
     */
    public static void main (String[] args) {
        main();
    }

    /**
     * Запускает http сервер.
     */
    public static void main() {
        ctx = SpringApplication.run(Application.class);
    }

    /**
     * Останавливает http сервер.
     */
    public static void stop() {
        ctx.stop();
    }
}
