package ObserverPattern;

public class Subscriber implements Observer {
    Blog blog;

    @Override
    public void update() {
        System.out.println(blog.getState());
    }
}
