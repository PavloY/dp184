package test.ftcTest.FTS_Comments;


import data.CommentsData;
import org.junit.Assert;
import org.junit.Test;

public class FTC_Main_Auto_Comment_ValidationNameFieldWithInvalidData extends BaseTestComment {

    @Test
    public void validateNameFieldWithInvalidData(){
        getProductPageStep().fillFieldsWithInvalidName(CommentsData.commentsUserWithInvalidName);
        String expected = "Warning: Review Name must be between 3 and 25 characters!";
        String actual = getProductPageStep().getMessageForReview();
        Assert.assertEquals(expected, actual);

    }




}
