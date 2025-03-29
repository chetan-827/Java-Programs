package variables;

public class Loopthrougharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars= {"volvo","BMW","ford","Benze"};
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		for(String i:cars) {
			System.out.println(i);
		}
		int ages[]= {10,20,30,40,50,60,70,80};
		float avg,sum=0;
		int length=ages.length;
		for(int age:ages) {
			sum+=age;
		}
		avg=sum/length;
		System.out.println("The average age is:"+avg);
		
	}

}
