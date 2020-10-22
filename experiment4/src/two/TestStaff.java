package two;

import java.util.Date;

public class TestSraff {
    public static void main(String[] args){
        Staff[] staffs = new Staff[10];
        staffs[0] = new Staff("赵","1",1,true,1,new Date(900000000));
        staffs[1] = new Staff("钱","2",2,true,2,new Date(800000000));
        staffs[2] = new Staff("孙","3",3,true,3,new Date(700000000));
        staffs[3] = new Staff("李","4",4,true,4,new Date(600000000));
        staffs[4] = new Dean(1,"计算机","计算机",1,"院长1","111",1,true,1,new Date(500000000));
        staffs[5] = new Dean(2,"计算机","计算机",2,"院长2","222",2,true,2,new Date(400000000));
        staffs[6] = new SecurityGuard("吃",1,"小熊","111",1,true,1,new Date(300000000));
        staffs[7] = new SecurityGuard("睡",2,"饼干","222",2,true,2,new Date(200000000));
        staffs[8] = new Teacher("计算机","计算机",1,"老师1","111",1,true,1,new Date(100000000));
        staffs[9] = new Teacher("计算机","计算机",2,"老师2","222",1,true,1,new Date(100000000));
        printName(staffs);
        sortBySalary(staffs);
        printSalary(staffs);
        print(staffs);
        sortByAge(staffs);
        print(staffs);
        sortByName(staffs);
        print(staffs);
        sortByDateHired(staffs);
        print(staffs);

    }
    private static void printName(Staff[] persons){
        for(Staff element: persons){
            System.out.println(element.getName());
        }
    }
    private static void printSalary(Staff[] staffs){
        for(Staff element: staffs){

            System.out.println("salary:"+element.getSalary());

        }
    }
    private static void sortBySalary(Staff[] staffs){
        for(int i = 0;i<staffs.length;i++){
            for(int j = 0;j<staffs.length-1;j++){
                if(staffs[j].getSalary()<staffs[j+1].getSalary()){
                    Staff tmp = staffs[j];
                    staffs[j] = staffs[j+1];
                    staffs[j+1] = tmp;
                }
            }
        }
    }
    private static void sortByAge(Staff[] staffs){
        for(int i = 0;i<staffs.length;i++){
            for(int j = 0;j<staffs.length-1;j++){
                if(staffs[j].getAge()>staffs[j+1].getAge()){
                    Staff tmp = staffs[j];
                    staffs[j] = staffs[j+1];
                    staffs[j+1] = tmp;
                }
            }
        }
    }
    private static void sortByName(Staff[] staffs){
        for(int i = 0;i<staffs.length;i++){
            for(int j = 0;j<staffs.length-1;j++){
                if(staffs[j].getName().compareTo(staffs[j+1].getName())>1){
                    Staff tmp = staffs[j];
                    staffs[j] = staffs[j+1];
                    staffs[j+1] = tmp;
                }
            }
        }
    }
    private static void sortByDateHired(Staff[] staffs){
        for(int i = 0;i<staffs.length;i++){
            for(int j = 0;j<staffs.length-1;j++){
                if(staffs[j].getDataHired().compareTo(staffs[j+1].getDataHired())>0){
                    Staff tmp = staffs[j];
                    staffs[j] = staffs[j+1];
                    staffs[j+1] = tmp;
                }
            }
        }
    }
    private static void print(Staff[] staffs){
        for(Staff element :staffs){
            System.out.println(element);
        }
        System.out.println("***********************");
    }
}
