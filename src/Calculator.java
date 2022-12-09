import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            doCalculate(scanner.nextLine());
        }
    }

    private static void doCalculate(String str) {
        var nums = getNums(str);
        int a;
        int b;
        if (str.contains("+")) {
            try {
                a = Integer.parseInt(nums[0].trim());
                b = Integer.parseInt(nums[1].trim());
                System.out.println(a + b);
            } catch (Exception e) {
                a = romans.valueOf(nums[0].trim()).num;
                b = romans.valueOf(nums[1].trim()).num;
                System.out.println(romans.getByArabic(a + b));
            }
        } else if (str.contains("-")) {
            try {
                a = Integer.parseInt(nums[0].trim());
                b = Integer.parseInt(nums[1].trim());
                System.out.println(a - b);
            } catch (Exception e) {
                a = romans.valueOf(nums[0].trim()).num;
                b = romans.valueOf(nums[1].trim()).num;
                System.out.println(romans.getByArabic(a - b));
            }
        } else if (str.contains("*")) {
            try {
                a = Integer.parseInt(nums[0].trim());
                b = Integer.parseInt(nums[1].trim());
                System.out.println(a * b);
            } catch (Exception e) {
                a = romans.valueOf(nums[0].trim()).num;
                b = romans.valueOf(nums[1].trim()).num;
                System.out.println(romans.getByArabic(a * b));
            }
        } else if (str.contains("/")) {
            try {
                a = Integer.parseInt(nums[0].trim());
                b = Integer.parseInt(nums[1].trim());
                System.out.println(a / b);
            } catch (Exception e) {
                a = romans.valueOf(nums[0].trim()).num;
                b = romans.valueOf(nums[1].trim()).num;
                System.out.println(romans.getByArabic(a / b));
            }
        }
    }


    enum romans {
        I(1),
        II(2),
        III(3),
        IV(4),
        V(5),
        VI(6),
        VII(7),
        VIII(8),
        IX(9),
        X(10);

        public final int num;

        romans(int num) {
            this.num = num;
        }

        public static String getByArabic(int n) {
            for (romans i : romans.values()) {
                if (i.num == n) {
                    return i.name();
                }
            }
            throw new RuntimeException();
        }
    }

    private static String[] getNums(String string) {
        return string.split("[+-/*]");
    }
}
