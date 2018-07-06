import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBread
{



    @Test
    public void test1() {

        twoBread twoBread = new twoBread();

        assertEquals(BREAD, twoBread.br(BREAD));


    }

}
