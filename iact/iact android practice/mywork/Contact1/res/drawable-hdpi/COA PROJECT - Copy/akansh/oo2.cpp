#include<bits/stdc++.h>
#include<iostream>
#include<string.h>
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

for(i=0;i<8;i++)
{
	cout<<reg5[i].code<<" "<<reg5[i].str1<<" "<<reg5[i].str2<<endl;
}

for(i=0;i<8;i++)
{
   	cout<<rm0[i].code<<" "<<rm0[i].str1<<" "<<rm0[i].str2<<" "<<rm1[i].code<<" "<<rm1[i].str1<<" "<<rm1[i].str2<<" "<<" "<<rm2[i].code<<" "<<rm2[i].str1<<" "<<rm2[i].str2<<endl;
}
}

int main()
{

    initialise();


    char co[16];
    char d[16],s[16];

    cin>>co;

    if(co[8]=='0'&&co[9]=='0'){
       if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm0[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm0[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='1'){strcpy(d,rm0[1].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='0'){strcpy(d,rm0[2].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='1'){strcpy(d,rm0[3].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm0[4].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='1'){strcpy(d,rm0[5].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='0'){strcpy(d,rm0[6].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='1'){strcpy(d,rm0[7].str2); }
    }

    else if(co[8]=='0'&&co[9]=='1'){
       if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm1[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm1[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='1'){strcpy(d,rm1[1].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='0'){strcpy(d,rm1[2].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='1'){strcpy(d,rm1[3].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm1[4].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='1'){strcpy(d,rm1[5].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='0'){strcpy(d,rm1[6].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='1'){strcpy(d,rm1[7].str2); }
    }

    else if(co[8]=='1'&&co[9]=='0'){
       if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm2[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm2[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='1'){strcpy(d,rm2[1].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='0'){strcpy(d,rm2[2].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='1'){strcpy(d,rm2[3].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='0'){strcpy(d,rm2[4].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='1'){strcpy(d,rm2[5].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='0'){strcpy(d,rm2[6].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='1'){strcpy(d,rm2[7].str2); }
    }

    else if(co[8]=='1'&&co[9]=='1'){
          if(co[7]=='0'){
       if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,reg5[0].str1); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,reg5[0].str1); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='1'){strcpy(d,reg5[1].str1); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='0'){strcpy(d,reg5[2].str1); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='1'){strcpy(d,reg5[3].str1); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='0'){strcpy(d,reg5[4].str1); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='1'){strcpy(d,reg5[5].str1); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='0'){strcpy(d,reg5[6].str1); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='1'){strcpy(d,reg5[7].str1); }}
          else if(co[7]=='1'){

       if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,reg5[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='0'){strcpy(d,reg5[0].str2); }
       else  if(co[13]=='0'&&co[14]=='0'&&co[15]=='1'){strcpy(d,reg5[1].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='0'){strcpy(d,reg5[2].str2); }
       else  if(co[13]=='0'&&co[14]=='1'&&co[15]=='1'){strcpy(d,reg5[3].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='0'){strcpy(d,reg5[4].str2); }
       else  if(co[13]=='1'&&co[14]=='0'&&co[15]=='1'){strcpy(d,reg5[5].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='0'){strcpy(d,reg5[6].str2); }
       else  if(co[13]=='1'&&co[14]=='1'&&co[15]=='1'){strcpy(d,reg5[7].str2); }

}
    }


    if(co[7]=='0'){
       if(co[10]=='0'&&co[11]=='0'&&co[12]=='0'){strcpy(s,reg5[0].str1); }
       else  if(co[10]=='0'&&co[11]=='0'&&co[12]=='0'){strcpy(s,reg5[0].str1); }
       else  if(co[10]=='0'&&co[11]=='0'&&co[12]=='1'){strcpy(s,reg5[1].str1); }
       else  if(co[10]=='0'&&co[11]=='1'&&co[12]=='0'){strcpy(s,reg5[2].str1); }
       else  if(co[10]=='0'&&co[11]=='1'&&co[12]=='1'){strcpy(s,reg5[3].str1); }
       else  if(co[10]=='1'&&co[11]=='0'&&co[12]=='0'){strcpy(s,reg5[4].str1); }
       else  if(co[10]=='1'&&co[11]=='0'&&co[12]=='1'){strcpy(s,reg5[5].str1); }
       else  if(co[10]=='1'&&co[11]=='1'&&co[12]=='0'){strcpy(s,reg5[6].str1); }
       else  if(co[10]=='1'&&co[11]=='1'&&co[12]=='1'){strcpy(s,reg5[7].str1); }}
          else if(co[7]=='1'){

       if(co[10]=='0'&&co[11]=='0'&&co[12]=='0'){strcpy(s,reg5[0].str2); }
       else  if(co[10]=='0'&&co[11]=='0'&&co[12]=='0'){strcpy(s,reg5[0].str2); }
       else  if(co[10]=='0'&&co[11]=='0'&&co[12]=='1'){strcpy(s,reg5[1].str2); }
       else  if(co[10]=='0'&&co[11]=='1'&&co[12]=='0'){strcpy(s,reg5[2].str2); }
       else  if(co[10]=='0'&&co[11]=='1'&&co[12]=='1'){strcpy(s,reg5[3].str2); }
       else  if(co[10]=='1'&&co[11]=='0'&&co[12]=='0'){strcpy(s,reg5[4].str2); }
       else  if(co[10]=='1'&&co[11]=='0'&&co[12]=='1'){strcpy(s,reg5[5].str2); }
       else  if(co[10]=='1'&&co[11]=='1'&&co[12]=='0'){strcpy(s,reg5[6].str2); }
       else  if(co[10]=='1'&&co[11]=='1'&&co[12]=='1'){strcpy(s,reg5[7].str2); }

}

if(co[0]=='0'&&co[1]=='0'&&co[2]=='0'&&co[3]=='0'&&co[4]=='0'&&co[5]=='0'){
if(co[6]=='0')
{if(co[8]=='1'&&co[9]=='1'){cout <<"ADD"<<"  "<<d<<"   "<<s;}
else{cout <<"ADD"<<"  ["<<d<<"]   "<<s;}
}
else if(co[6]=='1'){if(co[8]=='1'&&co[9]=='1'){
cout <<"ADD"<<"  "<<s<<"   "<<d;}
else{cout <<"ADD"<<"  "<<s<<"   ["<<d<<"]";}
}

}


else if(co[0]=='0'&&co[1]=='0'&&co[2]=='0'&&co[3]=='1'&&co[4]=='0'&&co[5]=='0'){
if(co[6]=='0')
{if(co[8]=='1'&&co[9]=='1'){cout <<"ADC"<<"  "<<d<<"   "<<s;}
else{cout <<"ADC"<<"  ["<<d<<"]   "<<s;}
}
else if(co[6]=='1'){if(co[8]=='1'&&co[9]=='1'){
cout <<"ADC"<<"  "<<s<<"   "<<d;}
else{cout <<"ADC"<<"  "<<s<<"   ["<<d<<"]";}
}

}


else if(co[0]=='0'&&co[1]=='0'&&co[2]=='0'&&co[3]=='0'&&co[4]=='1'&&co[5]=='0'){
if(co[6]=='0')
{if(co[8]=='1'&&co[9]=='1'){cout <<"OR"<<"  "<<d<<"   "<<s;}
else{cout <<"OR"<<"  ["<<d<<"]   "<<s;}
}
else if(co[6]=='1'){if(co[8]=='1'&&co[9]=='1'){
cout <<"OR"<<"  "<<s<<"   "<<d;}
else{cout <<"OR"<<"  "<<s<<"   ["<<d<<"]";}
}

}


else if(co[0]=='0'&&co[1]=='0'&&co[2]=='1'&&co[3]=='1'&&co[4]=='1'&&co[5]=='0'){
if(co[6]=='0')
{if(co[8]=='1'&&co[9]=='1'){cout <<"CMP"<<"  "<<d<<"   "<<s;}
else{cout <<"CMP"<<"  ["<<d<<"]   "<<s;}
}
else if(co[6]=='1'){if(co[8]=='1'&&co[9]=='1'){
cout <<"CMP"<<"  "<<s<<"   "<<d;}
else{cout <<"CMP"<<"  "<<s<<"   ["<<d<<"]";}
}

}


else{
if(co[6]=='0')
{if(co[8]=='1'&&co[9]=='1'){cout <<"MOV"<<"  "<<d<<"   "<<s;}
else{cout <<"MOV"<<"  ["<<d<<"]   "<<s;}
}
else if(co[6]=='1'){if(co[8]=='1'&&co[9]=='1'){
cout <<"MOV"<<"  "<<s<<"   "<<d;}
else{cout <<"MOV"<<"  "<<s<<"   ["<<d<<"]";}
}

}




}
