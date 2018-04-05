import com.company.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        com.company.MyArrayTest.class,
        com.company.MyListTest.class
})
public class TestSuite {
}
