package lab10_pac;

import java.util.Arrays;

class Generic <T> {
    private T[] array;

    public void setArray(T[] in_array) {
        array = in_array;
    }

    public T[] getArray() {
        return array;
    }

    public int getLength(){
        return array.length;
    }
    public T getIndex(int i){
        return array[i];
    }
}

class TestClass1 {

    public static <T> void arrayOut(T [] array){
        T[] t1 = array;
        Generic<T>arr=new Generic<T>();
        arr.setArray(t1);
        System.out.print(" ");
        for(int i=0;i<arr.getLength();i++){
            System.out.print(arr.getIndex(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        String []strings={"Very","big","str"};
        Integer[]integers={0,1,2,3,4,5};
        Double[]doubles={3.6 ,1.48 ,63.636, 3.425};
        arrayOut(strings);
        arrayOut(integers);
        arrayOut(doubles);
    }
}
