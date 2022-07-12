package multithreading;




import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 

class sortandrevers
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
        list = list.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
 
        System.out.println(list);
    }
}