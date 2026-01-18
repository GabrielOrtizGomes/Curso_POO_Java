package Section_12_Enumeracoes_Composicao.src.Entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Post {
    private Instant moment;
    private String title;
    private String content;
    private Integer likes;
    private final ArrayList<Comment> comments;

    public Post(Instant moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments = new ArrayList<Comment>();
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime date = LocalDateTime.ofInstant(moment,ZoneId.systemDefault());

        sb.append(String.format("%s %n",title));
        sb.append(String.format("%d Likes - %s %n", likes,date.format(fmt)));
        sb.append(String.format("%s %n",content));

        if (!comments.isEmpty()){
            sb.append("Comments: ");
            for (Comment comment : comments){
                sb.append(String.format("%n%s",comment.getText()) );
            }
        }
        return sb.toString();
    }
}
