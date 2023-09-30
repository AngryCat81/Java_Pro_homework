package JavaProQaHomeWork.task2;
//Задание 2.
//        Создайте класс Студент, имеющий поля имя, фамилия и номер группы.+
//        1 Напишите минимум 2 конструктора для класса Студент.+
//        2 Реализуйте геттеры и сеттеры для класса Студент.+
//        В сеттере сделайте проверку, что номер группы положительный.+
//        В противном случае бросьте исключение throw new RuntimeException(“Номер группы должен быть положительным”);+
//        3 Создайте метод «перейти в следующую группу».+
//        При вызове метода студент переводится в следующую по номеру группу (чтобы не сдавать экзамены  ).+
//        4 Создайте в программе объект студента.+
//        5 Добавьте клонирующий конструктор к классу Студент.
//        В программе склонируйте созданный ранее объект. Проверьте с помощью ==, что объекты имеют разные ссылки в памяти.
//        Затем измените одно из полей оригинального студента. Изменилось ли то же поле у клона?


public class Student {

    private String name;
    private String surname;
    private int groupNumber;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String surname, int groupNumber) {
        this.surname = surname;
        this.groupNumber = groupNumber;
    }
    public Student (Student clone){ //sozdajom klonirujushij konstruktor, v skobkah zapisivaem imja peremennoj klona
        this(clone.name,clone.surname);
        this.groupNumber= clone.groupNumber ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber < 0) { //esli groupNumber menjshe nulja , to vividitsja sistemnoe soobshenie "Group number must be positive"
            throw new RuntimeException("Group number must be positive");

        } else this.groupNumber = groupNumber;// esli int groupNumber boljshe nulja, to peredajom vvedjonnuju groupNumber i vivodim
        }




    public static int increase (int studentGroupNumber) {//Metod inkrementiruet vvedjonnij studentGroupnumber na 1
        return studentGroupNumber + 1;


    }
}