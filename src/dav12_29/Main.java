package dav12_29;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*n1
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random rand = new Random();
        boolean ormoci=false;
        while(!ormoci){
            int n = rand.nextInt(51);
            arrayList.add(n);
            if(n==40){
                ormoci=true;
            }
        }
        System.out.println(arrayList.size());
        for(int i: arrayList){
            System.out.println(i);
        }
        for(int i = 0;i < arrayList.size();i++){
            if(arrayList.get(i)%2==0){
                arrayList.remove(i);
            }
        }
        for(int i: arrayList){
            System.out.println(i);
        }

 */
/*n2
        int[] arr = new int[5];
        Random rand = new Random();
        for(int i=0;i< arr.length;i++){
            arr[i] = rand.nextInt(51);
        }
        int index=0;
        int num  = 0;
        for(int i = 0 ;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                index = i;
                num = arr[i];
            }
        }
        System.out.println(index);
        System.out.println(num);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < arr.length;i++){
            arrayList.add(arr[i]);
        }


 */
        /*n3
ArrayList<Student> arrayList = new ArrayList<>();
    arrayList.add(new Student("ada","asdasf",155));
    arrayList.add(new Student("das","eadas",3331));
    arrayList.add(new Student("qwef","hasgmm ",55554));
    arrayList.add(new Student("fasf","aweqwh",2223));
    arrayList.add(new Student("gasd","kythg",12345));

for(int i = 0 ; i < arrayList.size();i++) {
    for (int j = 0; j < arrayList.size(); j++) {
        Student temp;
        if (arrayList.get(i).getScore() <= (arrayList.get(j).getScore())) {
            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
        }
    }
}
for(Student s:arrayList){
    System.out.println(s);
}

         */
        /*
        int[] arr = {1,2,3,4,5};
        int[] arr1={1,4,9,15,7,14,3};
        int [] arr2 = {1,100,3,4,41};
        for(int i = 0;i<arr.length;i++){
            int a = arr[i];
            boolean found1=false;
            boolean found2 = false;
            for(int j = 0;j<arr1.length;j++){
                if(arr1[j]==a){
                    found1=true;
                }
            }for(int k = 0;k<arr1.length;k++){
                if(arr1[k]==a){
                    found2=true;
                }
            }
            if(found1 && found2){
                System.out.println(a + " ");
            }
        }

         */
/*n5
        String[] arr= {"luka","luka","luka","nika","nika","mate"};
        for(int i = 0;i< arr.length;i++){
            int count  = 0 ;
            for(int j = i+1;j< arr.length;j++){
            if(arr[i].equals(arr[j])){
                count++;
            }
            }
            System.out.println(arr[i]+" Meordeba : " + count);
            i=i+count;
        }

 */
}}

