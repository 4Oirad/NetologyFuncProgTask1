import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dictionary implements Function<String, Set<String>> {

    @Override
    public Set<String> apply(String s) {

        return Arrays.stream(s.split(" "))
                .filter(x -> !x.equals(""))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toSet());
                //.forEach(x -> treeSet.add(x));

    }
}