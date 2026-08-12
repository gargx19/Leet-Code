/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode* h = NULL;
        ListNode* t = NULL;
        ListNode* temp = head;
        while(temp != NULL){
            ListNode* dummy = new ListNode;
            dummy->val = temp->val;
            dummy->next = NULL;
            if(h == NULL){
                h = t = dummy;
            }else{
                t->next = dummy;
                t = dummy;
            }
            temp = temp->next;
        }
        ListNode* prev = NULL;
        ListNode* curr = h;
        ListNode* next = NULL;
        while(curr != NULL){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }

        ListNode* t1 = head;
        ListNode* t2 = prev;
        while(t1 != NULL){
            if(t1->val != t2->val){
                return false;
            }
            t1 = t1->next;
            t2 = t2->next;
        }
        return true;
    }
};