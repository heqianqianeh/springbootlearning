package test;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

/**
 * DecimalFormatTest
 * Created by heqianqian on 2017/7/4.
 */
public class DecimalFormatTest {

    @Test
    public void test() throws Exception {

        //Test #
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        String format = decimalFormat.format(123456);
        assertEquals("123,456", format);

        //Test 0
        decimalFormat = new DecimalFormat("000,000.000");
        String format1 = decimalFormat.format(2323.2131342);
        assertEquals("002,323.213", format1);
    }

    @Test
    public void testStringBufferAndString() throws Exception {
        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuffer stringBuffer1 = new StringBuffer("abc");
        assertEquals(false,stringBuffer.equals(stringBuffer1));
    }
}
