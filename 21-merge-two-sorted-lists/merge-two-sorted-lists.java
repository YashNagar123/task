/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);// dummy node -> just to create head
        ListNode temp = dummy;// for making the linked list

        while(list1 != null && list2 != null){

            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            } else{
                temp.next = list2;
                list2 = list2.next;
            }

           temp = temp.next;// update node of merged list
        }
         if(list1 != null){// if nodes are left in list1
                temp.next = list1;
            }

            if(list2 != null){// if nodes are left in list2
                temp.next = list2;
            }

            /*example -> list1 = [1,2,4], list2 = [1,3,4]
            
            then merged list = dummy -> 1 -> 1 -> 2 -> 3 -> 4 -> 4
                                        ^ (this is real head)i.e dummy.next
            */ 

        return dummy.next;
    }
}