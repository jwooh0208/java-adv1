package thread.start;

public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부 (false는 사용자 스레드)
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + ": main() end");

    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");
            try { // throws 로 밖으로 예외를 던질 수 없다 => 부모 메서드가 예외를 정의하지 않아서
                // 체크 예외는 반드시 잡아야한다
                Thread.sleep(10000); //10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
