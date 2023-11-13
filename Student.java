import lombok.*;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public List<Double> fillGrade(){
        Random random = new Random();
        return random.doubles(10, 4,5)
                .map(n-> Math.round(n*100.0)/100.0)
                .boxed()
                .collect(Collectors.toList());
    }
}
