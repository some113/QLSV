public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor 1.
     */
    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * @param name student's name
     * @param id student'id
     * @param email students's email
     */    
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor 3.
     * @param s new student
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
    
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id; 
    }

    public String getId() {
        return id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}