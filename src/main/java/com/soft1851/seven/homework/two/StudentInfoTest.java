import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ke
 * @ClassName StudentInfoTest
 * @Description TOOD
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class StudentInfoTest {
    public static void main(String[] args) {
        List<StudentInfo> studentInfos = new ArrayList<>();
        studentInfos.add(new StudentInfo("李小明", 18, 1.75, LocalDate.of(2001, 1, 23)));
        studentInfos.add(new StudentInfo("张小明", 28, 1.85, LocalDate.of(2001, 6, 20)));
        studentInfos.add(new StudentInfo("王小明", 19, 1.7, LocalDate.of(2002, 11, 2)));
        studentInfos.add(new StudentInfo("陈小明", 16, 1.75, LocalDate.of(2001, 5, 15)));

        System.out.println("排序前");
        studentInfos.forEach(System.out::println);

        List<StudentInfo> sortedByAge = studentInfos.stream().sorted(Comparator.comparing(StudentInfo::getAge)).collect(Collectors.toList());
        System.out.println("按年龄升序排序");
        sortedByAge.forEach(System.out::println);

        List<StudentInfo> sortedByAgeDesc = studentInfos.stream().sorted(Comparator.comparing(StudentInfo::getAge).reversed()).collect(Collectors.toList());
        System.out.println("按年龄降序序排序");
        sortedByAgeDesc.forEach(System.out::println);

        List<StudentInfo> sortedByAgeAndHeight = studentInfos.stream().sorted(Comparator.comparing(StudentInfo::getAge).reversed().thenComparing(StudentInfo::getHeight)).collect(Collectors.toList());
        System.out.println("按年龄降序和身高升序");
        sortedByAgeAndHeight.forEach(System.out::println);
    }
}
