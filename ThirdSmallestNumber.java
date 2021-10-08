class ThirdSmallestNumber{

public static void main(String args[]){
int a[] = {1,18,33,4,55,6};
System.out.println("Third smallest number is :"+smallestNumber(a));
}
public static int smallestNumber(int a[]){

int b = Integer.MAX_VALUE;
int c = Integer.MAX_VALUE;
int d = Integer.MAX_VALUE;

for(int i=0;i<a.length;i++){
if(b > a[i]){
d = c;
c = b;
b = a[i];
}
else if(c > a[i]){
d = c;
c = a[i];
}
else if (d > a[i]){
d = a[i];
}
}
return d;
}
}






