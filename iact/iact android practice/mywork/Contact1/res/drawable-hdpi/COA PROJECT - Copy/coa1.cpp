#include<bits/stdc++.h>
using namespace std;

class rm{

	public:
	char code[30];
	char str1[30];
    char str2[30];
};
class reg{
	public:
	char code[30];
	char str1[30];
	char str2[30];

};
rm rm0[8],rm1[8],rm2[8];
reg reg5[8];
void initialise()
{
      char a[30],b[30],c[30],d[30];


	int i;
	char code[30];
	FILE *fp;
    fp=fopen("REG.txt","r+");
	for(i=0;i<8;i++)
	{
	fscanf(fp,"%s %s %s \n",reg5[i].code,reg5[i].str1,reg5[i].str2);
	}
	fclose(fp);



    fp=fopen("R-M.txt","r+");
	for(i=0;i<8;i++)
	{
	fscanf(fp,"%s %s %s %s\n",a,b,c,d);
	strcpy(rm0[i].code,a);  strcpy(rm0[i].str1,"00"); strcpy(rm0[i].str2,b);
	strcpy(rm1[i].code,a);   strcpy(rm1[i].str1,"01"); strcpy(rm1[i].str2,c);

	strcpy(rm2[i].code,a);    strcpy(rm2[i].str1,"10"); strcpy(rm2[i].str2,d);


	}
	fclose(fp);

//for(i=0;i<8;i++)
//{
//	cout<<reg5[i].code<<" "<<reg5[i].str1<<" "<<reg5[i].str2<<endl;
//}

for(i=0;i<8;i++)
{
   	cout<<rm0[i].code<<" "<<rm0[i].str1<<" "<<rm0[i].str2<<" "<<rm1[i].code<<" "<<rm1[i].str1<<" "<<rm1[i].str2<<" "<<" "<<rm2[i].code<<" "<<rm2[i].str1<<" "<<rm2[i].str2<<endl;
}
}

int main()
{
    initialise();



}
