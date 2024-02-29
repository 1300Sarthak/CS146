class HW8:
    def longestPalindrome(self, s: str) -> int:
        charCounts = [0] * 128
        for c in s:
            charCounts[ord(c)] += 1

        length = 0
        for count in charCounts:
            length += count // 2 * 2
            if length % 2 == 0 and count % 2 == 1:
                length += 1

        return length
