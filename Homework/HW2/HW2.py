class HW2:
    def is_bad_version(self, version):
        return False

    def first_bad_version(self, n):
        start, end = 1, n

        while start < end:
            if self.is_bad_version(start):
                return start

            if self.is_bad_version(end - 1):
                end -= 1
            else:
                return end
            start += 1

        return start
