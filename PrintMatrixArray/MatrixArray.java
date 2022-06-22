package PrintMatrixArray;

public class MatrixArray {
    //multi-dimensional stiring array initilization and declaration
    String[][] stringArray = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
    String[][] newArray = new String[stringArray.length][stringArray[0].length];

    public void printArrayInMatrixForm(){
        for(String[] i :stringArray){
            for(String j: i){
                System.out.print(" "+ j + " ");
            }
            System.out.println("\t");
        }
    }

}
