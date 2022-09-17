package Java.lab.demo06;

public class ClassRoom implements Runnable {
    Thread student1,student2,teacher;
    public ClassRoom(){
        //创建线程
        student1 = new Thread(this);
        student2 = new Thread(this);
        teacher = new Thread(this);
        student1.setName("student1");
        student2.setName("student2");
        teacher.setName("teacher");
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("student1")) {
            try{
                System.out.println(name+"准备睡10min再上课!");
                Thread.sleep(1000*60*60);
            }
            catch(InterruptedException e) {
                System.out.println(name+"被老师叫醒了!");
            }
            System.out.println(name+"开始听课!");
            student2.interrupt();       //student1吵醒student2
        }
        else if(name.equals("student2")) {
            try{
                System.out.println(name+"准备睡30min再上课!");
                Thread.sleep(1000*60*60*3);
            }
            catch(InterruptedException e) {
                System.out.println(name+"被student1叫醒了!");
            }
            System.out.println(name+"开始听课!");
        }
        else if(name.equals("teacher"))  {
            for(int i=1;i<=3;i++) {
                try{
                    Thread.sleep(500);
                    System.out.println("teacher:\"上课!\"");
                }
                catch(InterruptedException e){}
            }
            student1.interrupt();           //teacher吵醒student1
        }
    }

    public static void main(String[] args) {
        ClassRoom T320 = new ClassRoom();
        //启动线程
        T320.student1.start();
        T320.student2.start();
        T320.teacher.start();
        System.out.println("student1和student2来到了T320教室！");
    }
}
