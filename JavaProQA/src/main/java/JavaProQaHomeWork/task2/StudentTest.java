package JavaProQaHomeWork.task2;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Testovich", 350);

        student.setGroupNumber(-3);//cherez set pereopredeljaem peremennuju "groupNumber", pri vvode otricateljnogo chisla,
        //srabativaet sistemnoe soobshenija iz exception "Group number must be positive"

        System.out.println("Students group number is: " + student.getGroupNumber());//pri vvedenii polozhiteljnogo chisla
        // v stroke 6,srabotaet eta strochka koda

        System.out.println(Student.increase(45));////chtobi vivesti ne voidovij metod,
        // obrashaemsja ne k objektu student,a k klassu Student i cherez tochku vibiraem metod.
        // Chtobi vivesti na ekran, posle vivoda metoda stavim tochku i pishem sout (strochka sgenerituetsja avtomaticheski

        Student studentClone = new Student(student);//sozdajom novij objekt i v skobkah ukazivaem kloniruemij objekt
        System.out.println(student == studentClone);//proverjaem ravnie li ssilki

        System.out.println(student.getGroupNumber());
        System.out.println(studentClone.getGroupNumber());

    }

}


