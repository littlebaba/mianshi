package cloudin;

import sun.misc.Queue;

/**
 * @author Li on 2018/7/30.
 */
public class cloudin5 {

    public static class MyQueue {
        /*自定义队列，要求插入队尾，得到队首，删除队首，得到队列中最大的元素*/
        private Object[] queue;
        private int head;
        private int end;
        private int length = 10;

        public MyQueue() {
            queue = new Object[length];
            head = 0;
            end = 0;
        }

        public void add(Object o) {
            queue[end++] = o;
        }

        public Object remove() {
            Object o = queue[head++];
            Object[] objArr = new Object[length-1];
            for (int i =1;i<length;i++){
                objArr[i-1] = queue[i];
            }
            queue = objArr;
            return o;
        }

        public Object peek() {
            Object o = queue[head];
            return o;
        }

        public Object max(){
            return null;
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Object o : queue) {
                sb.append(o + " ");
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("liheng");
        queue.add("lirui");
        queue.add("lijiu");
        System.out.println(queue);

        queue.peek();
        System.out.println(queue.peek());


        queue.remove();
        System.out.println(queue);
    }


}
