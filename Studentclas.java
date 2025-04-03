class Student{
    int rollno;
    String name;
    String course;
    int m1,m2,m3;

    public  int total(){
        return m1+m2+m3;
    }

    public double average(){
        return (double)total()/3;
    }
    public String toString(){
        return ("Roll number:"+rollno+" Name: "+name+" Course: "+course);      
        //when we write like toString method then
        //  ther will be no need to call this method in method calling instead we can call only using object.
        
    }
    
    public void grade(){
        if(total()>70){
            System.out.println("you get grade 'A'");
        }else if(total()>60 && total()<69){
            System.out.println("you get a grade 'B'");
        }
        else if(total()>50 && total()<49){
            System.out.println("you got grade 'C'");
        }else if(total()>40 && total()<39){
            System.out.println("you got grade 'D'");
        }else{
            System.out.println("you failed");
        }

    }
}
public class Studentclas {
    public static void main(String[] args) {
        Student s=new Student();
        s.course="MCA";
        s.rollno=122099;
        s.name="soumya";
        s.m1=50;
        s.m2=70;
        s.m3=90;

        System.out.println(s);      //only used object not passing any method to it.
        System.out.println("Total is:"+s.total());
        System.out.println("average:"+s.average());
        s.grade();
        
    }
}
