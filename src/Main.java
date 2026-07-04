public class Main {
    //create a main method to test the User and Post classes

    //create user object and post objects, add the posts to the user, and display the user's posts
    public static void main(String[] args) {
        //create user
        User user1 = new User("Valentina", "valentina@example.com");
        User user2 = new User("John", "john@example.com");

        //Create posts
        Post post1 = new Post(1, "Hello, this is my first post!", "Valentina");
        Post post2 = new Post(2, "Excited to share my thoughts with you all!", "Valentina");
        Post post3 = new Post(3, "What a beautiful day!", "John");

        // Add posts to users
        user1.addPost(post1);
        user1.addPost(post2);
        user2.addPost(post3);

        // Display users' posts
        user1.showPosts();
        user2.showPosts();
    }
}