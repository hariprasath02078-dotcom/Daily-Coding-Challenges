class Solution {

    List<Integer> result = new ArrayList<>();
    int i = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

        if (check(root, voyage))
            return result;

        result.clear();
        result.add(-1);
        return result;
    }

    public boolean check(TreeNode root, int[] voyage) {

        if (root == null)
            return true;

        if (root.val != voyage[i])
            return false;

        i++;

        if (root.left != null && i < voyage.length &&
            root.left.val != voyage[i]) {

            result.add(root.val);

            if (!check(root.right, voyage))
                return false;

            if (!check(root.left, voyage))
                return false;
        } else {

            if (!check(root.left, voyage))
                return false;

            if (!check(root.right, voyage))
                return false;
        }

        return true;
    }
}