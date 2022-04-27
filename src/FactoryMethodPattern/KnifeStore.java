package FactoryMethodPattern;

// Creator

public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
        Knife knife;

        // now creating a knife is a method in the class

        knife = createKnife(knifeType);
        knife.sharpen();
        knife.polish();
        knife.pack();
        return knife;
    }
    abstract Knife createKnife(String type);
}
