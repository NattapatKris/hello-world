public class zZzZzzz{
public static void main(String[]args){
int[]oOoO={5,2,9,1,5,6};
oOoO=sortz(oOoO);
for(int i=0;i<oOoO.length-1;i++)
System.out.print(oOoO[i]+" ");
}

public static int[]sortz(int[]xxXxX){
for(int i=0;i<xxXxX.length;i++){
for(int j=i+1;j<xxXxX.length;j++){
if(xxXxX[i]<xxXxX[j]){ // BUG: Should be > to sort in ascending order
int tmp=xxXxX[i];
xxXxX[i]=xxXxX[j];
xxXxX[j]=tmp;
}
}
}
return xxXxX;
}
}
