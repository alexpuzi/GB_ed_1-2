package GB1_1_1.lesson2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String cellValue, int rowIndex, int colIndex){
        super(String.format("Invalid value '%s' in array cell[%d][%d], requered iteger", cellValue,rowIndex,colIndex));
    }
}
