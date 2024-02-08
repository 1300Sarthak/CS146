class Lab1:
    def twoSum(self, nums, target):
        map = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in map:
                return [map[complement], i]
            map[num] = i
        raise ValueError("No solution")


if __name__ == "__main__":
    solution = Lab1()
    nums = [2, 7, 11, 15]
    target = 9
    indices = solution.twoSum(nums, target)
    print(f"Index1: {indices[0]}, Index2: {indices[1]}")
