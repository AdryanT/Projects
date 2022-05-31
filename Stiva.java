public class Stiva {
    private int top, size;
    private int[] Stiva;

    public Stiva(int size){
        this.size=size;
        top = -1;
        Stiva= new int[size];
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        return false;
    }
    public void push(int x){
        if (isFull()){
            System.out.println("Overflow");
            return;
        }
        else{
            top++;
            Stiva[top]=x;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return;
        }
        else{
            Stiva[top]=0;
            top--;
        }
    }

    public void print(){
        for ( int i=0;i<=top;i++){
            System.out.print(Stiva[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Stiva c= new Stiva(4);
        c.push(10);
        c.push(30);
        c.push(50);
        c.push(70);
        c.print();
        c.pop();
        c.push(90);
        c.pop();
        c.print();
    }
}
