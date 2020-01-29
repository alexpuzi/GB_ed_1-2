package GB1_1_1.lesson2;

public class Lesson2Part1 {
    private static final int REQ_ARRAY_SIZE = 4;
    private static final String[][] CORRECT_DATA = new String[][]{
            {"1","2","4","6"},
            {"9","3","4","2"},
            {"8","7","6","4"},
            {"12","11","10","15"},
    };
    private static final String[][] INCORRECT_SIZE_DATA = new String[][]{
            {"1","2","4","6"},
            {"9","3","4","2"},
            {"8","7","6"},
            {"12","11","10","15"},
    };
    private static final String[][] INCORRECT_VALUE_DATA = new String[][]{
            {"1","2","4","6"},
            {"9","3","4","2"},
            {"8","7","6","4"},
            {"12","11","10","15"},
    };
    public static void main(String[] args){
        try{
            int result = sumArrayValues(CORRECT_DATA);
//            int result = sumArrayValues(INCORRECT_SIZE_DATA);
//            int result = sumArrayValues(INCORRECT_VALUE_DATA);
            System.out.println("Array sum: " + result);
        }catch (MyArraySizeException e){
            System.out.println("Некорректный размер массива");
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (MyArrayDataException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static int sumArrayValues(String[][] correctData) {
        checkArraySize(correctData);
        int sumRezult = 0;
        for(int rowIndex = 0; rowIndex < correctData.length; rowIndex++){
            String[] row = correctData[rowIndex];
            for (int colIndex = 0; rowIndex < correctData.length; colIndex++){
                String value = row[colIndex];
                try{
                    sumRezult += Integer.parseInt(value);
//                    sumRezult = sumRezult + Integer.parseInt(value);
                }catch (NumberFormatException e){
                    throw new MyArraySizeException(value, rowIndex, colIndex);
                }
            }
        }
        return sumRezult;
    }

    private static void checkArraySize(String[][] correctData) {
        if(correctData.length != REQ_ARRAY_SIZE){
            throw new MyArraySizeException();
        }
        for (String[] row : correctData){
            if (row.length != REQ_ARRAY_SIZE){
                throw new MyArraySizeException();
            }
        }
    }
}
