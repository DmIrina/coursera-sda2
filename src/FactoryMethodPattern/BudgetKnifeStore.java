package FactoryMethodPattern;

// Concrete Creator

public class BudgetKnifeStore extends KnifeStore {

    //up to any subclass of KnifeStore to define this method

 public Knife createKnife(String knifeType) {
        if (knifeType.equals("steak")) {
             return new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
             return new BudgetChefsKnife();
        }
        //.. more types
        else return null;
    }
}
