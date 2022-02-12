package lesson2.University;

public class scholarshipFund {

    public static void main(String[] args) {

    Student Ivanov = new Student("Иван", "Иванов", "БАП1801", 5);
    Aspirant Petrov = new Aspirant("Пётр", "Петров", "ИТ", 4.5, "Сайт ВУЗа");
    Student Popov = new Aspirant("Александр", "Попов", "РиТ", 5, "5G");

    Student[] students = {Ivanov, Petrov, Popov};
    for (Student s : students)
        System.out.println("Стипендиант: " + s.firstName + " " + s.lastName +
                ". Размер стипендии: " + s.getScholarship() +
                "\n-----------------------------------------");
    }

}
