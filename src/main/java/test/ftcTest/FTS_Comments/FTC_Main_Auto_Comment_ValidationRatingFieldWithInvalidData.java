package test.ftcTest.FTS_Comments;


import data.CommentsData;
import org.junit.Test;

public class FTC_Main_Auto_Comment_ValidationRatingFieldWithInvalidData extends BaseTestComment {


    @Test
    public void validateRatingFieldWithInvalidData(){
        getProductPageStep().fillFieldsWithUncheckedRating(CommentsData.commentsUserWithUncheckedRating);
    }


}
