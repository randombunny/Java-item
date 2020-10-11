import java.util.Objects;

public class Matrix {
    private int m,n;
    private double[][] data;
    Matrix(int m,int n){
        this.m = m;
        this.n = n;
        this.data = new double[m][n];
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public double getData(int m,int n) {
        return data[m][n];
    }

    public void setElement(int row, int col, double value){
        this.data[row][col] = value;
    }

    public Matrix add(Matrix m){
        if(!(this.m==m.m&&this.n==m.n))return null;
        Matrix tmp = new Matrix(this.m,this.n);
        for(int i = 0;i<this.m;i++){
            for(int j = 0;j<this.n;j++)
                tmp.data[i][j] = this.data[i][j]+m.data[i][j];
        }
        return tmp;
    }
    public Matrix minus(Matrix m){
        if(!(this.m==m.m&&this.n==m.n))return null;
        Matrix tmp = new Matrix(this.m,this.n);
        for(int i = 0;i<this.m;i++){
            for(int j = 0;j<this.n;j++)
                tmp.data[i][j] = this.data[i][j]-m.data[i][j];
        }
        return tmp;
    }
    public Matrix multiple(Matrix m){
        if(this.n!=m.m)return null;
        Matrix tmp = new Matrix(this.m,m.n);
        for(int i = 0;i<tmp.m;i++){
            for(int j = 0;j<tmp.n;j++){
                for(int k = 0;k<this.n;k++){
                    tmp.data[i][j]+=this.data[i][k]*m.data[k][j];
                }
            }
        }
        return tmp;
    }
    public Matrix transposition(){
        Matrix tmp = new Matrix(this.n,this.m);
        for(int i = 0;i<tmp.m;i++){
            for(int j = 0;j<tmp.n;j++){
                tmp.data[i][j] = this.data[j][i];
            }
        }
        return tmp;
    }
    public void display(){
        for(int i = 0;i<this.m;i++){
            for(int j = 0;j<this.n;j++)
                System.out.format("%7.2f",this.data[i][j]);
            System.out.println();
        }
    }
}
