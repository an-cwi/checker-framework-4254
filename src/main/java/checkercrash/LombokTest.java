package checkercrash;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class LombokTest {
    @Singular List<String> strings;
}
