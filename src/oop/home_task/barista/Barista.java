package oop.home_task.barista;

/**
 * Created by Lida on 05.08.2016.
 */
public class Barista {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
