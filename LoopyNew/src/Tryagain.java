public class Tryagain extends Program {
								
								public void tryIt() {
									System.out.println("Try another number? (Y/N)");
									String tryagain = scan.nextLine().toUpperCase();
									
									if(tryagain.equals("Y")) {
										setBreaker(false);
									} else {
										System.out.println("Have a good day!!!");
										setBreaker(true);
									}
								}
}