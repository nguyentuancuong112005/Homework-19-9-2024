
package baitapver.pkg5;

import java.util.ArrayList;


class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    // Thêm sinh viên
    public void addStudent(Student student) {
        personList.add(student);
        System.out.println("Student added: " + student.getFullName());
    }

    // Thêm giáo viên
    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
        System.out.println("Teacher added: " + teacher.getFullName());
    }

    // Xoá person bởi ID
    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
        System.out.println("Deleted person with ID: " + id);
    }

    // Tìm person bởi ID
    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    // Hiển thị tất cả sinh viên và giáo viên
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    // Tìm sinh viên có GPA cao nhất
    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    // Tìm giáo viên theo phòng ban
    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }

    // Kiểm tra việc mượn sách
    public void checkBookBorrowing() {
        for (Person person : personList) {
            if (person.isBookOverdue()) {
                System.out.println(person.getFullName() + ": Overdue");
            } else {
                System.out.println(person.getFullName() + ": No overdue");
            }
        }
    }
}
