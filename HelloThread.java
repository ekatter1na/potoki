
public class HelloThread extends Thread {
        public void run() {
            System.out.println(getName());
        }
        public static void main(String[] args) {
           for(int i=1; i<=10; i++){
               (new HelloThread()).start();
           }
           
            Thread tread = new Thread();
            System.out.println(tread.currentThread());
        }
    }

