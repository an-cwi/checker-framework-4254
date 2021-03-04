package checkercrash;

import java.util.Arrays;

public class Main {
    
    public void main() {
        LombokTest x = LombokTest.builder().string("abc").strings(Arrays.asList("def", "ghi")).build();
    }
}
