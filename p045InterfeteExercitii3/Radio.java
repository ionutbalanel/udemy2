package p045InterfeteExercitii3;

public class Radio implements Startable, Stopable, Changeble {
    String currentPost;

    public Radio(String currentPost) {
        this.currentPost = currentPost;
    }

    @Override
    public void changePost(String newPost) {
        System.out.println("Am schimbat postul pe " + newPost);
        currentPost = newPost;
    }

    @Override
    public void start() {
        System.out.println("Am pornit radioul");
    }

    @Override
    public void stop() {
        System.out.println("Am oprit radioul");
    }
}
