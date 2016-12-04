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

//for(i=0;i<8;i++)
//{
//   	cout<<rm0[i].code<<" "<<rm0[i].str1<<" "<<rm0[i].str2<<" "<<rm1[i].code<<" "<<rm1[i].str1<<" "<<rm1[i].str2<<" "<<" "<<rm2[i].code<<" "<<rm2[i].str1<<" "<<rm2[i].str2<<endl;
//}
}



int main()
{
    int i,j;
    initialise();
    char a[500];
    char c[30],d[30];
    int m1=0;
    int m2=0;
    int e=0,l=0;
    int w=0;
    int rm;
    string modd;
    gets(a);
    int len=0;
    len=strlen(a);
    char b[500];
int    len1=0;

    for(i=0;i<len;i++)
    {

        if(a[i]==' ')
        {
            }
           else
           {
               b[len1]=a[i];
               len1++;
           }

    }
      b[len1]='\0';
      len1++;
      cout<<b;
i=4;
j=0;
if(b[3]=='[')
{ m1=1;

    while(b[i]!=']')
         {
           c[j]=b[i];
           j++; i++;

         }
         i-=4;
         if(b[i]=='+')
         {
             w=1;

         }
         else if(b[i]=='0'||b[i]=='1'||b[i]=='2'||b[i]=='3'||b[i]=='4'||b[i]=='5'||b[i]=='6'||b[i]=='7'||b[i]=='8'||b[i]=='9')
         {
             w=2;
         }
         c[j]='\0';
         j=0; i+=4; i+=2;
    while(b[i]!='\0')
           {
               d[j]=b[i];
               j++;i++;



           }
       d[j]='\0';


           if(d[0]=='0'||d[0]=='1'||d[0]=='2'||d[0]=='3'||d[0]=='4'||d[0]=='5'||d[0]=='6'||d[0]=='7'||d[0]=='8'||d[0]=='9')
           {
               e=1;
           }

}
else
{e=1;
   i--;

    while(b[i]!=',')
         {
           c[j]=b[i];
           j++; i++;
         }
         c[j]='\0';
         i++;
      if(b[i]=='[')
              { m2=0;

                j=0;i++;
                while(b[i]!=']')
                {
                    d[j]=b[i];
                    j++; i++;
                    }
                     i-=4;
                if(b[i]=='+')
               {
                w=1;

                }
                else if(b[i]=='0'||b[i]=='1'||b[i]=='2'||b[i]=='3'||b[i]=='4'||b[i]=='5'||b[i]=='6'||b[i]=='7'||b[i]=='8'||b[i]=='9')
                {
                    w=2;
                }

                 i+=4;
                    d[j]='\0';


              }
      else{ j=0;

             while(b[i]!='\0')
           {
               d[j]=b[i];
               j++;i++;
           }
       d[j]='\0';

            if(d[0]=='0'||d[0]=='1'||d[0]=='2'||d[0]=='3'||d[0]=='4'||d[0]=='5'||d[0]=='6'||d[0]=='7'||d[0]=='8'||d[0]=='9')
            {
                w=4;
            }

            w=4;

           }





}



cout<<endl<<endl;
//cout<<e<<endl;
if(w==0)
{
    modd="00";
}
else if(w==1)
{
    modd="01";
}
else if(w==2)
{
    modd="10";
}
else
{
    modd="11";
}
cout<<modd<<endl;


//cout<<endl<<endl;
//cout<<c<<" "<<d;



for(i=0;i<8;i++)
{if(modd=="00")
{if(strcmp(d,rm0[i].str2)==0||strcmp(c,rm0[i].str2)==0)
{
    cout<<rm0[i].code;
}
}
else if(modd=="01")
{if(strcmp(d,rm1[i].str2)==0||strcmp(c,rm1[i].str2)==0)
{
    cout<<rm1[i].code;
}

}
else if(modd=="10")
{if(strcmp(d,rm2[i].str2)==0||strcmp(c,rm2[i].str2)==0)
{
    cout<<rm2[i].code;
}

}
else if(modd=="11")
{if(strcmp(d,reg5[i].str2)==0||strcmp(c,reg5[i].str2)==0)
{
    cout<<reg5[i].code;
}

}
}




}
