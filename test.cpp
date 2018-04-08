/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    struct TreeNode* reConstructBinaryTree(vector<int> pre,vector<int> vin) {
        int len = vin.size();
        if(len == 0){
            return NULL;
        }
        TreeNode* head = new TreeNode(pre[0]);
        int gen = 0;
        for(int i=0; i<len; i++){
            if(pre[0] == vin[i]){
                gen = i;
                break;
            }
        }
        vector<int> left_vin, left_pre, right_vin, right_pre;
        for(int i=0; i<gen; i++){
            left_vin.push_back(vin[i]);
            left_pre.push_back(pre[i+1]);
        }
        for(int i=gen+1; i<len; i++){
            right_vin.push_back(vin[i]);
            right_pre.push_back(pre[i]);
        }
        head->left = reConstructBinaryTree(left_pre, left_vin);
        head->right = reConstructBinaryTree(right_pre, right_vin);
        return head;
    }
};