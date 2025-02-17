package dav12_15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


public class Main{
public static void main(String[] args)throws IOException {
  /*n1
  FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\lamdasdf.txt");
    int a = fileInputStream.read();
    while(a!=-1){
        System.out.println(a);
        a=fileInputStream.read();
    }
    fileInputStream.close();

    }


   */
  /*n2
  FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\lamdasdf.txt");
  FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\a2.txt");
  int c = fileInputStream.read();
  int[] arr = new int[10];
  int i = 0;
  while(c!=-1&&i<arr.length){
    arr[i] =c;
    c = fileInputStream.read();
    i++;
  }
  int sum=0;
  for(int j = 0;j<arr.length;j++){
    sum+=arr[j];
  }
  int j = 0;
  while(j<arr.length){
    fileOutputStream.write(arr[j]);
    j++;
    fileOutputStream.write(sum);
    }

   */
  /*n4
  Scanner scanner = new Scanner(System.in);
  int count  = scanner.nextInt();
  int[] arr = new int[count ];
  for(int i = 0 ; i < arr.length;i++){
    arr[i]=scanner.nextInt();
  }
  FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\a2.txt");
  fileOutputStream.write(arr.length);
  for(int num:arr){
    fileOutputStream.write(num);
  }

   */
FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\lamdasdf.txt");
int b = fileInputStream.read();
int pos=0;
int nu=0;
int neg=0;
while(b!=-1){
  if(b<0){
    neg++;
  }else if (b>0){
    pos++;
  }else{
    nu++;
  }
  b=fileInputStream.read();
}
  System.out.println(pos);
  System.out.println(neg);
  System.out.println(nu);
}
}