class synchrmain extends Thread {
    public synchronized void print(char[] str) {
        
            try {
                for (int i = 1; i <= 5; i++) 
                     System.out.println(str);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

class synchron extends Thread{
    synchrmain s;
    synchron (synchrmain s){
        this.s=s;
    }
    public void run() {
        char[] str= {'j'};
        s.print(str);
    }
}

class syncexample extends Thread {
    
    synchrmain p;
    syncexample (synchrmain p){
        this.p=p;
    }
   
    
     public void run() {
       char[] str= {'m','e','s','s','a','g','e'};
       p.print(str);
    }
  }



public class sync {
    public static void main(String[] args) {
        synchrmain k= new synchrmain();
        synchron sync1 = new synchron(k);
        syncexample sync2= new syncexample(k);
        sync1.start();
        sync2.start();
    }
}