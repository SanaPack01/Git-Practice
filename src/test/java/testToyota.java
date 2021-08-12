import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class testToyota {
    Toyota camry=new Toyota(3.5,"голубой","Camry70","2000",true,32.0000,"avtomat");

    @Test
    public void testEngine(){
        Assert.assertEquals(3.5,camry.getEngine(),1);

    }

}
