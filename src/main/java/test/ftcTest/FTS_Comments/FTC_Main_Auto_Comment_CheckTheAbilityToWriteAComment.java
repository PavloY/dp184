package test.ftcTest.FTS_Comments;


import data.CommentsUser;
import org.junit.Assert;
import org.junit.Test;


public class FTC_Main_Auto_Comment_CheckTheAbilityToWriteAComment extends BaseTestComment {



    @Test
    public void fillFieldsWithValidData(){
        getProductPageStep().fillFieldsWithValidData(new CommentsUser("Alex","kbnrkscscwcewvergrgrgergergergergergregregergnbrenbjnerjbk erkjb kj",3));
        String expected = "";
        //String actual = "";   // alert success & danger .getText добавить в Page
        //Assert.assertEquals(expected, actual);
    }



}
