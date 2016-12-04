class SortString
{public static void main(String ar[])
{String x[]={"BUNNY","SUNNY","MUNNY","ANNY","PANNY","DANNY"};
System.out.println("\n\nUnSorted String is\n\n");
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]+"    ");
}

for(int i=0;i<x.length;i++)
{
for(int j=i+1;j<x.length;j++)
{
if(x[i].compareTo(x[j])>0)
{
String n=x[i];
x[i]=x[j];
x[j]=n;
}
}}
System.out.println("\n\nSorted String is\n\n");
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]+"   ");
}
}}