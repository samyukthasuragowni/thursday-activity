public class MatrixTransposeExample{  
public static void main(String args[]){    
int original[][]={{1,2,4},{2,2,3},{3,2,5}};    
int transpose[][]=new int[3][3];  //  
    
//Code to transpose a matrix  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
transpose[i][j]=original[j][i];  
}    
}    
  
System.out.println("Print Mat without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(original[i][j]+" ");    
}    
System.out.println();    
}    
System.out.println("Print Mat After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(transpose[i][j]+" ");    
}    
}    
}}  

