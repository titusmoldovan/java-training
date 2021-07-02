import java.util.Map;

public class Singleton {
    private static Singleton instance;
    private final String name;
    private Map<Integer, CompleteMakeup> posts;

    private Singleton(String name, Map<Integer, CompleteMakeup> posts) {
        this.name = name;
        this.posts = posts;
    }

    public void setPosts(Map<Integer, CompleteMakeup> posts) {
        this.posts = posts;
    }

    public Map<Integer, CompleteMakeup> getPosts() {
        return posts;
    }

    public static Singleton getInstance(String name, Map<Integer, CompleteMakeup> posts) {
        if (instance == null)
            instance = new Singleton(name, posts);
        return instance;
    }

    public void displayPosts() {
        System.out.println(name + "'s Instagram posts are:");
        for (Map.Entry<Integer, CompleteMakeup> entry : posts.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getMakeupType());
        }
    }
}
