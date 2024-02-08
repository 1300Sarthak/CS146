class Lab2:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        counts = {}

        for char_s, char_t in zip(s, t):
            counts[char_s] = counts.get(char_s, 0) + 1
            counts[char_t] = counts.get(char_t, 0) - 1

        for count in counts.values():
            if count != 0:
                return False

        return True


if __name__ == "__main__":
    solution = Solution()
    s = "listen"
    t = "silent"
    print(solution.isAnagram(s, t))

    s = "rat"
    t = "car"
    print(solution.isAnagram(s, t))
