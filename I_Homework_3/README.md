# ДЗ №3
## [Array]NumCount
Посчитать, сколько раз число встречалось в массиве (*).
## [Array]Minimum
Найти минимум в массиве.
## [Array]SumElement
Найти сумму элементов массива.
## [Array]AverageElement
Найти среднее значение элементов массива.
## [Array]IsElementInSortedArray
Проверить, присутствует ли элемент в отсортированном массиве.
## [Array]ReverseOrder[*]
Вывод массива в обратном порядке:
На вход программы подаётся массив чисел, необходимо сделать вывод массива в обратном порядке.
было: 1 0 4 5
станет: 5 4 0 1
## [Array]Bubblesort[*]
Сортировка массива пузырьком:
На вход программы подаётся массив из чисел, необходимо вывести его в отсортированном виде с помощью метода пузырька.
## [Array]SpiralArray[*]
Вывод массива по спирали:
На вход подаётся одно число n = размеру квадратной матрицы, на выходе должен получиться массив из чисел 
от 1 до n выведенный по спирали.
## [Array]BinarySearch[*]
Бинарный поиск:
На вход программы подаётся искомое число и отсортированный массив,
необходимо реализовать алгоритм бинарного поиска для проверки того, что число присутствует в массиве.


## [Matrix]SideDiagonal
Найти сумму элементов на побочной диагонали.
## [Matrix]MaxElement
Найти максимальный элемент матрицы.
## [Matrix]SumUpMainDiagonal
Найти сумму элементов лежащих выше главной диагонали матрицы.
## [Matrix]SaddlePoint
Найти седловую точку матрицы (*)


## MineSweeper[*]
Задача сапёр:
В "Сапер" играет один человек. Игра идет на клетчатом поле (далее будем называть его картой) N×M
(N строк, M столбцов). В K клетках поля стоят мины, в остальных клетках записано либо число от 1 до 8 
— количество мин в соседних клетках, либо ничего не написано, если в соседних клетках мин нет. 
Клетки являются соседними, если они имеют хотя бы одну общую точку, в одной клетке не может стоять более одной мины. 
Изначально все клетки поля закрыты. Игрок за один ход может открыть какую-нибудь клетку. 
Если в открытой им клетке оказывается мина — он проигрывает, иначе игроку показывается число, которое стоит в этой клетке,
и игра продолжается. Цель игры — открыть все клетки, в которых нет мин. У Васи на компьютере есть эта игра, но ему кажется,
что все карты, которые в ней есть, некрасивые и неинтересные. Поэтому он решил нарисовать свои. 
Однако фантазия у него богатая, а времени мало, и он хочет успеть нарисовать как можно больше карт. 
Поэтому он просто выбирает N, M и K и расставляет мины на поле, после чего все остальные клетки могут быть 
однозначно определены. Однако на определение остальных клеток он не хочет тратить свое драгоценное время. Помогите ему!

По заданным N, M, K и координатам мин восстановите полную карту.

Входные данные
В первой строке входного файла INPUT.TXT содержатся числа N, M и K (1 ≤ N ≤ 200, 1 ≤ M ≤ 200, 0 ≤ K ≤ N×M). 
Далее идут K строк, в каждой из которых содержится по два числа, задающих координаты мин. 
Первое число в каждой строке задает номер строки клетки, где находится мина, второе число — номер столбца. 
Левая верхняя клетка поля имеет координаты (1,1), правая нижняя — координаты (N,M).

Выходные данные
Выходной файл OUTPUT.TXT должен содержать N строк по M символов — соответствующие строки карты. 
j-й символ i-й строки должен содержать символ ‘*‘ (звездочка) если в клетке (i,j) стоит мина, цифру от 1 до 8, 
если в этой клетке стоит соответствующее число, либо ‘.‘ (точка), если клетка (i,j) пустая.

Пример:
|INPUT.TXT|OUTPUT.TXT|
|--------|-------|
|3 2 3<br />1 1<br />2 2<br />3 2|. 2 <br /> 3 . <br />2 .|


