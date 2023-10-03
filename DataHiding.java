class Student
{
    private int age;
    void setAge(int age)
    {
        this.age=age;
    }
    int  getAge()
    {
        return age;
    }
}
public class DataHiding
{
	public static void main(String[] args) {
		Student st=new Student();
		st.setAge(12);
		System.out.println(st.getAge());
	}
}
