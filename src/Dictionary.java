import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dictionary implements Function<String, Set<String>> {

    @Override
    public TreeSet<String> apply(String s) {
        return Arrays.stream(s.split(" "))
                .filter(x -> !x.equals(""))
                .collect(Collectors.toCollection(TreeSet::new));
    }
}