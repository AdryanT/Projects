public class Coada {
    private int head, tail, size;
    private int[] Coada;

    public Coada (int size){
        this.size=size;
        head = tail = 0;
        Coada= new int[size];
    }
    public boolean isEmpty(){
        if(head == tail){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(tail == size){
            return true;
        }
        return false;
    }
    public void enqueue(int x){
        if (isFull()){
            System.out.println("Overflow");
            return;
        }
        else{
            Coada[tail]=x;
            tail++;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow");
            return;
        }
        else{
            for (int i=0;i<tail-1;i++){
                Coada[i]= Coada[i+1];
            }
            if (tail<size){
                Coada[tail]=0;
            }
            tail--;
        }
    }

    public void print(){
        for ( int i=head;i<tail;i++){
            System.out.print(Coada[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Coada c= new Coada(4);
        c.enqueue(10);
        c.enqueue(30);
        c.enqueue(50);
        c.enqueue(70);
        c.print();
        c.dequeue();
        c.enqueue(90);
        c.dequeue();
        c.print();
    }
}
