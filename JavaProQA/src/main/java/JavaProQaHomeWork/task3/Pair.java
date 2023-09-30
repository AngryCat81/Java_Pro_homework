package JavaProQaHomeWork.task3;
//Задание 3.
//Создайте класс для хранения пары строк (Pair).+
// В классе создайте приватные поля first и second.+
// Создайте геттеры для этих полей.+
// Создайте блок инициализации, в котором выведите в консоль значение полей first и second, +
// а затем присвойте полю first значение “one”, а полю second значение «two».+
//Создайте конструктор по умолчанию (без входных параметров).+
// Внутри конструктора выведите в консоль значение полей first и second.+
//Создайте конструктор, который принимает параметры first и second и обновляет значения соответствующих полей.+
// Внутри конструктора выведите в консоль значение полей first и second.+
// В программе создайте объект Pair двумя разными конструкторами.+
public class Pair {

    private String first;
    private String second;


    {
        first="Let your soul, be your pilot";//Создайте блок инициализации, в котором выведите в консоль значение полей first и second
        second="Let your soul guide you";
        System.out.println(first+" "+second);//выведите в консоль значение полей first и second

        first="one";//присвойте полю first значение “one”, а полю second значение «two».+
        second="two";

    }

    public Pair (){ //Создайте конструктор по умолчанию (без входных параметров).
        System.out.println(first+" "+second);//Внутри конструктора выведите в консоль значение полей first и second
    }

    public Pair (String first,String second){
        this.first=first;
        this.second=second;
        System.out.println(this.first);// ne vivoditsja pochemu-to!!!sprositj na lekcii
        System.out.println(this.second);


    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}
