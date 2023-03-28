package exp_5;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
public class testRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(test.class);

        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
