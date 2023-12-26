class Solution {
public:
    vector<vector<int> > subsetsWithDup(vector<int> &S) {
        vector<vector<int> > result;
        vector<int> tracker;
        sort(S.begin(), S.end());
        result.push_back(vector<int>());
        subsets_helper(result, S, 0, tracker);
        return result;
    }
    
    void subsets_helper(vector<vector<int> > &result, const vector<int> &S, int step, vector<int> &tracker) {
        for (int i = step; i < S.size(); ++i) {
            tracker.push_back(S[i]);
            result.push_back(tracker);
            subsets_helper(result, S, step+1, tracker);
            tracker.pop_back();
            while (i < S.size() && S[i] == S[i+1]) {
                ++i;
            }
        }
    }
};