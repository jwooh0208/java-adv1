package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV2 {

    public static void main(String[] args) {
        log("main()_ start");

        HelloRunnable runnable = new HelloRunnable(); // HelloRunnable() 인스턴스(runnable)에 있는 run() 실행
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main()_ end");
    }
}
