
public class ExClass {
	int i=0;
	static int j=0;
	ExClass(){
		i++;
		j++;
	}
	public void ex() {
		
		System.out.println(j+""+i);
	}

	public static void main(String[] args) {
		
		ExClass ob=new ExClass();
		ExClass ob1=new ExClass();
		ob.ex();
		
		System.out.println(ob.i+" "+j);
	}

}
