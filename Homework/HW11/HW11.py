class Week11:

    def flood_fill_python(self, image, sr, sc, new_color):
        original_color = image[sr][sc]
        if original_color == new_color:
            return image

        def fill(r, c):
            if (0 <= r < len(image)) and (0 <= c < len(image[0])) and (image[r][c] == original_color):
                image[r][c] = new_color
                fill(r + 1, c)
                fill(r - 1, c)
                fill(r, c + 1)
                fill(r, c - 1)

        fill(sr, sc)
        return image
