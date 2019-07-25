
public class PracticeException {

  public static void main(String args[]) {

    String str = "i am here";
    String s ="hello";
    String[] strArr = str.split(" ");
    char[] arr = s.toCharArray();
    int length = arr.length;
    reverseString(arr,0);
    System.out.println("NEW");
    reverseString(strArr,0);

  }

  public static void  reverseString(char[] arr, int count) {
    if(count>=arr.length){
      return;
    }
    reverseString(arr,count+1);
    System.out.print(arr[count]);
  }


  public static void  reverseString(String[] arr, int count) {
    if(count>=arr.length){
      return;
    }
    reverseString(arr,count+1);
    System.out.print(arr[count]+ " ");
  }

  /*public static void foo(int i, long l){
    System.out.println("integer");
  }*/

  public static void foo(long i, long l) {
    System.out.println("long");
  }


  public static void foo(float i, long l) {
    System.out.println("float");
  }

}