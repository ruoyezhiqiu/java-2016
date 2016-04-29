package afterteacher;

/**
 * Created by john on 2016/4/16.
 */

interface DaoDao{
    void add();
}
class Dog10_4{   public void print10_4(){
       new DaoDao(){
           public void add(){
            System.out.println("添加成功！");
           }
       }.add();
   }
}
public class Demo10_4 {
    public static void main(String[] args) {
        Dog10_4 dog10_4 = new Dog10_4();
        dog10_4.print10_4();
        getDao(new DaoDao() {
            @Override
            public void add() {
                System.out.println("添加成功了！");
            }
        });
    }
    public static void getDao(DaoDao dao){
        dao.add();
    }
}
