package ArrayListDemo;

public class ArrayListDemo {

    private Object[] arry;

    private int size = 0;

    /**
     * 无参构造函数
     */

    public ArrayListDemo(){
        this.arry = new Object[10];
    }

    /**
     * 有参构造函数，指定长度
     */
    public ArrayListDemo(int size) throws Exception {
        if(size > 0) {
            this.arry = new Object[size];
        } else
            throw new Exception("长度不允许小于零！");
    }

    /**
     * 新增
     */
    public void add(Object number){
        if(size >= arry.length){
            int length = arry.length;
            Object[] newArry = new Object[length];
            for(int i=0; i<arry.length; i++){
                newArry[i] = arry[i];
            }
            length = (length*3)/2+1;        //更新数组长度
            arry = new Object[length];      //对原有数组进行扩容
            for(int j=0; j<newArry.length; j++){
                arry[j] = newArry[j];
            }
            newArry = null;     //释放该数组
        }
        arry[size] = number;
        size++;
    }

    /**
     *
     * @param index
     * @return
     * @throws Exception
     */
    public Object get(int index) throws Exception {
        if(index >= 0) {
            return arry[index];
        }
        throw new Exception("下标不符合要求！");
    }

    //获得大小
    public int getSize(){
        int count = 0;
        for(int i=0; i<arry.length; i++){
            if(arry[i] != null){
                count++;
            }
        }
        return count;
    }

}
