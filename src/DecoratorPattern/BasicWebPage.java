package DecoratorPattern;

public class BasicWebPage implements WebPage {
    public String html = "...";
    public String styleSheet = "...";
    public String script = "...";

    @Override
    public void display() {
        /* Renders the HTML to the stylesheet, and run any embedded scripts */
    }
}
