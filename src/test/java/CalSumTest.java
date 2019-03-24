
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* CalSum Tester.
*
* @author <Authors name>
* @since <pre>三月 24, 2019</pre>
* @version 1.0
*/
public class CalSumTest {

@Before
public void before() throws Exception {
    System.out.println("before");
}

@After
public void after() throws Exception {
    System.out.println("after");
}

/**
*
* Method: evaluate(String expression)
*
*/
@Test
public void testEvaluate() throws Exception {
//TODO: Test goes here...
    CalSum cal = new CalSum();
    int sum = cal.evaluate("1+2+3");
    assertEquals(5,sum);
}



}
