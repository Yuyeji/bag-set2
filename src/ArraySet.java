public class ArraySet implements Set {
    private Object[] objects = new Object[1000];    // 오브젝트들을 저장하기 위한 배열
    private int size = 0, i;           // 현재 Bag의 크기, 현재 가르키고 있는 Bag의 index

    @Override
    public boolean add(Object object) {         // Set에 object 를 저장 및 size증가(중복제외)
        for(int j = 0 ; j < size; j++){
            if(objects[j].equals(object)){
                return false;
            }
        }
        objects[size] = object;
        size++;
        return true;
    }

    @Override
    public boolean contains(Object object) {    //Set에 object가 존재하면 true 반환
        for(int j = 0; j<size; j++){
            if(objects[j].equals(object))
                return true;
        }
        return false;
    }

    @Override
    public Object getFirst() {                  // 현재 인덱스의 object 반환
        i = 0;
        if(objects[i] != null)
            return objects[i];

        return null;
    }

    @Override
    public Object getNext() {                   // 현재 인덱스의 다음 object 반환
        i++;
        if(objects[i] != null)
            return objects[i];
        return null;
    }

    @Override
    public boolean remove(Object object) {      // 해당하는 object를 제거한 경우 true
        int temp = -1;
        for(int j = 0; j<size; j++){
            if(objects[j].equals(object)) {
                objects[j] = null;
                temp = j;
                break;
            }
        }

        if(temp != -1){
            for(int j = temp+1; j<size; j++){
                objects[j-1] = objects[j];
            }
            objects[size-1] = null;
            size--;
            return true;
        }

        return false;
    }

    @Override
    public int size() {                         // 현재 set의 크기 반환
        return size;
    }

    private int find(Object object) {           // object의 인덱스를 반환, 없는 경우 -1 반환
        for(int j = 0; j < size; j++){
            if(objects[j].equals(object))
                return j;
        }
        return -1;
    }
}
