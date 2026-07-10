
import java.time.LocalDateTime;

public class Post {
    private int id;
    private String content;
    private String author;
    private LocalDateTime date;
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
    public LocalDateTime getDate() {
        return date;
    }
    
    public Post(int id, String content, String author) {
        /*Assigns the id passed into the constructor to the object's own id variable.*/
        this.id = id;
        /*Assigns the content passed into the constructor to the object's own content variable.*/
        this.content = content;
        /*Assigns the author passed into the constructor to the object's own author variable.*/
        this.author = author;
        /*Assigns the current date and time to the object's own date variable.*/
        this.date = LocalDateTime.now();
    }

    /*Creatr class: displayPost*/

    public void displayPost() {
        System.out.println("Post #" + id);
        System.out.println(author);
        System.out.println(content);
        System.out.println(date);
    }

}
        
