class HW1:
    def is_palindrome(s):
        lower_case_string = s.lower()
        clean_string = ''.join(c for c in lower_case_string if c.isalnum())

        left, right = 0, len(clean_string) - 1
        while left < right:
            if clean_string[left] != clean_string[right]:
                return False
            left += 1
            right -= 1
        return True


if __name__ == "__main__":
    test_string1 = "No lemon, no melon"
    print(HW1.is_palindrome(test_string1))

    test_string2 = "12321"
    print(HW1.is_palindrome(test_string2))
