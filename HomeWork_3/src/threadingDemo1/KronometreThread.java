package threadingDemo1;

public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName= threadName;
        System.out.println(" oluşturuluyor "  + threadName);

    }


    @Override
    public void run() {
       System.out.println(" Çalıştırılıyor " + threadName); 

       
        try {
            
            for ( int i=1; i<=10; i++ ){
                System.out.println(threadName + " : " + i);
            Thread.sleep(1000);
            }   
            }catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(" Bozuldu :" + threadName );
            }

       System.out.println(" Thread Bitti " + threadName);
            
    }
    public void start(){
        System.out.println(" Thread nesnesi oluşuyor ");
        if ( thread== null){
            thread= new Thread( this, threadName);
            thread.start();
        }
    }
    


}
