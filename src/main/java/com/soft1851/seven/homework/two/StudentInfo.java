import java.time.LocalDate;

/**
 * @author ke
 * @ClassName StudentInfo
 * @Description TOOD
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class StudentInfo {
    private String name;
    private Integer age;
    private Double height;
    private LocalDate birthday;

    public StudentInfo (String name, Integer age, Double height, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.birthday = birthday;

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
