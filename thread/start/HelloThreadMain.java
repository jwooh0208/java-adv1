package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start"); // 현재 실행하는 코드 반환

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end"); // 현재 실행하는 코드 반환

        //run() 메소드를 오버라이딩 했지만 반드시 start() 메서드를 사용해야한다.
        // start() 로 호출을 해야 실제 스택 영역(Thread-0)을 할당하면서 run() 메서드를 넣고 실행한다.
        // main 스레드 스택영역이 아닌 Thread-0 스레드 스택 영역에서 run() 메서드 실행
        // 실행 결과는 스레드의 실행 순서에 따라 약간 다를 수 있다. => 운영체제가 언제 뭘 실행시킬지 다를 수 있음
        // start() 메서드를 사용하면 main 스레드는 start() 메서드의 코드가 실행되는 것을 기다리지 않고 메인의 다음 코드를 실행한다.
        // 따라서 실행 순서가 약간씩 다를 수 있다. (실제로 여러번 진행 할 경우 위치가 바뀜)




    }
}
