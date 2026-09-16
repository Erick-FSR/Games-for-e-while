import java.util.ArrayList;

public class gamecodas {

    public static void main(String[] args) {

        boolean playerAlive = true;

        ArrayList<Integer> enemies = new ArrayList<>();

        while (playerAlive) {

            for (int i = 0; i <= 100; i++) {

                enemies.add(i);

                System.out.println(enemies);
            }

            playerAlive = false;
        }

        System.out.println("YOU ARE DEAD");
    }
}
