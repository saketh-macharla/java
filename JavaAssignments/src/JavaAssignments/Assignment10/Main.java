package JavaAssignments.Assignment11.Assignment10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SList newList=new SList();
        SListIterator ListIterator = newList.iterator();
        Random random=new Random();
        int data,pos;
        for(int i=0;i<5;i++){
            data=random.nextInt(100);
            ListIterator.append(data);

        }
        ListIterator.display();
        pos=random.nextInt(4)+1;
        ListIterator.remove(pos);
        ListIterator.display();


    }
}
