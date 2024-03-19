from typing import Optional, List
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class HW10:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []

        result, level = [], deque([root])

        while level:
            current_level = []
            for i in range(len(level)):
                node = level.popleft()
                current_level.append(node.val)
                if node.left:
                    level.append(node.left)
                if node.right:
                    level.append(node.right)
            result.append(current_level)

        return result
