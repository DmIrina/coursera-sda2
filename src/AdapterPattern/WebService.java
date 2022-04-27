package AdapterPattern;

public class WebService {
    String webhost;

    public WebService(String webhost){
        this.webhost = webhost;
    }

    public Json request(Json json) {
        return json;
    }
}
