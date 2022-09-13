public class StudentManagement {
    Student[] students = new Student[100];

    /* return something */
    public void addStudent(Student newStudent) {
        int i = 0;
        while (students[i] != null) {
            i++;
        }
        students[i] = newStudent;
    }

    /* return something */
    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /* return something */
    public String studentsByGroup() {
        String result = "";
        String[] groupList = new String[101];
        int[][] tmp = new int[102][102];
        int i = 0;

        while (students[i] != null) {
            Student std = (Student) students[i];

            int j = 0;
            while (groupList[j] != null) {
                if (std.getGroup().equals(groupList[j])) {
                    int k = 0;
                    while (tmp[j][k] != 0) {
                        k++;
                    }
                    tmp[j][k] = i + 1;
                    break;
                }
                j++;
            }
            if (groupList[j] == null) {
                groupList[j] = std.getGroup();
                tmp[j][0] = i + 1;
            }
            i++;
        }
        
        i = 0;
        while (groupList[i] != null) {
            result += groupList[i] + '\n';

            int j = 0;
            while (tmp[i][j] != 0) {
                result += students[tmp[i][j] - 1].getInfo() + '\n';
                j++;
            }
            i++;
        }
        return result;
    }

    /* return something */
    public void removeStudent(String id) {
        int i = 0;
        while (students[i] != null){
            if (id.equals(students[i].getId())) {
                i++;
                break;
            }
            i++;
        }
        if (students[i] == null) {
            return;
        }
        while (students[i] != null) {
            students[i - 1] = students[i];
            i++;
        }
        students[i - 1] = null;
    }
}