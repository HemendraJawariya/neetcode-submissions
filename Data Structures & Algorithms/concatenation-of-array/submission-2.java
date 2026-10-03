class Solution {
        public int[] getConcatenation(int[] nums) {
                int n = nums.length;
                        int[] ans = new int[2 * n]; // Double the size
                                
                                        for (int i = 0; i < n; i++) {
                                                    ans[i] = nums[i];       // Writes to index: 0, 1, 2...
                                                                ans[i + n] = nums[i];   // Writes to index: n, n+1, n+2...
                                                                        }
                                                                                
                                                                                        return ans;
                                                                                            }
                                                                                            }
