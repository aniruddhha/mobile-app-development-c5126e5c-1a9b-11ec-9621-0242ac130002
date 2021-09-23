package exr1;

public class User {

    // add password field here
    private Long id;
    private String name;
    private Integer age;

    public void setId(Long i) {
        id = i;
    }

    public Long getId() {
        return id;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer a) {
        age = a;
    }

    public Integer getAge() {
        return age;
    }
}
