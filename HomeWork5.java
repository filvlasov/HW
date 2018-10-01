/**
 * Java. Level 1. Lesson 5. Homework
 *
 * @author Philipp Vlasov
 * @version dated Sep 28, 2018
 */
class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Sidorov Vladimir", "Saller", "sidorov@mailbox.com", "892312313", 20000, 45);
        persArray[2] = new Person("Borisov Ivan", "Purchaser", "borisov@mailbox.com", "892312314", 40000, 30);
        persArray[3] = new Person("Gavrilova Zinaida", "Manager", "gavrilova@mailbox.com", "892312315", 50000, 55);
        persArray[4] = new Person("Ivanov Gleb", "Electrician", "ivanovgleb@mailbox.com", "892312316", 30000, 18);

        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        int j = 0;
        for (int i = 0; i < persArray.length; i++) {

            if (persArray[i].getAge() > 40) {
                j++;
                System.out.println();
                System.out.println("Person " + j);
                System.out.println();
                persArray[i].vivod();
            }
        }
    }
}

/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
 */
class Person {
    private String fullname;
    String position;
    String email;
    String phon;
    int salary;
    private int age;

    Person(String fullname, String position, String email, String phon, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phon = phon;
        this.salary = salary;
        this.age = age;
    }

    public void setFullname(String fullname) {
        if (fullname != null)
            this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setAge(int age) {
        if (age >= 18)
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    void vivod() {
        System.out.println("Full Name: " + fullname);
        System.out.println("Position: " + position);
        System.out.println("email: " + email);
        System.out.println("phon: " + phon);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
