class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class HW9:
    @staticmethod
    def lowestCommonAncestor(root, p, q):
        while root:
            if p.val > root.val and q.val > root.val:
                root = root.right
            elif p.val < root.val and q.val < root.val:
                root = root.left
            else:
                return root
        return None
