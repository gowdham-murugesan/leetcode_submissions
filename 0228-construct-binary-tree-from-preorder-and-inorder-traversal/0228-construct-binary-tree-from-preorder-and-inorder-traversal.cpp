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
    int find_div(vector<int> &inorder, int val) {
        
        int m = inorder.size();
        
        for (int i=0; i<m; i++) {
            if (inorder[i] == val)
                return i;
        }
        
        return -1;
    }
    
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder) {
        
        TreeNode *root = NULL;
        
        if (preorder.empty())
            return root;
        if (inorder.empty())
            return root;
        
        int m = preorder.size();
        int n = inorder.size();
        
        if (m != n)
            return root;
        
        // begin the tracking
        root = new TreeNode(preorder[0]);
        if (m == 1)
            return root;
        
        int div = find_div(inorder, preorder[0]);
        vector<int> preleft(preorder.begin()+1, preorder.begin()+div);
        vector<int> inleft(inorder.begin()+0, inorder.begin()+div);
        root->left = buildTree(preleft, inleft);
        
        // vector<int> preright;
        // vector<int> inright;
        if (div < (inorder.size()-1)) {
            vector<int> preright(preorder.begin()+div+1, preorder.end());
            vector<int> inright(inorder.begin()+div+1, inorder.end()-1);
            root->right = buildTree(preright, inright);
        } else
            root->right = NULL;
        
        
        // root->left = buildTree(preorder(preorder.begin()+1, preorder.begin()+div),  inorder(inorder.begin(), inorder.begin()+div-1));
        // root->right = buildTree(preorder(preorder.begin()+div+1, preorder.end()),  inorder(inorder.begin()+div+1, inorder.end()));            
        
        return root;
    }
};