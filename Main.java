package LinkedList;
public class Main {
    public static void main(String[] args){
        LinkedList<Integer> L = new LinkedList<>();

        L.append(10);
        L.append(20);
        L.append(30);
        L.append(40);
        L.append(50);
        for(int i = 0; i < 5; i++){
            System.out.println(L.get(i));
        }

        System.out.println("\n");

        L.set(0, 15);
        L.set(1, 25);
        L.set(2, 35);
        L.set(3, 45);
        L.set(4, 55);
        for(int i = 0; i < 5; i++){
            System.out.println(L.get(i));
        }

        //L.set(20, 4);
    }
}
