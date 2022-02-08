# Задания по дисциплине "Суперкомпьютерные технологии"
# lesson1
Задачи

Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.
Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число» «положительное нечетное число» и т. д.
Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города. ( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ). Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
максимальное значение
сумму положительных элементов
сумму четных отрицательных элементов
количество положительных элементов
среднее арифметическое отрицательных элементов
Дан массив целых чисел: [15,10,51, 6, 5,3,-10,34,0,32,56,-12,24, 52]. Переставить элементы массива в обратном порядке. Вывести результат в консоль
Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить нули в конец массива. Вывести результат в консоль

# lesson2
Animal:
Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару

University:
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы. Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.Создать переменную типа Student, которая ссылается на объект типа Aspirant. Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100, иначе 80. Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180. Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

# lesson3
Flowers
Необходимо реализовать иерархию цветов (для примера, пусть это будут розы, гвоздики, тюльпаны и… что-то на свой вкус).Создать несколько объектов-цветов. Собрать 3 букета (используем массив) с определением их стоимости. В букет может ходить несколько цветов одного типа. Класс "Flower" должен содержать метод определяющий стоимость цветка, этот метод переопределить в классах наследниках. Также подсчитать количество проданных цветов (используем статический метод).

Car
Создать абстрактный класс класс Car, и класс Engine. Класс Engine содержит поля - мощность, производитель. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine. Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft() Методы turnRight() и turnLeft() выводят на экран: "Поворот направо" или "Поворот налево". Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе. Создать производный от Саr класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузов. реализовать методы start(), stop(). Метод start - выводит на экран «Грузовик поехал», метод stop - «грузовик остановился». Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop(). Метод start - выводит на экран «SportCar поехал», метод stop - «SportCar остановился».

# lesson4
Создать базовый класс Animal с полями: private boolean vegetarian; private String eats; private int noOflegs; На его основе создать подкласс Cat с полями суперкласса и private String color.
Cоздать базовый класс Building. На его основе создать подклассы: House,School,Library,Supermarket.
Cоздать базовый класс Horse. На его основе создать подклассы: Zebra,Donkey,Pegasus.
Cоздать базовый класс Food. На его основе создать подклассы: Starter,Soup,Salad,MainDish.
Cоздать базовый класс FootWear. На его основе создать подклассы: Shoes,Trainers,Boots,HighShoes,Sandals,Slippers.

# lesson5
Написать программу, которая проверяет, является ли строка палиндромом
Реализовать удаление повторяющихся символов в строке
Реализовать проверку, являются ли две строки анаграммами
Напишите Java-программу для лексикографического сравнения двух строк.
Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре.
Напишите программу на Java для объединения данной строки в конец другой строки.
Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов.
Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки.
Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные.
Напишите Java-программу, чтобы получить длину заданной строки.
Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр.
Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр. 
Напишите программу на Java, чтобы найти второй по частоте символ в данной строке.
Напишите программу на Java для печати после удаления дубликатов из заданной строки.
Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке.
Напишите программу на Java, которая возвращает true из заданной строки, если первые два символа в строке также появляются в конце.
Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке.
Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0.

# lesson6
Task1 Дано: классы Fruit -> Apple, Orange. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины. Для хранения фруктов внутри коробки можно использовать собственную коллекцию:
сделать метод getWeight(), который высчитывает вес коробки.
задать вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
внутри класса Box сделать метод Compare, который позволяет сравнить текущую коробку с той, которую подадут в Compare в качестве параметра. True – если их массы равны, False в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Task2 Создать свою типизированную коллекцию с методами:
int size() – возвращает размер коллекции
void add(E item) – добавить элемент в коллекцию
void remove(int index) – удаляет элемент по индексу
void remove(E item) – удаляет элемент
E get(int index) – получение элемента по индексу
void clear() – очищает коллекцию Необходимо создать реализацию на основе связанного списка (однонаправленного). В качестве подсказки обратитесь к книге К. Хорстманна, посмотрите логику работы связанного списка.

# lesson7
Создаем мини приложение - интернет-магазин. Должны быть реализованы следующие возможности: a) аутентификация пользователя. Пусть у вас будет отображение, содержащие пары логин-пароль. Если пользователь ввел, правильные данные, он аутентифицирован. В этом случае пусть создается объект User, cодержащий логин, пароль. Если данные не правильные, то пусть создается объект User, с пустыми значениями. б) просмотр списка каталогов товара, в) просмотр списка товаров определенного каталога, отсортированного по заданному критерию, г) выбор товара в корзину, д) покупка товаров, находящихся в корзине. Можете добавить свои операции или изменить что-то на свой вкус.

# lesson8
Дополнение к интернет-магазину: после покупки, записать отчет в файл, содержащий информацию о содержимом корзины. Используем класс PrintWriter для записи и форматирования отчета.
Дополнение к интернет-магазину: создать механизм для сериализации и десериализации содержимого последней купленной корзины.

# lesson9
Создать класс, реализующий интерфейс Runnable. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка. Используем статический метод Thread.sleep() чтобы сделать паузу. Создать три потока, выполняющих задачу распечатки значений.
Необходимо создать три потока которые изменяют один и тот же объект. Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1. a) Создать класс расширяющий Thread. б) Переопределить метод run(), здесь будет находится синхронизированный блок кода. в) Для того чтобы три объекта-потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект. г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в). д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1. е) В методе main() создайте один объект класса StringBuilder, используя символ ‘a’. Затем создайте три экземпляра объекта нашего класса и запустите потоки
