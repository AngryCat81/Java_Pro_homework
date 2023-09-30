package JavaProQaHomeWork.task1;
// 1 уровень сложности: Задание 1.
//Создайте Package (щелчок правой кнопкой мыши на папке src -> New -> Package).
//1 В созданном пакете создайте класс Автомобиль.
// Создайте поля для типа автомобиля – грузовик, спорткар, легковой
// (можно сделать перечисление), мощность двигателя (сколько лошадиных сил),
// поля для марки и модели автомобиля.
// Одно из полей сделайте публичным, второе – без модификатора доступа, остальные – приватными.
// Создайте объект этого класса в программе и попробуйте установить значения для полей.
// Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
//2 Создайте класс Завод. Класс будет производить три вида автомобилей
// (иметь 3 метода) – спорткар, грузовик, легковой. В основной программе создайте несколько автомобилей с помощью класса Завод.

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();// sozdajom objekt klassa
        car.bradOfTheCar = "Mercedes";// Inicializiruem pole klassa (tak kak ono public, k nemu svobodnij dostup)
        car.model = "ML";
        car.setEnginePower(250); // tak kak pole privatnoe cherez setter ustanavlivaem znachenie
        System.out.println("Engine power is: " + car.getEnginePower());//s pomoshju get obrashaemsja k znacheniju "EnginePower"

        Factory pkw = new Factory();
        Factory sportCar = new Factory();
        Factory lkw = new Factory();

        pkw.beep();
        sportCar.goFast(150);
        lkw.roll("LKW");

    }
}
