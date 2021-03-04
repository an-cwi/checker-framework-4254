package checkercrash;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class LombokTest {
    @Singular List<String> strings;
}
