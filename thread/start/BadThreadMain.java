package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start"); // 현재 실행하는 코드 반환

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run(); //run() 직접 실행 => main 스레드가 run() 실행
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end"); // 현재 실행하는 코드 반환

        // start() 메서드는 스택 공간을 할당하면서 스레드를 실행하는 특별한 메서드
        // run() 메서드를 호출하면 main 스레드에서 run() 메서드를 실행한다.
    }
}
