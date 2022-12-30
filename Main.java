class Main {
  public static void main(String[] args) {
   
   System.out.println(leapYear (2000));//true
     System.out.println  (leapYear (2024));//false
     System.out.println(leapYear (2010));//false
 System.out.println(leapYear (1900));//false
   System.out.println(leapYear (1600));//true
    
  }

  public static  boolean leapYear(int year){
  return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    
  }
}