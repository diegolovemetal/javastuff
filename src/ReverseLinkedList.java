import java.util.ArrayList;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

public class ReverseLinkedList {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> ret = new ArrayList<>();
//        if (listNode != null) {
//            ret.addAll(printListFromTailToHead(listNode.next));
//            ret.add(listNode.val);
//        }
//        return ret;
//    }
    public static ArrayList<Integer> printListFromTailToHeadRecursion(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHeadRecursion(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }
    public  static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        // 头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    public static ArrayList<Integer> printListFromTailToHeadStack(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty())
            ret.add(stack.pop());
        return  ret;
    }

    private static ListNode buildListNode(int[] input) {
        ListNode first = null, last = null, newNode;
        int num;
        if (input.length>0) {
            for(int i=0; i<input.length; i++) {
                newNode = new ListNode(input[i]);
                newNode.next = null;
                if( first == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }
            }
        }
        return first;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> mylist = new ArrayList<Integer>();
//        mylist.add(1);
//        mylist.add(2);
//        mylist.add(3);
//        System.out.println(mylist.toString());
        int[] input=new int[]{1,2,3,4,5};
        ListNode listNode = buildListNode(input);

        ArrayList<Integer> ret =  null;
        ret = printListFromTailToHeadStack(listNode);
        System.out.println(ret.toString());
    }



}
