
package com.github.hcsp.calculation;
import org.junit.jupiter.api.Test;;import org.hamcrest.Matchers;;import com.github.blindpirate.extensions.CaptureSystemOutput;

public class SolutionTest {
@Test
@CaptureSystemOutput
public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
  capture.expect(Matchers.containsString(("(?s).*5\\s+6\\s+7\\s+8\\s+9\\s+10.*"))));
  Solution.printNumberTo10(5);
}

}
