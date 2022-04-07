package ch11;

import java.util.*;

public class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity) {
        if (capacity < 0){
            throw new IllegalArgumentException("유효하지 않는 값:"+capacity);
        }
        this.capacity = capacity;
        data = new Object[capacity]; //새로운 배열 생성
    }

    public MyVector() {
        this(10); //default capacity
    }

    //최소 저장 공간 확보
    public void ensureCapacity(int minCapacity){
        if (minCapacity - data.length > 0){
            setCapacity(minCapacity);
        }
    }

    public boolean add(Object obj){
        ensureCapacity(size+1); //저장 공간 확보 후 추가
        data[size++] = obj;
        return true;
    }

    public Object get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위 벗어남");
        }
        return data[index];
    }

    public Object remove(int index){
        Object oldObj = null;

        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위 벗어남");
        }
        oldObj = data[index];

        if(index != size-1){
            //data[index+1] 에서 data[index] 로 size-index-1 개를 복사
            System.arraycopy(data,index+1,data,index,size-index-1); //자리이동 (배열복사)
        }

        data[size-1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj){
        for(int i=0; i<size; i++){
            if(obj.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize(){
        setCapacity(size);
    }

    private void setCapacity(int capacity){
        if(this.capacity==capacity){
            return;
        }

        Object[] tmp = new Object[capacity];
        System.arraycopy(data,0,tmp,0,size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear(){
        for (int i=0; i<size; i++){
            data[i] = null;
        }
        size = 0;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        System.arraycopy(data,0,result,0,size);
        return result;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int capacity(){
        return capacity;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (Object obj:data){
            if (obj.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위 벗어남");
        }

        data[index] = element;

        return data[index];
    }

    @Override
    public void add(int index, Object element) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위 벗어남");
        }

        ensureCapacity(size+1); //저장 공간 확보

        Object[] tmp = new Object[capacity];
        //data[0] 에서 tmp[0] 으로 index-1 만큼 복사
        System.arraycopy(data,0,tmp,0,index-1);
        tmp[index] = element;
        //data[index] 에서 tmp[index+1] 로 data.length-index 만큼 복사
        System.arraycopy(data,index,tmp,index+1,data.length-index);

        data = tmp;
        size++;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < data.length; i++){
            if (data[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = data.length; i >= 0; i--){
            if (data[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return null;
    }
}
