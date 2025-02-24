public class Droid{
  //state
  String name;
  int batteryLevel;
  //constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  //performing a task
  public void performTask(String task){
    System.out.println(name+" is performing task: "+task);
    batteryLevel -=10;
  }
  //stating its battery level
  public void checkBattery(){
    System.out.println("The battery level of "+ name +" is "+batteryLevel);

  }
  //energy transfer
  public void energyTransfer(){
    if(batteryLevel<=20){
      batteryLevel +=10;
      System.out.println(name+"gets energy from other instance and battery level is" +batteryLevel );
    }
  }
  //tostring
  public String toString(){
    return "Hello,I'm the droid: "+ name;
  }

  public static void main(String[] args){
      Droid myDroid = new Droid("Codey");
      Droid myDroid1 = new Droid("Rodey");
      System.out.println(myDroid);
      myDroid.performTask("Dancing"); 
      myDroid.performTask("Running"); 
      myDroid.performTask("cooking"); 
      myDroid.performTask("cooking"); 
      myDroid.performTask("cooking"); 
      myDroid.performTask("cooking"); 
      myDroid.performTask("cooking"); 
      myDroid.performTask("cooking"); 
      myDroid.performTask("cooking"); 
      myDroid.checkBattery();
      myDroid1.checkBattery();
      myDroid.energyTransfer();
      myDroid1.batteryLevel-=10;
      myDroid1.checkBattery();

  }
}
