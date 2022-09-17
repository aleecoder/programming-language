package Java.lab.demo01;

public class Student{
    private String name;		//姓名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int result;			//成绩

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Student(String name, int result){
        this.name = name;
        this.result = result;
    }
    public String toString(){
        String str = "\t姓名："+this.name+"\t成绩："+this.result;
        return str;
    }
    //重写equals()方法
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(getClass()==obj.getClass()){
            Student s = (Student) obj;
            return this.name==s.name && this.result==s.result ;
        }
        if(this==obj)
            return true;
        else
            return false;
    }
    //重写hashCode()方法
    public int hashCode(){
        return name.hashCode()*2+this.result*5;
    }

//    @Override
//    public int compareTo(Student o) {
//        Student s = o;
//        int grade = result > s.result ? 1:(result == s.result ?0:-1);
//        return grade;
//    }

}
