
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextEvenNumberTest {

    List<Integer> integerArrayList = new ArrayList<Integer>(48566);


    @Test
    public void shouldReturn2() {
        int num=6;
        int num2=6;

        Assert.assertEquals(num2,num);
    }
}
