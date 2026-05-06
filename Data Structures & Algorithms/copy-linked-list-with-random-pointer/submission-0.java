/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public Node copyRandomList(Node head) {

        // If list is empty
        if(head == null) {
            return null;
        }

        // STEP 1: Insert copied nodes beside original nodes
        Node curr = head;

        while(curr != null) {

            // Create copied node
            Node copy = new Node(curr.val);

            // Insert copy node
            copy.next = curr.next;
            curr.next = copy;

            // Move to next original node
            curr = copy.next;
        }

        // STEP 2: Copy random pointers
        curr = head;

        while(curr != null) {

            // If random exists
            if(curr.random != null) {

                curr.next.random = curr.random.next;
            }

            // Move to next original node
            curr = curr.next.next;
        }

        // STEP 3: Separate original and copied lists
        curr = head;

        Node copyHead = head.next;
        Node copyCurr = copyHead;

        while(curr != null) {

            // Restore original list
            curr.next = curr.next.next;

            // Connect copied list
            if(copyCurr.next != null) {

                copyCurr.next = copyCurr.next.next;
            }

            // Move pointers
            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        // Return copied list
        return copyHead;
    }
}