public class ArrayBag implements Bag{
    private Object[] objects = new Object[1000];
    private int size = 0, i;


    @Override
    public void add(Object object) {            // Bag에 object 를 저장 및 size증가
        objects[size] = object;
        size++;
    }

    @Override
    public boolean contains(Object object) {    //Bag에 object가 존재하면 true 반환
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
    public Object getNext() {
        i++;
        if(objects[i] != null)
            return objects[i];
        return null;
    }

    @Override
    public boolean remove(Object object) {
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
    public int size() {

        return size;
    }

    @Override
    public int removeAllItem(Object object) {
        int num = 0;
        for(int j = 0; j<size; j++){
            if(objects[j].equals(object)) {
                objects[j] = null;
                for(int k = j + 1; k<size; k++){
                    objects[k-1] = objects[k];
                }
                num++;
            }
        }

        for(int j = 0 ; j<num ; j++){
            objects[size--] = null;
        }

        return num;
    }

}
