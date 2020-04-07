package test.ftcTest.FTS_Comments;


import data.CommentsData;
import org.junit.Assert;
import org.junit.Test;

public class FTC_Main_Auto_Comment_ValidationRatingFieldWithInvalidData extends BaseTestComment {


    @Test
    public void validateRatingFieldWithInvalidData(){
        getProductPageStep().fillFieldsWithInvalidRating(CommentsData.commentsUserWithInvalidRating);
        String expected = "Warning: Please select a review rating!";
        String actual = getProductPageStep().getMessageForReview();
        Assert.assertEquals(expected, actual);

    }


}
