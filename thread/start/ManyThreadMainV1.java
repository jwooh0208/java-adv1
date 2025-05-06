package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {

    public static void main(String[] args) {
        log("main()_ start");

        HelloRunnable runnable = new HelloRunnable(); // HelloRunnable() 인스턴스(runnable)에 있는 run() 실행
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

        log("main()_ end");
    }
}
