package com.github.hcsp.calculation;

import static org.hamcrest.Matchers.containsString;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(containsString("5\n6\n7\n8\n9\n10"));
        Solution.printNumberTo10(5);
    }
}
