
class NumberSeries {
    
    boolean isChar;
    int ch = 'a';
    int counter =1;
    
    public void printTheCharacter(){
        synchronized (this) {
            if(!isChar){
                try{
                    wait();
                } catch (Exception ex){
                
                }
            }
            System.out.print(Character.toChars(ch));
            ch = (ch +1) > 123 ? (ch+1-26): (ch+1);
            isChar = !isChar;
            notify();
        }
    }
    
    
    public void printTheNumber(){
        synchronized (this){
            if(isChar){
                try{
                    wait();
                } catch (Exception ex){
                
                }
            }
            System.out.print(counter);
            counter++;
            isChar = !isChar;
            notify();
        }
    }
    
    
    public static void main(String [] args){
      
        NumberSeries  obj = new NumberSeries();
        obj.isChar = true;
        Thread t1 = new Thread() {
            public void run(){
                while(obj.counter<=1000){
                    obj.printTheCharacter();
                }
            }
        };
        
        Thread t2 = new Thread() {
            public void run(){
                while(obj.counter<=1000){
                    obj.printTheNumber();
                }
            }
        };
        
        t1.start();
        t2.start();
        
    }
    
    
}