
public class MainClass {
	public static void main(String[] args) {
		
		WorkService service = new WorkService() {
			@Override
			public void doSomeWork() {
				System.out.println("work in progress");
			}
		};
		
		service.doSomeWork();
		
		WorkService service2 = ()->{
			System.out.println("Work in progress");
			System.out.println("finally work is done");
		};
		
		service2.doSomeWork();
	}
}
