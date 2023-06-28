package org.mazhuang;

/**
 * @author zhuang.ma
 */
public class StackTraceInFastThrowDemo {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            try {
                count++;
                npeTest(null);
            } catch (Exception e) {
                int stackTraceLength = e.getStackTrace().length;
                System.out.printf("count: %d, stacktrace length: %d%n", count, stackTraceLength);
                if (stackTraceLength == 0) {
                    flag = false;
                }
            }
        }
    }

    public static void npeTest(Integer i) {
        System.out.println(i.toString());
    }
}
