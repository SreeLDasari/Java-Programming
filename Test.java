
public class Test {
	
	    int id;
	    String name;
	    int age;
	    Test(){
	    System.out.println("Constructor");
	    }
	    Test(int i,String n,int a){
	    id = i;
	    name = n;
	    age=a;
	    }
	    void display(){System.out.println(id+" "+name+" "+age);
	 
	  
	}

	public static void main(String[] args) {
		Test s1 = new Test();
	//	Test s2 = new Test(222,"Aryan",25);
		    s1.display();
		   // s2.display();

	}

}
