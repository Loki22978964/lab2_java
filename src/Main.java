void main() {
    findNumbers();

    System.out.println("");

    inputAndProcess();
}

public static void findNumbers() {
    int totalCount = 0;

    for (int n = 1000; n <= 9999; n++) {

        totalCount++;
        int flag = 0;

        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        if (a == b || a == c || a == d || b == c || b == d || c == d){
            flag = 1;
            totalCount++;
        }

        if (flag == 1) {
            System.out.println(n);
        }
    }
    System.out.println("totalCount: " + totalCount);
}


public static String removePart(String text, char a, char b) {
    if (text.indexOf(a) == -1 || text.indexOf(b) == -1) {
        return text;
    }

    int first = text.indexOf(a);
    int second = text.indexOf(b);

    if (first > second) {
        int temp = first;
        first = second;
        second = temp;
    }

    String part1 = text.substring(0, first + 1);
    String part2 = text.substring(second);

    return part1 + part2;
}

public static void inputAndProcess() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть текст: ");
    String text = scanner.nextLine();

    System.out.print("Введіть перший символ: ");
    char a = scanner.next().charAt(0);

    System.out.print("Введіть другий символ: ");
    char b = scanner.next().charAt(0);

    String result = removePart(text, a, b);

    System.out.println("Результат: " + result);
}
