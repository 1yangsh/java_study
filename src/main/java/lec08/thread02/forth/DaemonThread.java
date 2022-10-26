package lec08.thread02.forth;

import java.util.concurrent.ThreadLocalRandom;

public class DaemonThread {

    public static void showStatusMessage(int size) {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < size; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + " : 이름 === " + thread.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread firstThread = new Thread("fi") {
            @Override
            public void run() {
                showStatusMessage(5);
            }
        };

        Thread secondThread = new Thread("se") {
            @Override
            public void run() {
                showStatusMessage(3);
            }
        };

        // 데몬스레드의 경우에는 메인스레드가 끝나면 같이 끝난다.
        firstThread.setDaemon(true);
        secondThread.setDaemon(true);

        firstThread.start();
        secondThread.start();

        showStatusMessage(1);

    }
}
