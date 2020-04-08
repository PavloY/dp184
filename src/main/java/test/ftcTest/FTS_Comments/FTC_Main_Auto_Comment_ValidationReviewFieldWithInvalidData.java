package test.ftcTest.FTS_Comments;


import data.CommentsData;
import org.junit.Assert;
import org.junit.Test;

public class FTC_Main_Auto_Comment_ValidationReviewFieldWithInvalidData extends BaseTestComment {


    @Test
    public void validateNameFieldWithInvalidData(){
        getProductPageStep().fillFieldsWithInvalidReview(CommentsData.commentsUserWithInvalidReview);
        String expected = "Warning: Review Text must be between 25 and 1000 characters!";
        String actual = getProductPageStep().getMessageForReview();
        Assert.assertEquals(expected, actual);

    }


}
