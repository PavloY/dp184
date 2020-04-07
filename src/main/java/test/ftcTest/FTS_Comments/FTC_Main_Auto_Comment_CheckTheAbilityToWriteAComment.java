package test.ftcTest.FTS_Comments;


import data.CommentsData;
import org.junit.Assert;
import org.junit.Test;


public class FTC_Main_Auto_Comment_CheckTheAbilityToWriteAComment extends BaseTestComment {



    @Test
    public void fillFieldsWithValidData(){
        getProductPageStep().fillFieldsWithValidData(CommentsData.commentsUserWithValidData);
        //String expected = " Thank you for your review. It has been submitted to the webmaster for approval.";
        //String actual = "";   // alert success & danger .getText добавить в Page
        //Assert.assertEquals(expected, actual);
    }



}
