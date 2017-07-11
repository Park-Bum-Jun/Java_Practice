package File;
import java.io.*;
class Data implements Serializable
{
	public static int bunho;
	
	private transient int number;
	private String name;
	private int age;
	
	
	static{
		bunho = 0;
	}
	public Data()
	{
		number = ++bunho;
		name = "noname";
		age = 0;
	}
	public Data(String name, int n)
	{
		number = ++bunho;
		this.name = name;
		age = n;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Data [number="+number+",name="+name+",age="+age+"]";
	}
}
public class ObjectSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			Data Obj[] = new Data[3];
			Obj[0] = new Data("P", 44);
			Obj[1] = new Data("L", 43);
			Obj[2] = new Data("K", 42);
			for(Data k:Obj)
				System.out.println(k);
			System.out.println("====================================");
			System.out.println("직렬화 후 출력");
			System.out.println("====================================");
			
			try {
				fos = new FileOutputStream("c:\\object.txt");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(Obj[0]);
				oos.writeObject(Obj[1]);
				oos.writeObject(Obj[2]);
				fis = new FileInputStream("c:\\object.txt");
				ois = new ObjectInputStream(fis);
				Data temp = (Data) ois.readObject();
				System.out.println(temp);
				temp = (Data) ois.readObject();
				System.out.println(temp);
				temp = (Data) ois.readObject();
				System.out.println(temp);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}finally {
				try {
					if(fis != null)fis.close();
					if(ois != null)ois.close();
					if(fos != null)fos.close();
					if(oos != null)oos.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
	}

}
