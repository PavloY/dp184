package data;

public final class CommentsData {

    public static final CommentsUser commentsUserWithValidData = new CommentsUser("Alexander","Hello worlddddddddddddddddddddd",4);

    public static final CommentsUser commentsUserWithInvalidName = new CommentsUser("","Hello worlddddddddddddddddddddd",4);
    public static final CommentsUser commentsUserWithInvalidReview = new CommentsUser("Alexander","",3);
    public static final CommentsUser commentsUserWithInvalidRating = new CommentsUser("Alexander","Hello worlddddddddddddddddddddd");


}
