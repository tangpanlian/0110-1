public class Test01 {
    public static void main(String[] args) {
        pp stu=new pp();

       stu.setStuId(2019102042);
       stu.setPassword("1234");
       stu.setMajor("软件工程");
       stu.setPhone("15278089942");

        System.out.println(stu.getStuId());
        System.out.println(stu.getPassword());
        System.out.println(stu.getMajor());
        System.out.println(stu.getPhone());
    }
}
