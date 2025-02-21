public class Calculator{
  //constructor
  public Calculator(){

  }
  //add
  public int add(int a,int b){
     int result = a+b;
     return result;
  }
  //sub
  public int subtract(int a,int b){
     int result = a-b;
     return result;
  }
  //muliply
  public int multiply(int a,int b){
    int result = a*b;
    return result;
  }
  //divide
  public int divide(int a,int b){
    int result = a/b;
    return result;
  }
  //modulo
  public int modulo(int a,int b){
    int result = a%b;
    return result;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
  }

}
