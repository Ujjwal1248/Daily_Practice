SUBSET SUM I =>
if(sum==target) return true;
if(idx == N) return false;
func(idx+1, sum+arr[idx], arr,N,target);
func(idx+1, sum, arr,N,target);
return false;

<=======================================================================>

SUBSET II =>
if (ind >= nums.length) {
    ans.add(new ArrayList<>(ll));
    return;
}
ll.add(nums[ind]);
print(ind + 1, ll, ans, nums);
ll.remove(ll.size() - 1);
while (ind + 1 < nums.length && nums[ind] == nums[ind + 1]) ind++;
print(ind + 1, ll, ans, nums);

<======================================================================>

