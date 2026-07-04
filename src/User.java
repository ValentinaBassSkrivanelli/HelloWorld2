import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Post> posts;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void showPosts() {

    System.out.println("Posts by " + username + ":");

    for (Post post : posts) {
        post.displayPost();
    }}
    

}