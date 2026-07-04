
import java.time.LocalDateTime;

public class Post {
    private int id;
    private String content;
    private String author;
    private LocaldateTime date;

    public Post(int id, String content, String author) {
        /*Assigns the id passed into the constructor to the object's own id variable.*/
        this.id = id;
        /*Assigns the content passed into the constructor to the object's own content variable.*/
        this.content = content;
        /*Assigns the author passed into the constructor to the object's own author variable.*/
        this.author = author;
        /*Assigns the current date and time to the object's own date variable.*/
        this.date = LocaldateTime.now();
    }

    /*Creatr class: displayPost*/

    public void displayPost() {
        System.out.printin("Post #" + id);
        System.out.printin(author)
        System.out.println(content);
        System.out.println(date);
    }

}
        
