package Day8;

import java.util.HashSet;

public class Example {
    public static void main(String[] args) {
        
        //1. create hashset
        HashSet<String> fruitBasket= new HashSet<>();

        //2.add element into fruitBasket
        fruitBasket.add("apple");
        fruitBasket.add("mongo");
        fruitBasket.add("apple");

        //3.Check element existence or not
        if(fruitBasket.contains("mongo"))
        {
            System.out.println("Yes, mongo is in to fruitBaskets");
        }
        if(!fruitBasket.contains("orange"))
        {
            System.out.println("NO, orange is not existence in to fruitBasket!");
        }
    }
}
