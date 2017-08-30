package Algorithm.Basic.ArrayList;

class ArrayList {

    static Object list[];

    // object 추가
    ArrayList(){
        list = new Object[0];
    }

    public void ensureCapacity(int len){
        Object temp[] = new Object[len];
        System.arraycopy(list, 0, temp, 0, size());
        list = temp;
    }

    public void add(Object o){
        if(list.length == 0){
            ensureCapacity(size()+1);
            list[size()-1] = o;
        }

        else{
            list[size()-1] = o;
        }
    }


    // index, object  추가

    public void add(Object o, int index){

    }

    //  object 삭제
    public void remove(Object o){

    }

    public static Object get(int index){
        return list[index];
    }
    public void remove(int index){
        for(int i=index; i<size()-1; i++){
            list[i] = list[i+1];
        }

    }
    // size()

    public static int size(){
        return list.length;
    }

    // isEmpty
    public boolean isEmpty(){
        if(size() <= 0)
            return true;
        else
            return true;
    }
}
