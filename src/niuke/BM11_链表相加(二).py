from niuke.ListNode import ListNode

class Solution:
    def addInList(self , head1 : ListNode , head2 : ListNode ):
        # write code here
        pre1 = self.reserve(head1)
        pre2 = self.reserve(head2)
        k = 0
        list_re = pre1
        while pre1 and pre2:
            lk = pre1.val + pre2.val + k
            if lk > 9:
                k = 1
            pre1.val=lk % 10
            pre1 = pre1.next
            pre2 = pre2.next

        if pre1 is not None:
            while pre1:
                lk = pre1.val + k
                if lk > 9:
                    k = 1
                pre1.val = lk % 10
                pre1 = pre1.next
        else:
            pre1 = pre2
            while pre2:
                lk = pre1.val + k
                if lk > 9:
                    k = 1
                pre1.val = lk % 10
                pre1 = pre1.next

        list_re = Solution.reserve(list_re)
        return  list_re
    def reserve(self,head : ListNode):
        list1 = ListNode()
        while head:
            pre = head
            head=head.next
            pre.next=list1.next
            list1.next=pre
        return list1.next




