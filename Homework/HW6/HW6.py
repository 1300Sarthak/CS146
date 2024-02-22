from typing import List


class HW6:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()  # Sorts array
        result, n = [], len(nums)  # Initializes variables

        for i in range(n):  # Iterates through nums
            if i > 0 and nums[i] == nums[i-1]:  # Skips duplicates
                continue

            seen = set()  # Tracks seen nums
            j = i + 1  # Initializes second pointer
            while j < n:  # Iterates the rest
                complement = -nums[i] - nums[j]  # Finds complement
                if complement in seen:  # Checks if complement seen
                    # Adds the triplet
                    result.append([nums[i], nums[j], complement])
                    while j + 1 < n and nums[j] == nums[j+1]:  # Skips duplicates
                        j += 1
                seen.add(nums[j])  # Adds to seen
                j += 1  # Moves second pointer

        return result  # Returns the result


def main():
    hw6 = HW6()
    nums = [-1, 0, 1, 2, -1, -4]
    print("Input:", nums)
    print("Output:", hw6.threeSum(nums))
    # Output should show the triplets that sum up to 0


if __name__ == "__main__":
    main()
