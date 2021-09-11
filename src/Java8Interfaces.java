
public class Java8Interfaces implements  First, Second{
    public static void main(String [] args){
        Java8Interfaces obj = new Java8Interfaces();
        obj.print();
        obj.print();
    }
    public void print(){
    
    }
    
}

interface First {
    void print();
}


interface Second {
     void print();
}