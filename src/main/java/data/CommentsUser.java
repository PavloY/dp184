package data;

public class CommentsUser {

    private String name;
    private String review;
    private int rating;

    public CommentsUser(String name, String review, int rating){
        this.name = name;
        this.review = review;
        this.rating = rating;
    }
    public CommentsUser(String name, String review){
        this.name = name;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public int getRating(){
        return rating;
    }
}
