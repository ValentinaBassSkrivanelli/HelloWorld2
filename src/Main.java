import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create users
        User user1 = new User("Valentina", "valentina@example.com");
        User user2 = new User("John", "john@example.com");

        // Create posts
        Post post1 = new Post(1, "Hello, this is my first post!", "Valentina");
        Post post2 = new Post(2, "Excited to share my thoughts with you all!", "Valentina");
        Post post3 = new Post(3, "What a beautiful day!", "John");

        // Add posts to users
        user1.addPost(post1);
        user1.addPost(post2);
        user2.addPost(post3);

        Scanner scanner = new Scanner(System.in);

        int option;

        do {

            System.out.println("\n===== BASIC SOCIAL MEDIA PLATFORM =====");
            System.out.println("1. Show Valentina's posts");
            System.out.println("2. Show John's posts");
            System.out.println("3. Follow John");
            System.out.println("4. Unfollow John");
            System.out.println("5. Show feed");
            System.out.println("6. Show following");
            System.out.println("7. Show followers");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    user1.showPosts();
                    break;

                case 2:
                    user2.showPosts();
                    break;

                case 3:
                    user1.follow(user2);
                    System.out.println("Valentina is now following John.");
                    break;

                case 4:
                    user1.unfollow(user2);
                    System.out.println("Valentina unfollowed John.");
                    break;

                case 5:
                    user1.showFeed();
                    break;

                case 6:
                    user1.showFollowing();
                    break;

                case 7:
                    user2.showFollowers();
                    break;

                case 8:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 8);

        scanner.close();
    }
}