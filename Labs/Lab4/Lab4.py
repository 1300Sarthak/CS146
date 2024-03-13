class Lab4:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def invertTree(self, root: Lab4) -> Lab4:
    if root is None:  # If no root is found then...
        return None  # return None
    # swap and invert subtrees
    root.left, root.right = self.invertTree(
        root.right), self.invertTree(root.left)
    return root  # return inverted root
