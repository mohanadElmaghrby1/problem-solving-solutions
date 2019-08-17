import java.math.BigInteger;

/**
 * created by mohannad
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder fnum=new StringBuilder("");
        StringBuilder snum=new StringBuilder("");

        while (l1!=null){
            fnum.append(l1.val);
            l1=l1.next;
        }

        while (l2!=null){
            snum.append(l2.val);
            l2=l2.next;
        }
        snum = snum.reverse();
        fnum = fnum.reverse();

        String ans = (new BigInteger(snum.toString()).add(new BigInteger(fnum.toString()))).toString();
        ans=new StringBuilder(ans).reverse().toString();
        ListNode last= new ListNode(ans.charAt(0)-'0');

        ListNode curr=last;

        for (int i=1 ; i<ans.length() ; ++i){
            curr.next=new ListNode(ans.charAt(i)-'0');
            curr=curr.next;
        }

        return last;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}
