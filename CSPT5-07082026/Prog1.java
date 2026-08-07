class SwitchDemo {
    void main() {
        int x = new java.util.Scanner(System.in).nextInt();

        int y = switch (x) {
            case 1, 2 -> {
                x++;
                yield x;
            }
            case 3 -> {
                IO.println(x);
                yield x;
            }
            default -> {
                IO.println("Sorry not available");
                yield 0;
            }
        };

        IO.println("Value of y = " + y);
    }
}
