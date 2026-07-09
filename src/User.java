import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Post> posts;
    private ArrayList<User> followers;
    private ArrayList<User> following;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.posts = new ArrayList<>();

        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }
// Adds a post to the user's list of posts
    public void addPost(Post post) {
        posts.add(post);
    }
// Displays all posts made by the user
    public void showPosts() {

    System.out.println("Posts by " + username + ":");

    for (Post post : posts) {
        post.displayPost();
    }}
//followers for the user
    private void addFollower(User user) {
        if (!followers.contains(user)) {
            followers.add(user);
        }
    }

//Unfollows a user
    public void unfollow(User user) {
        if (following.contains(user)) {
            following.remove(user);
            user.removeFollower(this);
        }
    }
//Removes a follower from the list of users that the user is following
    private void removeFollower(User user) {
        followers.remove(user);
    }

//Adds a follower to the list of users that the user is following

    public void follow(User user) {
        if (!following.contains(user)
        ) {
            following.add(user);
            user.addFollower(this);
        }
    }
}