public class TestMatrix {

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix((int)(Math.random()*10),(int)(Math.random()*10));
        for(int i = 0;i<matrix1.getM();i++){
            for(int j = 0;j<matrix1.getN();j++){
                matrix1.setElement(i,j,Math.random()*10);
            }
        }
        Matrix matrix2 = new Matrix(matrix1.getM(),matrix1.getN());
        for(int i = 0;i<matrix1.getM();i++){
            for(int j = 0;j<matrix1.getN();j++){
                matrix2.setElement(i,j,matrix1.getData(i,j));
            }
        }
        System.out.println("1:");
        matrix1.display();
        System.out.println("2:");
        matrix2.display();
        matrix2 = matrix1.add(matrix2);
        System.out.println("add:");
        matrix2.display();
        matrix2 = matrix2.minus(matrix1);
        System.out.println("minus:");
        matrix2.display();
        matrix2 = matrix2.transposition();
        System.out.println("transposition:");
        matrix2.display();
        matrix2 = matrix1.multiple(matrix2);
        System.out.println("multiple:");
        matrix2.display();
    }
}
