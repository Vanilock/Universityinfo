import enums.StudyProfile;
import model.Student;
import model.University;

public class Application {

    public static void main(String[] args) {

        Student student = new Student();
        student.setAvgExamScore((float)8.4)
                .setCurrentCourseNumber(4)
                .setFullName("Кулешевич Иван Сергеевич")
                .setUniversityId("932");
        System.out.println(student);

        University university = new University();
        university.setId("932")
                .setFullName("BELARUSIAN STATE UNIVERSITY OF INFORMATICS AND RADIOELECTRONICS")
                .setShortName("BSUIR")
                .setYearOfFoundation(1964)
                .setMainProfile(StudyProfile.COMPUTER_SCIENCE);
        System.out.println(university);
    }
}
