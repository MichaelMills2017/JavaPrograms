import java.util.Scanner;

					public class Program extends Looparound {
						Scanner scan = new Scanner(System.in);
						
						public void programLogic() {
							System.out.println("Enter a number to see multiplication table");
							int number = scan.nextInt();
							
							for(int i=1; i<=10; i++) {
								System.out.println(number + "x" +i+ "=" + number*i);
							}
						}
					}
							