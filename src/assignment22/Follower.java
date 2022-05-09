package assignment22;

public class Follower implements Observer{
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        // check if something new appeared
    }

    public void play(){
        // play
    }
}
