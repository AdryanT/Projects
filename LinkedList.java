public class LinkedList {

    Nod head;

    public LinkedList insert (int x){
        Nod nod = new Nod(x);
        if(head==null){
            head=nod;
        }
        else{
            Nod last = head;
            while(last.next !=null){
                last= last.next;
            }
            last.next=nod;
        }
        return this;
    }
    public void print(){
        Nod current=head;
        while(current !=null){
            System.out.print(current.valoare + " ");
            current= current.next;
        }
        System.out.println();
    }
    public LinkedList delete(int valoare){
        Nod current =head, prev= null;
        if(current != null && current.valoare ==valoare){
            head= current.next;
            System.out.println(valoare + " a fost sters");
            return this;
        }
        while (current != null && current.valoare != valoare){
            prev = current;
            current = current.next;
        }
        if(current ==null){
            System.out.println(valoare + " nu a fost gasit");
        }
        else {
            prev.next= current.next;
            System.out.println(valoare+ " a fost sters");
        }
        return this;
    }
    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.print();
        list.delete(3);
        list.delete(10);
        list.print();


    }

}
