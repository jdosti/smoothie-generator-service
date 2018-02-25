/**
 * Created by jdosti on 06/02/2018.
 */

public class smoothieGenerator {

    public static void main(String[] args) {

        String[] bananaGingerSmoothie = {"banana", "banana", "vanilla yogurt", "honey", "grated ginger"};

        String[] blueberrySmoothie = {"water", "green tea bag", "frozen blueberries", "banana", "soy milk"};

        String[] pineapplePassion = {"vanilla yogurt", "ice cube", "ice cube", "ice cube", "ice cube", "pineapple chunks"};

        String[] strawberryKiwi = {"apple juice", "banana", "banana", "kiwi", "frozen strawberries", "honey"};


        String[] userIngredients = {"banana", "banana", "vanilla yogurt", "honey", "grated ginger"};


        for (int i = 0; i < userIngredients.length; i++) {
            for (int j = 0; j < bananaGingerSmoothie.length; j++) {
                if (userIngredients[i].equals(bananaGingerSmoothie[j])) {
                    System.out.println(true);
                } else System.out.println(false);
            }
        }


        for (int i = 0; i < userIngredients.length; i++) {
            for (int j = 0; j < blueberrySmoothie.length; j++) {
                if (userIngredients[i].equals(blueberrySmoothie[j])) {
                    System.out.println(true);
                } else System.out.println(false);
            }
        }

        for (int i = 0; i < userIngredients.length; i++) {
            for (int j = 0; j < pineapplePassion.length; j++) {
                if (userIngredients[i].equals(pineapplePassion[j])) {
                    System.out.println(true);
                } else System.out.println(false);
            }
        }

        for (int i = 0; i < userIngredients.length; i++) {
            for (int j = 0; j < strawberryKiwi.length; j++) {
                if (userIngredients[i].equals(strawberryKiwi[j])) {
                    System.out.println(true);
                } else System.out.println(false);
            }
        }

    }
}

