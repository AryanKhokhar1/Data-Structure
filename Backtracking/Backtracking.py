class Backtracing:        
    def backtracking(self, current_rows, current_columns, path, destiny_row, destiny_column, check):
        if current_columns == destiny_column and current_rows == destiny_row:
            print(path)
            return
        
        if not check[current_rows][current_columns]:
            return
        
        check[current_rows][current_columns] = False

        # Down
        if current_rows < destiny_row:
            self.backtracking(current_rows+1,current_columns, path+"D", destiny_row, destiny_column,check)
        # Right
        if current_columns < destiny_column:
            self.backtracking(current_rows, current_columns+1, path+"R", destiny_row,destiny_column,check)
        # Up
        if current_rows > 0:
            self.backtracking(current_rows-1, current_columns, path+"U",destiny_row, destiny_column,check)
        # Left
        if current_columns > 0:
            self.backtracking(current_rows, current_columns-1, path+"L",destiny_row, destiny_column,check)

        check[current_rows][current_columns] = True

obj = Backtracing()
check = [
    [True, True, True],
    [True, True, True],
    [True, True, True],
    ]
obj.backtracking(0,0,"",2,2,check)