public class MyStack {
    int[] arr;
    int size;
    int index;
    MyStack(int size){
        this.size=size;
        index=-1;
        arr = new int[this.size];
    }
    public void push(int element){
        if (isFull()){
            return;
        }
        index+=1;
        arr[index]=element;
    }
    public int pop(){
        int result =-1;
        if(isEmpty()){
            return result;
        }
        result=arr[index];
        index-=1;
        return result;
    }
    public boolean isFull(){
        return size-1==index;
    }
    public boolean isEmpty(){
        return index==-1;
    }
    public int size() {
        return index+1;
    }
}
