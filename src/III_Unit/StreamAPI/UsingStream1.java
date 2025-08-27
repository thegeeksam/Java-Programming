package III_Unit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * # Stream does not store elements. It simply conveys elements
 *   from a source such as a data structure, an array,
 *   or an I/O channel, through a pipeline of computational operations.
 * # Stream is functional in nature. Operations performed on a stream 
 *   does not modify it's source. For example, filtering a Stream obtained
 *   from a collection produces a new Stream without the filtered elements,
 *   rather than removing elements from the source collection.
 * # Stream is lazy and evaluates code only when required.
 * # The elements of a stream are only visited once during the life of a stream. 
 *   Like an Iterator, a new stream must be generated to revisit the 
 *   same elements of the source.
 */
public class UsingStream1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        // reduce operation applies a binary operator to each element in the stream
        // where the first argument to the operator is the return value of the previous
        // application and second argument is the current stream element.
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));

        // s1.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));

        int result1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result1);

    }
}
