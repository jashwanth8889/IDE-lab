import java.util.*;

class StudentDetails{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long ph;
        int marks[] = new int[6];
        String name,address;
        System.out.print("Enter Name : ");
        name = s.nextLine();
        System.out.print("Enter Address : ");
        address = s.nextLine();
        System.out.print("Enter phNumber : ");
        ph = s.nextLong();
        for(int i=0;i<6;i++){
            System.out.print("Enter Marks(Out Of 15) in Subject-"+(i+1)+" : ");
            marks[i] = s.nextInt();
        }
        int total = 0;
        System.out.println("Details : \nName : "+name+"\nAddress : "+address+"\nph : "+ph);
        for(int i=0;i<6;i++){
            System.out.println("Marks in Subject-"+i+" : " + marks[i]);
            total+=marks[i];
        }
        System.out.println("Average Marks : " + total/6);
        System.out.println("Percentage : " + (total*100)/90 + "%");
        
    }
}