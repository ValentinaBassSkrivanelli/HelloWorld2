import java.io.FileWriter;
import java.io.IOException; 

public class FileManager {

    public static void savePost(Post post) {

        try {

            FileWriter writer = new FileWriter("posts.txt", true);

            writer.write("----------------------------------------\n");
            writer.write("Author: " + post.getAuthor() + "\n");
            writer.write("Content: " + post.getContent() + "\n");
            writer.write("Date: " + post.getDate() + "\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving post.");
        }

    }

}