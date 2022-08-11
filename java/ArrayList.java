import java.util.List<E>;

public class ArrayList<E> implements List<E>{
    
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private static final Object[] EMPTY_ARRAY = {};

    Object[] array;

    //기본 생성자(매개변수 없음)
    public ArrayList(){
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }
    //기본 생성자2(매개변수로 첫 할당 크기)
    public ArrayList(int capacity){
        this.array = new Object[capacity];
        this.size = 0;
    }

    //resize 함수
    private void resize(){
        int capacity = array.length;
        //size가 0
        if(size==0){
            array = new Object[DEFAULT_SIZE];
            return;
        }
        //size가 capacity랑 같을 때
        else if(size == capacity){
            array = Arrays.copyOf(array, capacity*2);
            return;
        }
         //size가 capacity/2보다 작을 때
        else if(size < (capacity/2)){
            array = Arrays.copyOf(array, Math.max(capacity/2, DEFAULT_SIZE);
            return;
        }
    }

}