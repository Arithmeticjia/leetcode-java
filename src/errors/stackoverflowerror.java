package errors;

/**
 * java.lang.StackOverflowError
 *
 * 栈溢出错误
 *
 * 执行main函数会创建一个线程，同时创建一个虚拟机栈（栈内存）
 *
 * 调用statck.recursion()时，recursion()进行压栈操作，recursion()运行期数据的数据集(批注1)保存到栈帧1(Stack Frame)(如果main方法里面调用多个方法，会执行多个压栈操作)。
 *
 * recursion()递归调用时，都会产生一个新的栈帧区块，这时就会连续的产生新的栈帧区块
 *
 * 当栈内存超过系统配置的栈内存-Xss:2048(批注2)，就会出现java.lang.StackOverflowError异常。这也是为什么对于需要谨慎使用递归调用的原因！
 */
public class stackoverflowerror {

    public void recursion() {
        recursion();
    }

    public static void main(String[] args) {
        stackoverflowerror test = new stackoverflowerror();
        test.recursion();
    }

}
