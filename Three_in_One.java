**1.Large number 
#include<iostream> 
#include<bits/stdc++.h> 
using namespace std; 
int main(){
int n; cin>>n;
vector<int>v; while(n){
v.push_back(n%10); n/=10;
}
sort(v.begin(),v.end(),greater<int int new_num=0;
for(auto it:v){ new_num=new_num*10+it;
}
cout<<new_num<<endl;
}




1.reverse string(ans)

#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
string str; getline(cin,str); int n=str.length();
 
for(int i=0;i<n/2;i++){ swap(str[i],str[n-1-i]);
}
cout<<str;

}




2.(Kg(s) to Pound(s))

#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
int w; cin>>w;
cout<<fixed<<setprecision(2)<<(w*2.2)<<endl;

}


3.(Disk capacity)

#include<bits/stdc++.h> using namespace std;
int main()
{
int t,s,b; cin>>t>>s>>b; cout<<2*t*s*b*512;
}




4.(phone number validation)
 
#include<iostream> #include<string> using namespace std; int main(){
int n; cin>>n;x
string str1=to_string(n); if(str1.length()==10&&str1[0]!='0'){
cout<<"Valid"<<endl;
}else{
cout<<"Invalid"<<endl;

}
}




5.(Reverse of a number)

#include<iostream> using namespace std; int main(){
int num; cin>>num;
int new_num=0; while(num){
new_num=new_num*10+(num%10); num/=10;
}
cout<<new_num<<endl;
}
 

6.(To Lower Case)

#include<iostream> using namespace std; int main(){
string str1; cin>>str1;
for(int i=0;i<str1.length();i++){ if(str1[i]>='a'&&str1[i]<='z'){
continue;
}else{

str1[i]=str1[i]+32;
}

}
cout<<str1<<endl;

}





7.(Area of circle):

#include<iostream> #include<bits/stdc++.h> #define pi 3.14
using namespace std; int main(){
double r; cin>>r;
cout<<fixed<<setprecision(2)<<pi*r*r<<endl;
}
 



8.(Simple Interest)

#include<iostream> using namespace std; int main(){
int p,t,r; cin>>p>>t>>r; cout<<(p*r*t)/100;
}


9.//compound interest #include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
double p,r,t; cin>>p>>r>>t;
cout<<fixed<<setprecision(2)<<p*pow(1+(r/100),t)<<endl;
}


10.(farenheight to celsius)

#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
double f; cin>>f;
cout<<fixed<<setprecision(2)<<5*(f-32)/9<<endl;
 
}



11.(Celsius to farenheight)
c;
cout<<fixed<<setprecision(2)<<(c*9/5)+32<<endl;
}
12(check if number is even or odd)

#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
double c;
cin>> e <iostream> using namespace std; int main()
{
int n; cin>>n; if(n&1){
cout<<"Odd"<<endl;
}else{
cout<<"Even"<<endl;
}
}

13. Find The Average of Two Numbers

#include <iostream> #include<bits/stdc++.h>
 
using namespace std; int main()
{
double a,b; cin>>a>>b;
cout<<fixed<<setprecision(4)<<(a+b)/2<<endl;
}



14.
#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
int a,b,c; cin>>a>>b>>c;
float s=(float)(a+b+c)/2; cout<<fixed<<setprecision(2)<<sqrt(s*(s-a)*(s-b)*(s-c))<<endl;
}
15.
#include<bits/stdc++.h> using namespace std; int main()
{
int a; cin>>a;
int k=sqrt(a); if(k*k==a)
 
{

cout<<"True";

}
else

{
cout<<"False";

}

}


16.
print(input()) #include <iostream>
#include<bits/stdc++.h> using namespace std; int main()
{
string str; getline(cin,str);
cout<<str<<endl;
}


17.	Modulus

#include <iostream> using namespace std; int main()
{
int a,b; cin>>a>>b;
 
cout<<a%b<<endl;
}

18.	Division
#include <iostream> using namespace std; int main()
{
int a,b; cin>>a>>b; cout<<a/b;
}
19.	Multiplication
#include <iostream> using namespace std; int main()
{
int a,b; cin>>a>>b; cout<<a*b;
}


20.	program to Multiply Two Floating-Point Numbers

#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
float a,b;
 
cin>>a>>b; cout<<fixed<<setprecision(2)<<a*b<<endl;
}


21.	Find ASCII Value of a Character
#include<iostream> using namespace std; int main(){
char ch; cin>>ch;
cout<<(int)ch<<endl;
}




22.	Program to Check Whether The Given Integer is Positive or Negative
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; if(n<0)
{

cout<<"Negative Number";
}

else
{
cout<<"Positive Number";
}
 
}


23) Primes


#include<iostream> #include<bits/stdc++.h> bool prime(int n){
if(n<=1){ return false;
}
for(int i=2;i<=sqrt(n);i++){ if(n%i==0){
return false;
}
}
return true;
}
using namespace std; int main(){
int n; cin>>n;
for(int i=0;i<=n;i++){ if(prime(i)){
cout<<i<<" ";
}
}
}
 
24.Triangle

#include<bits/stdc++.h> using namespace std; int main()
{
int a,b,c; cin>>a>>b>>c; if(a==b && b==c)
{
cout<<"Equilateral triangle";
}
else if(a==b || b==c || a==c )
{
n%10;
cout<<" ";
}
else
{

cout<<"Scalene triangle";
}

}
25) Element search in an array
}
} #include<iostream> using namespace std; int main(){
int n; cin>>n; int arr[n];
 
for(int i=0;i<n;i++){ cin>>arr[i];
}
int key; cin>>key;
bool flag=true; for(int i=0;i<n;i++){
if(arr[i]==key){ cout<<"True"<<endl; flag=false;
break;

}
}

if(flag){
cout<<"False"<<endl;




26.	Palindrome #include<iostream> bool palindrome(int n){
int sum=0; int num=n; while(num){
sum=sum*10+num%10; num/=10;
}
if(sum==n){ return true;
}else{
 
return false;

}

}
using namespace std; int main(){
int n; cin>>n;
if(palindrome(n)){ cout<<"Palindrome"<<endl;
}else{
cout<<"Not Palindrome"<<endl;

}
}


int main()
{
int n; cin>>n; if(palin(n))
{
cout<<"Palindrome";
}
else
{
cout<<"Not Palindrome";
}
}
 
27.	Power of a Number

#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
int a,b,c; cin>>a>>b>>c; int d=pow(a,b);
cout<<d%c<<endl;
}




28) Primes in Given Range


#include <iostream> #include<bits/stdc++.h> bool prime(int n){
if(n<=1){

return false;
}

for(int i=2;i<=sqrt(n);i++){ if(n%i==0){
return false;
}
}

return true;
}

using namespace std;
 
int main()
{
int a,b; cin>>a>>b; int count=0;
for(int i=a;i<=b;i++){ if(prime(i)){
count++;
}
}
cout<<count<<endl;
}




29.reverse a string #include<bits/stdc++.h> using namespace std; int main(){
string str; getline(cin,str); int n=str.length();
for(int i=0;i<n/2;i++){ swap(str[i],str[n-1-i]);
}
cout<<str;
}
30.
#include<bits/stdc++.h> using namespace std;
 
int main()
{
int n; cin>>n;
int arr[n-1]; int sum=0;
for(int i=0;i<n-1;i++)
{
cin>>arr[i]; sum=sum+arr[i];
}
int h=n*(n+1)/2; cout<<h-sum;
}


31.	Largest Digit

#include <iostream> using namespace std; int main()
{
int n; cin>>n; int ans=0; while(n){
ans=max(ans,n%10); n/=10;
}
cout<<ans;
 
}


32.	Find The Single Element
#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++){ cin>>arr[i];
}
unordered_map<int,int>mpp; for(int i=0;i<n;i++){ mpp[arr[i]]++;
}
for(auto it:mpp){ if(it.second==1){
cout<<it.first<<endl; break;
}
}
}
Bitmanupulation #include <iostream> using namespace std; int main()
 
{

int n; cin>>n; int arr[n];
for(int i=0;i<n;i++){ cin>>arr[i];
}
int ans=0;
for(int bit=0;bit<=31;bit++){ int temp(1<<bit);
int one=0;
for(int i=0;i<n;i++){ if(temp&arr[i]){
one++;
}
}
if(one%3==1){ ans=ans|temp;
}
}

cout<<ans<<endl;

}




33.	Print The Following Pattern 13

#include <iostream> using namespace std; int main()
 
{

int n; cin>>n;
for(int i=1;i<=n;i++){ for(int j=1;j<=i;j++){
cout<<j;
}
cout<<endl;
}

}




34.	Arrays Equal
#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
int arr1[n]; int arr2[n];
for(int i=0;i<n;i++) cin>>arr1[i]; for(int i=0;i<n;i++) cin>>arr2[i]; sort(arr1,arr1+n);
 
sort(arr2,arr2+n); bool flag=true; for(int i=0;i<n;i++){
if(arr1[i]!=arr2[i]){ cout<<"0"<<endl; flag=false;
break;
}
}
if(flag){
cout<<"1"<<endl;

}
}
35	Reversing The Equation

#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
string str1; cin>>str1; string ans=""; string temp="";
for(int i=str1.length()-1;i>=0;i--){
if(str1[i]>='0'&&str1[i]<='9'){ temp=str1[i]+temp;
}else{
if(!temp.empty()){ ans+=temp+str1[i];
 
temp="";
}else ans+=str1[i];
}
}
if(!temp.empty()){ ans+=temp;
}
cout<<ans<<endl;

}


36	Digit Game

#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
string x,y; cin>>x>>y;
int count_x=0,count_y=0; for(int i=0;i<x.length();i++){
if(x[i]>y[i]){ count_x++;
}else if(x[i]<y[i]){
count_y++;
}
}
 
if(count_x>count_y){ cout<<"Calvin"<<endl;
}else if(count_x<count_y){ cout<<"Django"<<endl;
}else{
cout<<"Tie"<<endl;
}


}


37.
#include<bits/stdc++.h> using namespace std; int main(){
string s; cin>>s;
string ans= ""; char pre = ' ';
for(int i=0;i<s.size();i++){
if ((s[i] == 'a' || s[i]== 'e' || s[i] == 'i' || s[i]== 'o' || s[i]== 'u') && prevchar !='V'){ ans+='V';
pre='V';
}else if(prevchar !='C'){ ans+='C';
pre='C';
}
}
cout<<ans;
}
 





38.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
cout<<n*(n+1)/2;
}


39.
#include<bits/stdc++.h> using namespace std; int main()
{
int x,y; cin>>x>>y; if(x>=y*30)
{
cout<<"YES";
}
else
{
cout<<"NO";
}
}
 
40 Expenditure


cc





41
#include <iostream> using namespace std; int main()
{
int b,s; cin>>b>>s; if(b==s){
cout<<"No profit and No loss"<<endl;
}else if(b>s){ cout<<"Loss"<<endl;
}else{ cout<<"Profit"<<endl;
}
}


41.
#include <iostream> using namespace std; int main()
{
 
int w,x,y,z; cin>>w>>x>>y>>z;
cout<<(w+(x*z)-(y*z))<<endl;

}




42.
#include<bits/stdc++.h> using namespace std; int main()
{
int r; cin>>r; if(r>20)
{
cout<<"HOT";
}
else

{
cout<<"COLD";

}

}




43.
#include<bits/stdc++.h> using namespace std; int main()
{
 
int r; cin>>r;
cout<<fixed<<setprecision(2)<<3.14*r*r<<endl; cout<<fixed<<setprecision(2)<<3.14*r*2<<endl;
}


44.
#include<bits/stdc++.h> using namespace std; int main()
{
int n,k,x,y; cin>>n>>k>>x>>y; if(x<y)
{
cout<<n*x;
}
else

{
cout<<(k*x)+((n-k)*y);

}

}


45.
#include<bits/stdc++.h> using namespace std; int main()
{
int n;
 
cin>>n; if(n%9==0)
{
cout<<"True";
}
else
{
cout<<"False";
}

}


46.
#include<bits/stdc++.h> using namespace std; int main()
{
int n,m; cin>>n>>m; if(n>m)
{
cout<<n;
}
else
{
cout<<m;
}
}
 
47.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; if(n%2==0)
{
cout<<"Even";
}
else
{
cout<<"Odd";
}

}




48.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
int arr[n-1]; int sum=0;
for(int i=0;i<n-1;i++)
{
 
cin>>arr[i]; sum=sum+arr[i];
}
int h=n*(n+1)/2;

cout<<h-sum;
}


49.
#include<bits/stdc++.h> using namespace std; bool Armstrong(int n)
{
int h=n; int sum=0; while(h)
{
sum=sum+(pow(h%10,3)); h=h/10;
}
if(n==sum)
{
return true;
}
return false;

}
int main()
{
int n; cin>>n;
 
if(Armstrong(n))
{
cout<<"Yes";
}
else
{
cout<<"No";
}

}




50.
#include<bits/stdc++.h> using namespace std; bool accen(int arr[],int n)
{
for(int i=0;i<n-1;i++)
{
if(arr[i]>arr[i+1])
{
return false;
}
}
return true;
}
bool decen(int arr[],int n)
{
for(int i=0;i<n-1;i++)
{
 
if(arr[i]<arr[i+1])
{
return false;
}
}
return true;

}
int main()
{
int n; cin>>n; int arr[n]; int ans=0;
for(int i=0;i<n;i++)
{
cin>>arr[i];
}
if(accen(arr,n)||decen(arr,n))

{
cout<<'1';

}
else
{
cout<<'0';
}

}


51.
c
 



52.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++)

{
cin>>arr[i];

}
sort(arr,arr+n); cout<<arr[n-1];
} 54
#include <iostream> using namespace std; int main()
{
int n; cin>>n;
int count=0; int num=n; while(num){
int r=num%10; num/=10;
 
if(r!=0 && n%r==0){ count++;
}
}

cout<<count<<endl;
}

55. Distinct Pairs Count #include <bits/stdc++.h> using namespace std;
int countUnique(int arr[], int n)
{
set<pair<int,int>>s; for (int i=0;i<n;i++)
for (int j=0;j<n;j++) s.insert(make_pair(arr[i],arr[j]));
return s.size();
}
int main()

{
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++)
{
cin>>arr[i];
}
cout<<countUnique(arr, n);

}
 

Or #include<bits/stdc++.h> using namespace std; int main(){
int n; cin >> n; int arr[n];
int cnt = 0; unordered_map<int,int>mp; for(int i=0;i<n;i++){
cin >> arr[i]; mp[arr[i]]++;
}
for(auto i:mp){ if(i.second==1) cnt++;
}
if(cnt == 1) cout<<4; else cout << cnt * cnt;
}


56.
#include<bits/stdc++.h> using namespace std; int main()
{
int x,a,b; cin>>x>>a>>b; if(x<=(a+(2*b)))
{
 
cout<<"Qualify";

}
else
{

cout<<"Not Qualify";
}

}
57 odd pairs #include <iostream>
using namespace std; int main()
{
long int n; cin>>n;
if(n%2==0) cout<<(n/2)*(n/2)*2; else cout<<(n/2 + 1)*(n/2)*2;
}
Or
#include <iostream> using namespace std; int main()
{
long int n; cin>>n; cout<<n*n/2;
}




58. Tricky Time Tables
 
#include<bits/stdc++.h> using namespace std; int main(){
int n,a,b,z; cin>>n>>a>>b>>z; for(int i=a;i<=b;i+=z){
cout<<n<<" x "<<i<<" = "<<n*i<<endl;
}
}




59.
#include<bits/stdc++.h> using namespace std; int main()
{
int W,X,Y,Z; cin>>W>>X>>Y>>Z;
if (W == X || W == Y || W == Z)
{
cout << "YES" << endl;
}
else if (W == X + Y || W == Y + Z || W == X + Z)
{
cout << "YES" << endl;
}
else if (W == X + Y + Z)
{
cout << "YES" << endl;
 
}
else
{
cout << "NO" << endl;

}
}




59.
#include<bits/stdc++.h> using namespace std; int main()
{
int n1,n2,x; cin>>n1>>n2>>x; if(n2>n1)
{
cout<<(x/(n2-n1))+1;
}
else
{
cout<<"-1";
}
}




60. CARS-1 #include<iostream> using namespace std;
 
int main(){
int n1,n2,x; cin >> n1 >> n2 >> x; int a,b;
a = b + x; b = a - x;
int tym = 0; while(b<=a){
a += n1; b += n2; tym++;
if(tym>453664) break;
}
if(b<=a) cout<<-1; else cout<<tym;
}


61.
#include<iostream> using namespace std; int main(){
int n; cin>>n;
cout<<n*(n+1)/2<<endl;
}





62.
#include<bits/stdc++.h>
 
using namespace std; int main()
{
int n; cin>>n;
for(int i=1;i<=n;i++)
{
cout<<i<<" ";
}
}


63.
#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
string str; getline(cin,str); string new_str; for(auto it:str){
if((it>='a'&&it<='z')||(it>='A'&&it<='Z')){ new_str+=it;
}
}
cout<<new_str<<endl;
} 64
#include<bits/stdc++.h>
 
using namespace std; int main()
{
int a,b,c; cin>>a>>b>>c;
if((a+b)>c && (b+c)>a && (a+c)>b)
{
cout<<"Valid triangle";
}
else
{

cout<<"Invalid triangle";
}

} 65
#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
string str1; cin>>str1; if(str1[0]=='-'){
reverse(str1.begin()+1,str1.end());
}else{
reverse(str1.begin(),str1.end());
}
bool flag=true; for(auto it:str1){
 
if(it=='0'&&flag==true){ continue;
}
if(it>='1'&&it<='9') flag=false; cout<<it;
}

}


66.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++)

{
cin>>arr[i];

}
sort(arr,arr+n); for(int i=0;i<n;i++)
{
cout<<arr[i]<<" ";
}

}
 
67)	Romeo and Juliet #include<bits/stdc++.h> using namespace std; int main()
{
int x,y,z; cin>>x>>y>>z;
int ans=(x*5+y*10)/z; cout<<ans;
}
68)	Hours and Minuts
69.
*
int a,b,c; cin>>a>>b>>c;
cout<<max(a,max(b,c));
}


70.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; if(n==1)
{
cout<<"monday";
}
 
else if(n==2)
{
cout<<"tuesday";
}
else if(n==3)
{
cout<<"wednesday";
}
else if(n==4)
{
cout<<"thursday";
}
else if(n==5)
{
cout<<"friday";
}
else if(n==6)
{

cout<<"saturday";
}

else if(n==7)
{
cout<<"sunday";
}
else{
cout<<"invalid input";
}

}
 
71.
72.


cin>>a>>b>>c>>d>>e; int per=(a+b+c+d+e)/5; if(per>=90)
{
cout<<"Grade A";
}
else if(per>=80)
{

cout<<"Grade B";
}

else if(per>=70)
{
cout<<"Grade C";
}
else if(per>=60)

{
cout<<"Grade D";

}
else if(per>=40)
{
cout<<"Grade E";
}
else
{
cout<<"Grade F";
}
 
}


74) Owl coders wifi problems #include <bits/stdc++.h> using namespace std;

bool wifi(int N, string S, int X){ int check = 0;
for(int i=0; i<N; i++){ if(S[i]=='0'){
check--;
}else{
if(check>=-X) check = X; else return 0;
}
}
return (check<0)?0:1;
}
int main()
{
int N,X; cin>>N>>X; string S; cin>>S;
if(wifi(N,S,X)) cout<<1; else cout<<0;
}
 
76.
#include<bits/stdc++.h> using namespace std; int fact(int n)
{
if(n==1)
{
return 1;
}
return n*fact(n-1);

}
int main()
{
int n; cin>>n;
cout<<fact(n);
}




77.
#include<bits/stdc++.h> int fun(int n){
if(n&1){ return 2;
}else{
return 1;
}
}
using namespace std;
 
int main(){ int n; cin>>n;
cout<<fun(n);
}




78.
#include<bits/stdc++.h> int fun(int n){
if(n&1){ return 2;
}else{
return 1;
}
}
using namespace std; int main(){
int n; cin>>n;
cout<<fun(n);
}







78.
#include<iostream> using namespace std;
 
int main(){ int n; cin>>n; int ans=0; while(n){
if(n%2==0){
n/=2;
}else{
n-=1;
}
ans++;
}
cout<<ans;
}




79.





80.
81.


82


#include<bits/stdc++.h> using namespace std; int main()
{
 
int t; cin>>t; while(t--)
{
int n,m; cin>>n>>m;
cout<<min(n,m)<<endl;
}

}




83.


84. Encode the Binary #include<iostream> using namespace std; void encode(){
int n; cin >> n;
string s,ans; cin >> s; for(int i=0;i<s.size();i+=2){
if(s[i]=='0' && s[i+1]=='0'){
ans += 'A';
}
else if(s[i]=='0' && s[i+1]=='1'){ ans += 'T';
}
else if(s[i]=='1' && s[i+1]=='0'){ ans += 'C';
}
 
else if(s[i]=='1' && s[i+1]=='1'){ ans += 'G';
}

}

cout << ans << "\n";
}


int main(){
int t; cin >> t; while(t--){
encode();

}
}


or

#include<bits/stdc++.h> using namespace std; int main()
{
int t; cin>>t; while(t--)
{
int n; cin>>n; string s; cin>>s;
string ans=""; string temp="";
 
for(int i=0;i<n;i++)
{
temp=temp+s[i]; if(temp.size()==2)
{
if(temp=="00")
{
ans=ans+'A';
}
else if(temp=="01")
{

ans=ans+'T';
}

else if(temp=="10")
{
ans=ans+'C';
}
else if(temp=="11")

{
ans=ans+'G';

}
temp="";

}

}
cout<<ans<<endl;

}

}
 
85.
#include<bits/stdc++.h> using namespace std; int main()
{
float a,b,c; cin>>a>>b>>c;
cout<<fixed<<setprecision(4)<<(a+b)*0.5*c;

}




86.
#include<bits/stdc++.h> using namespace std; int main()
{
int n,m; cin>>n>>m; int c=0;
for(int i=n;i<=m;i++)
{
if(i%3==0)
{
c++;
}
}
cout<<c;
}
 
87)
{
***************************


88.
********************* if(h%i==0)



{
ans+=i;

}

}
cout<<as;

}




89.*******************************************************************************
90.
#Include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; if(n%2==1)
{
cout<<"weird";
}
 
else
{
if(n>=2 && n<=5)
{

cout<<"not weird";
}

else if(n>=6 && n<=20)
{
cout<<"weird";
}
else if(n>20)

{
cout<<"not weird";

}

}

}


91.
#include<bits/stdc++.h> using namespace std; int main()
{
char ch; cin>>ch;
if(int(ch)>=65 && int(ch)<=90)
{
cout<<"uppercase alphabet";
}
else if(int(ch)>=97 && int(ch)<=122)
 
{

cout<<"lowercase alphabet";

}
else{

cout<<"not an alphabet";
}

}




92.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b; cout<<0.5*a*b;
}


93.


94.
#include<bits/stdc++.h> using namespace std; int main()
{
int a; cin>>a;
int h=a%100;
 
if(h>9)
{
cout<<h;
}
else
{
cout<<'0'<<h;
}

}


95.
#include<bits/stdc++.h> using namespace std; int main()
{
int n,m,k; cin>>n>>m>>k; if(n>m*k)
{
cout<<"NO";

}
else
{
cout<<"YES";
}

}


96.
#include<bits/stdc++.h>
 
using namespace std; int main()
{
int n; cin>>n; if(n%5!=0)
{
cout<<"-1";
}
else
{
int h=n/10; int k=n%10;
cout<<h+(k/5);
}
}


97.
********************************************************************************* 98.*
Int t n,k,m; cin>>n>>k>>m; int h=m*k;
int s=n/h; Int t=n%h; if(t==0)
{
cout<<s;
}
 
else
{
cout<<s+1;
}

}




99.
#include<bits/stdc++.h> using namespace std; int main()
{
int a; cin>>a; int h=a/4;
int k=a%4; if(k==0)
{

cout<<h;
}

else
{
cout<<h+1;
}

}


100.
#include<bits/stdc++.h> using namespace std;
 
int main()
{
int x,a,b; cin>>x>>a>>b;
cout<<(x*3)-(a+b);
}


101
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b,c; cin>>a>>b>>c;
int num=min(a,min(b,c)); cout<<(a+b+c)-num<<endl;
}




102.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; if(n%3==0)
{
cout<<"NORMAL";
 
}
else if(n%3==2)
{
cout<<"SMALL";
}
else{
cout<<"HUGE";
}

} 103
#include<bits/stdc++.h> using namespace std; int main()
{
int N; cin>>N;
double cost_per_unit = 0.0; double surcharge = 0.0;
if (N <= 199) {
cost_per_unit = 1.20;
}
else if (N < 400)
{
cost_per_unit = 1.40;
}
else if (N < 600)
{
cost_per_unit = 1.60;
}
 
else if (N < 800)
{
cost_per_unit = 1.80;
}
else
{
cost_per_unit = 2.00;
}
double bill = N * cost_per_unit; if (bill > 400)
{

surcharge = 0.15 * bill;
}

double total_amount = bill + surcharge; cout << fixed << setprecision(2);
cout << "Units Consumed: " << N << endl;
cout << "Cost per Unit: " << cost_per_unit << endl; cout << "Bill: " << bill << endl;
cout << "Surcharge: " << surcharge << endl;
cout << "Total Amount: " << total_amount << endl;

}








104.
#include<bits/stdc++.h> using namespace std;
 
int main()
{
float x,y; cin>>x>>y; float k=(x+y)/2;
cout<<fixed<<setprecision(2)<<"Average of "<<(int)x<<" and "<<(int)y<<" is: "<<k;
}


105.
#include<bits/stdc++.h> using namespace std; int main()
{
int t,s,b; cin>>t>>s>>b; cout<<t*s*b<<" KB";
}




106.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b;
for(int i=a+1;i<b;i++)
{
cout<<i<<" "<<(i*i)<<" "<<i*i*i<<endl;
 
}

}




107.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
cout<<fixed<<setprecision(2)<<2.54*n;
}


108.
#include<bits/stdc++.h> using namespace std; bool prime(int n)
{
if(n<=1)
{
return false;
}
for(int i=2;i<=sqrt(n);i++)
{
if(n%i==0)
{
return false;
}
 
}
return true;

}
int main()

{
int n; cin>>n; if(prime(n))
{
cout<<"Prime";
}
else
{
cout<<"Not Prime";
}

}


109.
#include<bits/stdc++.h> using namespace std; bool prime(int n)
{
if(n<=1)
{
return false;
}
for(int i=2;i<=sqrt(n);i++)
{
if(n%i==0)
 
{

return false;

}

}




110.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b; float sum=0;
for(int i=a;i<=b;i++)
{
sum=sum+sqrt(i);
}

cout<<fixed<<setprecision(2)<<sum;
}




111.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b,x,y; cin>>a>>b>>x>>y;
 
int sum=0;
for(int i=a;i<=b;i++)
{
if(i%x==0 && i%y!=0)

{
sum=sum+i;

}

}
cout<<sum;

}


112.Print Squares of Inputs until reach the -1


#include<iostream> using namespace std; int main(){
while(1){
int n; cin >> n;
if(n!=-1) cout<<n*n<<"\n"; else break;
}
}


113.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b;
 
cin>>a>>b;
for(int i=a;i<=b;i++)
{
cout<<i<<" ";

}
}


114.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
for(int i=1;i<=12;i++)
{
cout<<n<<" x "<<i<<" = "<<n*i<<endl;
}

} 115.
#include<bits/stdc++.h> using namespace std; int main()
{
int n,r; cin>>n>>r;
for(int i=1;i<=r;i++)
{
cout<<n<<" x "<<i<<" = "<<n*i<<endl;
 
}

}


116.
#include<bits/stdc++.h> using namespace std; int main()
{
int n,a,b; cin>>n>>a>>b; for(int i=a;i<=b;i++)
{
cout<<n<<" x "<<i<<" = "<<n*i<<endl;

}

}


117.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+(i*i);
}
int yog=(n*(n+1)/2);
 
int dif=abs(sum-(yog*yog)); cout<<dif;
}


118.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b;
for(int i=a;i<=b;i++)
{
if(i%2==0)
{
cout<<i<<" ";
}
}
} 119.
#include<iostream> using namespace std; int main(){
int   n; cin>>n; cin.ignore(); string s; getline(cin,s); string p;
 
for(int i=0;i<s.size();i++){ if(isalpha(s[i])){
p+=s[i];
}
}
cout<<p;

}
Or
} #include<iostream> using namespace std; int main(){
int n; cin>>n; char ch[n]; string s;
for(int i=0;i<n;i++){ cin >> ch[i]; if(ch[i] != ' '){
s += ch[i];

}
}

for(int i=0;i<n;i++){ cout << s[i];
}

} 120
121
#include<iostream> #include<bits/stdc++.h> using namespace std;
 
int main(){ string str; cin>>str;
int n=str.length(); int s=0; while(s<n)
{
if(str[s]!='0'){ break;
} s++;
}
int e=n-1; while(e>=s){
if(str[e]=='0'||str[e]=='2'||str[e]=='4'||str[e]=='6'||str[e]=='8'){ e--;
continue;
}else{

break;
}

}
string new_str=""; for(int i=s;i<=e;i++){
new_str+=str[i];
}
if(new_str.empty()){ cout<<"-1"<<endl;
}else cout<<new_str<<endl;
 
}
Or #include<bits/stdc++.h> using namespace std; int main()
{
string s; int ind=-1; cin>>s;
for(int i=s.size()-1;i>=0;i--)
{
if(s[i]!='0' && (s[i]-'0')%2!=0)
{
ind=i; break;
}
}
if(ind==-1) cout<<ind;

else cout<<s.substr(0,ind+1);
}


122
#include<bits/stdc++.h> using namespace std; int main(){
string str; cin>>str; string str2=str;
reverse(str.begin(),str.end());
 
if(str2==str){ cout<<"1"<<endl;
}else{
cout<<"0"<<endl;

}
}

123
#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
string str; cin>>str; string num=""; int sum=0;
for(int i=0;i<str.length();i++){ if(str[i]>='0'&&str[i]<='9'){
num+=str[i];
}else{
if(!num.empty()){
int num1=stoi(num); num=""; sum+=num1;
}
}
}
if(!num.empty()){
int num1=stoi(num); sum+=num1;
 
}
cout<<sum<<endl;

}


124
#include<bits/stdc++.h> using namespace std; bool prime(int n){
if(n<=1){ return false;
}
for(int i=2;i<=sqrt(n);i++){ if(n%i==0){
return false;
}
}
return true;
}
int main(){ int n; cin>>n;
int num1=n; int num2=n; while(1){
++num1; if(prime(num1)){
break;
}
}
 
while(1){
--num2; if(prime(num2)){
break;
}


}
cout<<min(abs(n-num1),abs(n-num2));


}


125. #include<bits/stdc++.h> using namespace std;
long octal(long n)
{
long ans=0;long c=0; while(n)
{
ans=ans+((n%10)*(pow(8,c))); c++;
n=n/10;
}
return ans;
}
int main()
{
long n; cin>>n;
cout<<octal(n);
 
}




126.
#include<bits/stdc++.h> using namespace std; int main()
{
long n; cin>>n; long sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
cout<<sum;
}




127.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b,c; cin>>a>>b>>c;
cout<<max(a,max(b,c));
}
 
128.
#include<bits/stdc++.h> using namespace std; int main()
{
float n,m; cin>>n>>m;
cout<<fixed<<setprecision(2)<<n+m<<endl; cout<<fixed<<setprecision(2)<<abs(n-m)<<endl; cout<<fixed<<setprecision(2)<<n*m<<endl; cout<<fixed<<setprecision(2)<<n/m<<endl;
}
Or #include<bits/stdc++.h> using namespace std; int main(){
float a,b; cin >> a >> b; printf("%.2f\n%.2f\n%.2f\n%.2f",a+b,abs(a-b),a*b,a/b);
}


129.
#include <iostream> using namespace std; int main()
{
int t; cin>>t; while(t--)
{
 
int r1,r2,r3; cin>>r1>>r2>>r3;
if(r1>r2+r3||r2>r1+r3||r3>r1+r2)
{

cout<<"YES"<<endl;
}

else
{
cout<<"NO"<<endl;
}

}

return 0;
}




130.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b; cout<<a*b;
}





131.
#include<bits/stdc++.h>
 
using namespace std; int sumi(int n)
{
int sum=0; while(n){
int r = n%10; sum+=r;
n = n/10;
}
return sum;
}
int main()
{
int n; cin>>n;
cout<<sumi(n);
}


132.
#include<bits/stdc++.h> using namespace std; int fact(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
sum++;
 
}

}
return sum;

}
int main()
{
int n; cin>>n;
cout<<fact(n);
} 133
#include<iostream> #include<bits/stdc++.h> using namespace std; int main(){
int n; cin>>n;
vector<int>v(n); for(int i=0;i<n;i++){
cin>>v[i];
}
sort(v.begin(),v.end()); int sum=0;
for(int i=0;i<n;i+=2){ sum+=v[i];
}
cout<<sum<<endl;
}
 
134.
#include<bits/stdc++.h> using namespace std; int main()
{
int t; cin>>t; while(t--)
{
int a,b; cin>>a>>b; if((2*a)<=b)
{
cout<<"YES"<<endl;
}
else if(a==b)
{
cout<<"YES"<<endl;
}
else
{
cout<<"NO"<<endl;
}
}

}




135.
#include<bits/stdc++.h>
 
using namespace std; int main()
{
int t; cin>>t; while(t--)
{
int x,y; cin>>x>>y; int m=x/y; int m1=x%y;
cout<<m+m1<<endl;


}
}




136.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
string s=to_string(n); for(int i=0;i<s.size();i++)
{
if(s[i]=='6')
{
 
s[i]='9';
break;

}

}

cout<<stoi(s);
}


137
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n; string str; cin>>str;
map<char,char>mpp; for(int i='a';i<='z';i++)
{
mpp[i]=i-32;
mpp[i-32]=i;

}
string ans=""; int i=0; while(i<n-1)
{
if(mpp[str[i]]==str[i+1]||(mpp[str[i+1]]==str[i]))
{
i+=2;
 
}
else
{
ans+=str[i];

i+=1;
}

}
if(i<n)
{
ans+=str[i];
}

cout<<ans;
}




138.
#include<bits/stdc++.h> using namespace std;
bool linear(int arr[],int n,int x)
{
for(int i=0;i<n;i++)
{
if(arr[i]==x)
{
return true;
}
}
return false;
}
 
int main()
{
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++)
{
cin>>arr[i];
}
int x; cin>>x;
if(linear(arr,n,x))
{
cout<<"Found";
}
else
{
cout<<"Not Found";

}
}


139.
#include<bits/stdc++.h> using namespace std;
bool linear(int arr[],int n,int x)
{
for(int i=0;i<n;i++)
{
if(arr[i]==x)
 
{

return true;

}

}

return false;
}

int main()
{
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++)
{
cin>>arr[i];
}
int x; cin>>x;
if(linear(arr,n,x))

{
cout<<"YES";

}
else
{
cout<<"NO";
}

}


140.
#include<bits/stdc++.h>
 
using namespace std; int main()
{
int t; cin>>t; while(t--)
{
int x; cin>>x; if(x>30)
{

cout<<"YES"<<endl;
}

else
{
cout<<"NO"<<endl;
}

}

}




141.
#include<bits/stdc++.h> using namespace std; int main()
{
int A,B,X,Y; cin>>A>>B>>X>>Y;
int w=A*Y;
 
int j=B*X; if(w>j)
{
cout<<"Jesse";
}
else if(w<j)
{
cout<<"Walter";
}
else{
cout<<"Both";

}
}




142.
#include<bits/stdc++.h> using namespace std; int main()
{
int h,m; cin>>h>>m;
cout<<(23-h)*60+(60-m);
}




143.
#include<bits/stdc++.h> using namespace std;
 
int main()
{
int a; cin>>a;
int m=a/5; if(a%5!=0){ m++;
}
cout<<m;
}


144 . NUMBER PROBLEM
#include <iostream> #include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b; int ans=0; while(a!=b){
if(a<b){ if(a+10<=b){
a+=10;
ans++;
}else{
ans++; break;
}
 
}else{
if(a-10>=b){ a-=10;
ans++;
}else{
ans++; break;
}
}

}
cout<<ans<<endl;

return 0;
}


Or


144.
#include<bits/stdc++.h> using namespace std; int main(){
int a,b; cin>>a>>b;
int d=abs(a-b); int m=d/10; if(d%10!=0){
m++;
}
cout<<m;
}
 





145.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b; if(a%b==0)
{
cout<<'0';

}
else{
cout<<b-(a%b);
}

}




146.
#include<bits/stdc++.h> using namespace std; int main()
{
int n; cin>>n;
for(int i=0;i<n;i++)
{
 
for(int j=0;j<n;j++)
{
cout<<"*";
}

cout<<endl;
}

}


147.
#include<bits/stdc++.h> using namespace std; int main()
{
int a,b; cin>>a>>b; cout<<a+b;
}


148.
#include<bits/stdc++.h> using namespace std; int main(){
int n; cin>>n; int arr[n];
for(int i=0;i<n;i++){ cin>>arr[i];
}
int maxi=0;
 
int ele=-1;
for(int i=0;i<n;i++)
{
int c=0;
for(int j=i;j<n;j++)
{
if(arr[i]==arr[j])
{
c++;
}
if(c>maxi)

{
ele=arr[i]; maxi=c;
}

}

}
if(maxi>n/2){ cout<<ele;
}else{
cout<<-1;
}

}


149
#include<bits/stdc++.h> using namespace std; int main() {
int n;
 
cin>>n; int c=0; int m=n;
while(m!=0){ int r=m%10;
if(r!=0 && n%r==0){ c++;
}
m=m/10;
}
cout<<c;

return 0;
}


150.
#include<bits/stdc++.h> using namespace std; int main()
{
int t; cin>>t; while(t--)
{
int n; cin>>n;
cout<<n+1<<endl;
}


}


1 Count no. of vowels ,consonants ,digits and spaces
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    string s; 

    getline(cin,s); 

    int ws=0,d=0,v=0,c=0; 

    for(auto i:s) 

    { 

        if(i=='a'|| i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U') v++; 

        else if(isdigit(i)) d++; 

        else if(i==' ') ws++; 

        else c++; 

    } 

    cout<<"Vowels: "<<v<<"\n"; 

    cout<<"Consonants: "<<c<<"\n"; 

    cout<<"Digits: "<<d<<"\n"; 

    cout<<"White spaces: "<<ws; 

  

} 

2 Multiplication Table within a Range
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int t,r1,r2; 

    cin>>t>>r1>>r2; 

    for(int i=r1;i<=r2;i++) 

    { 

        cout<<t<<" x "<<i<<" = "<<t*i<<"\n"; 

    } 

} 

3 Camel case word count
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    string s; 

    int c=1; 

    cin>>s; 

    for(int i=1;i<s.size()-1;i++) 

    { 

        if(isupper(s[i])) c++; 

    } 

    cout<<c; 

} 

4 Can be Empty
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int t; 

    cin>>t; 

    while(t--) 

    { 

        string s; cin>>s; 

        int a=0,b=0,c=0; 

        for(auto i:s) 

        { 

            if(i=='A') a++; 

            else if(i=='B') b++; 

            else c++; 

        } 

        if(b==c+a) cout<<"YES\n"; 

        else cout<<"NO\n"; 

    } 

} 

5 Expression Evaluation
#include<iostream> 

using namespace std; 

int main(){ 

int t; cin >> t; 

while(t--){ 

long a,b,c; cin >> a >> b >> c; 

    		if(a+b==c||b+c==a||a+c==b){ 

    			cout << "YES\n"; 

} 

else cout << "NO\n"; 

} 

} 

6 Matrix Multiplication
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int r1,c1; cin >> r1 >> c1; 

    int a[r1][c1]; 

    for(int i=0;i<r1;i++){ 

        for(int j=0;j<c1;j++){ 

            cin >> a[i][j]; 

        } 

    } 

    int r2,c2;  

    cin >> r2 >> c2; 

    int b[r2][c2]; 

    for(int i=0;i<r2;i++) 

    { 

        for(int j=0;j<c2;j++) 

        { 

            cin >> b[i][j]; 

        } 

    } 

    int c[r1][c2]; 

    for(int i=0;i<r1;i++) 

    { 

        for(int j=0;j<c2;j++) 

        { 

            c[i][j]=0; 

            for(int k=0;k<c2;k++){ 

                c[i][j] += a[i][k]*b[k][j]; 

            } 

        } 

    } 

  

    for(int i=0;i<r1;i++){ 

        for(int j=0;j<c2;j++) 

        { 

            if(j==c2-1) 

            { 

                cout<<c[i][j]; 

            } 

            else 

                cout << c[i][j] <<" "; 

        } 

        cout<<"\n"; 

    } 

} 

7 Basic Programs 1
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int kg; cin>>kg; 

    printf("%.2f",kg*2.2); 

} 

8 Owner
#include<bits/stdc++.h> 

using namespace std; 

int maxSatisfied(int customers[],int grumpy[], int X,int n) { 

    int satisfied = 0; 

    int madeSatisfied = 0; 

    int windowSatisfied = 0; 

  

    for (int i = 0; i < n; ++i) { 

      if (grumpy[i] == 0) 

        satisfied += customers[i]; 

      else 

        windowSatisfied += customers[i]; 

      if (i >= X && grumpy[i - X] == 1) 

        windowSatisfied -= customers[i - X]; 

      madeSatisfied = max(madeSatisfied, windowSatisfied); 

    } 

  

    return satisfied + madeSatisfied; 

  } 

int main() 

{ 

    int n; 

    cin>>n; 

    int customers[n]; 

    int grumpy[n]; 

    for(int i=0;i<n;i++) 

    { 

        cin>>customers[i]; 

    } 

    for(int i=0;i<n;i++) 

    { 

        cin>>grumpy[i]; 

    } 

    int X; cin>>X; 

    cout<<maxSatisfied(customers,grumpy,X,n); 

} 

9 Sum Divisible by K
#include <bits/stdc++.h> 

using namespace std; 

  

int getLongestSubarray(int arr[], int x,int n) { 

    unordered_map<int,int>m; 

    int ans=0,sum=0; 

    m.insert({0,-1}); 

    for(int i=0;i<n;i++) 

    { 

        sum+=arr[i]; 

        int rem=sum%x; 

        if(rem<0) rem+=x; 

        if(m.find(rem)==m.end()) m.insert({rem,i}); 

        else ans=max(ans,i-m[rem]); 

    } 

    return ans; 

} 

  

int main() 

{ 

    int n; cin>>n; 

    int arr[n]; 

    for(int i=0;i<n;i++) 

    { 

        cin>>arr[i]; 

    } 

    int x; cin>>x; 

    cout<<getLongestSubarray(arr, x,n); 

} 

10 Find the Maximum
#include<bits/stdc++.h> 

using namespace std; 

void sliding_window(int arr[],vector<int>&v,int n,int x) 

{ 

    deque<int>d; 

    for(int i=0;i<x;i++) 

    { 

        while(!d.empty() && d.back()< arr[i]) 

        { 

            d.pop_back(); 

        } 

        d.push_back(arr[i]); 

    } 

    v.push_back(d.front()); 

    for(int i=x;i<n;i++) 

    { 

        if(d.front()==arr[i-x]) d.pop_front(); 

        while(!d.empty() && d.back()< arr[i]) 

        { 

            d.pop_back(); 

        } 

        d.push_back(arr[i]); 

        v.push_back(d.front()); 

    } 

} 

int main() 

{ 

    int n,x; 

    cin>>n>>x; 

    int arr[n]; 

    vector<int>v; 

    for(int i=0;i<n;i++) 

    { 

        cin>>arr[i]; 

    } 

    sliding_window(arr,v,n,x); 

    for(auto it:v) 

    { 

        cout<<it<<" "; 

    } 

} 

11 Find the Abundant Number or Not
import java.util.*; 

public class AbundantNumber{ 

    public static void main(String args[]){ 

        int n; 

        Scanner sc=new Scanner(System.in); 

        n=sc.nextInt(); 

        int sum=0; 

        for(int i=1;i<n;i++){ 

            if(n%i==0){ 

                sum=sum+i; 

            } 

        } 

        if(sum>n){ 

            System.out.print("True"); 

        } 

        else{ 

            System.out.print("False"); 

        } 

    } 

} 

12 Three Idiots

#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int t; cin>>t; 

    while(t--) 

    { 

        long a,b,c; cin>>a>>b>>c; 

        if(a+b==c||b+c==a||a+c==b) cout<<"YES\n"; 

        else cout<<"NO\n"; 

    } 

} 

13 Arrange The Cows
#include<bits/stdc++.h> 

using namespace std; 

  

bool can_we_place(int arr[],int mid,int k,int n) 

{ 

    int cntcow=1,lastcow=arr[0]; 

    for(int i=1;i<n;i++) 

    { 

        if(arr[i]-lastcow>=mid) 

        { 

            cntcow++; 

            lastcow=arr[i]; 

        } 

        if(cntcow>=k) return true; 

    } 

    return false; 

} 

  

int main() 

{ 

    int n,k; cin>>n>>k; 

    int arr[n]; 

    for(int i=0;i<n;i++) 

    { 

        cin>>arr[i]; 

    } 

    sort(arr,arr+n); 

    int low=1,high=arr[n-1]-arr[0]; 

    while(low<=high) 

    { 

        int mid=(low+high)/2; 

        if(can_we_place(arr,mid,k,n)==true) 

        { 

            low=mid+1; 

        } 

        else 

        { 

            high=mid-1; 

        } 

    } 

    cout<<high; 

}

14 Split Array Largest Sum 

#include <bits/stdc++.h> 

using namespace std; 

  

bool check(int mid, int array[], int n, int K) 

{ 

	int count = 0; 

	int sum = 0; 

	for (int i = 0; i < n; i++) { 

		if (array[i] > mid) 

			return false; 

		sum += array[i]; 

		if (sum > mid) { 

			count++; 

			sum = array[i]; 

		} 

	} 

	count++; 

	if (count <= K) 

		return true; 

	return false; 

} 

int solve(int array[], int n, int K) 

{ 

	int* max = max_element(array, array + n); 

	int start = *max; 

	int end = 0; 

  

	for (int i = 0; i < n; i++) { 

		end += array[i]; 

	} 

	int answer = 0; 

	while (start <= end) { 

		int mid = (start + end) / 2; 

		if (check(mid, array, n, K)) { 

			answer = mid; 

			end = mid - 1; 

		} 

		else { 

			start = mid + 1; 

		} 

	} 

  

	return answer; 

} 

int main() 

{ 

	int n,k; 

	cin>>n>>k; 

	int arr[n]; 

	for(int i=0;i<n;i++) 

	{ 

	    cin>>arr[i]; 

	} 

	cout << solve(arr, n, k); 

}  


15 First Element That Occur for K times

#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n,k; cin >> n >> k; 

    int a[n]; 

    unordered_map<int,int>mp; 

    for(int i=0;i<n;i++){ 

        cin >> a[i]; 

        mp[a[i]]++; 

        if(mp[a[i]] == k){ 

            cout << a[i]; 

            return 0; 

        } 

    } 

    cout << -1; 

} 

16 Max subarray With Sum Zero
#include <bits/stdc++.h> 

using namespace std; 

  

int maxLen(int arr[], int n) 

{ 

    unordered_map<int,int>m; 

    int sum=0; 

    int maxi=0; 

    for(int i=0;i<n;i++) 

    { 

        sum+=arr[i]; 

        if(sum==0) 

        { 

            maxi=i+1; 

        } 

        else 

        { 

            if(m.find(sum)!=m.end()) 

            { 

                maxi=max(maxi,i-m[sum]); 

            } 

            else 

            { 

                m[sum]=i; 

            } 

        } 

    } 

    return maxi; 

} 

int main() 

{ 

	int n; 

	cin>>n; 

	int arr[n]; 

	for(int i=0;i<n;i++) 

	{ 

	    cin>>arr[i]; 

	} 

	cout << maxLen(arr, n); 

} 

17 Max No of Edges
#include <bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int t; 

    cin >> t; 

    while (t--) 

    { 

        int n, k, l, h, ans; 

        cin >> n >> k >> l; 

        h = abs(n - k - l); 

        if (n < (k + l)) 

        { 

            k = k - h; 

            l = l - h; 

            ans = k * l; 

        } 

        else 

        { 

             

            ans = (k * (h + l)) + (h * l) + ((h * (h - 1)) / 2); 

        } 

        cout << ans << endl; 

    } 

    return 0; 

} 

18 String Equal
#include <bits/stdc++.h> 

using namespace std; 

  

bool closeStrings(string word1, string word2) { 

        if(word1.size()!=word2.size()){ 

            return false; 

        } 

        set<char>s1, s2; 

        vector<int>freq1(26,0), freq2(26,0); 

         

         

        for(int i=0; i<word1.size(); i++){ 

            s1.insert(word1[i]); 

            s2.insert(word2[i]); 

             

            freq1[word1[i]-'a']++; 

            freq2[word2[i]-'a']++; 

        } 

         

        sort(freq1.begin(), freq1.end()); 

        sort(freq2.begin(), freq2.end()); 

         

        if(s1==s2 && freq1==freq2) 

            return true; 

        else 

            return false; 

    } 

  

int main() { 

    string word1, word2; 

    cin >> word1 >> word2; 

  

    bool result = closeStrings(word1, word2); 

    cout << (result ? 1 : 0) << endl; 

  

    return 0; 

} 

19 Make Array Elements Unique

#include<bits/stdc++.h> 

using namespace std; 

int unique(int A[],int n) 

{ 

    sort(A,A+n); 

    int ops=0; 

    for (int i = 1; i < n; i++) { 

        if (A[i] <= A[i-1]) { 

            ops += A[i-1] - A[i] + 1; 

            A[i] = A[i-1] + 1; 

        } 

    } 

    return ops; 

} 

  

int main() 

{ 

    int n; 

    cin>>n; 

    int arr[n]; 

    for(int i=0;i<n;i++) 

    { 

        cin>>arr[i]; 

    } 

    cout<<unique(arr,n); 

} 

20 Palindrome Number
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    string s = to_string(n); 

    bool flag = 0; 

    for(int i=0;i<s.size()/2;i++){ 

        if(s[i]!=s[s.size()-i-1]){ 

            flag = 1; 

            break; 

        } 

    } 

    if(flag) cout << "NO"; 

    else cout << "YES"; 

} 

21 Sum of Middle Elements of Two Sorted Arrays
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int n; cin>>n; 

    int a1[n],a2[n]; 

    vector<int>v; 

    for(int i=0;i<n;i++) 

    { 

        cin>>a1[i]; 

        v.push_back(a1[i]); 

    } 

    for(int i=0;i<n;i++) 

    { 

        cin>>a2[i]; 

        v.push_back(a2[i]); 

    } 

    sort(v.begin(),v.end()); 

    cout<<v[n-1]+v[n]; 

} 

22 Two Sorted Arrays of Median
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int m,n; cin>>m>>n; 

    int a1[m],a2[n]; 

    vector<int>v; 

    for(int i=0;i<m;i++) 

    { 

        cin>>a1[i]; 

        v.push_back(a1[i]); 

    } 

    for(int i=0;i<n;i++) 

    { 

        cin>>a2[i]; 

        v.push_back(a2[i]); 

    } 

    sort(v.begin(),v.end()); 

    if((m+n)%2!=0) cout<<v[(m+n)/2]; 

    else cout<<(v[(m+n)/2-1]+v[(m+n)/2])/2.0; 

} 

23 String Happy
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    string s; cin >> s; 

    char k; cin >> k; 

    int n; cin >> n; 

    int cnt = 0; 

    for(auto i:s){ 

        if(i==k) cnt++; 

    } 

    if(cnt >= n) cout << 1; 

    else cout << 0; 

} 

24 Switches
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int n; cin>>n; 

    cout<<int(sqrt(n)); 

} 

25 String Finding
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    string s1,s2; 

    getline(cin,s1); 

    getline(cin,s2); 

    int maxi=0,i,k; 

    for(i=0,k=0;i<s1.size()&&k<s2.size();i++) 

    { 

        if(s1[i]==s2[k]) 

        { 

            k++; 

        } 

        else 

        { 

            k=0; 

        } 

    } 

    if(k==s2.size()) cout<<1; 

    else cout<<0; 

} 

26 Save Village
def find_closest_heights(heights): 

    n = len(heights) 

    stack = []  

    closest_heights = [0] * n 

    MOD = 1000000001 

  

    for i in range(n): 

        while stack and heights[i] > heights[stack[-1]]: 

            stack_top = stack.pop() 

            closest_heights[stack_top] = heights[i] 

        stack.append(i) 

  

    return sum(closest_heights) % MOD 

n=int(input()) 

heights = list(map(int,input().split()))[:n] 

result = find_closest_heights(heights) 

print(result) 

27 Building Jump
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int c=0;
        int max=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                c++;
                max=Math.max(max, c);
            }
            else{
                c=0;
            }
        }
        System.out.println(max);
    }
}




28 Towers

29 Prime Factor
#include<bits/stdc++.h> 

using namespace std; 

bool isPrime(int n) 

{ 

    for(int i=2;i*i<=n;i++) 

    { 

        if(n%i==0) return false; 

    } 

    return true; 

} 

  

int main() 

{ 

    int n,lar_prime; cin>>n; 

    for(int i=2;i<=n;i++) 

    { 

        if(isPrime(i) && n%i==0) 

        { 

            lar_prime=i; 

        } 

    } 

    cout<<lar_prime; 

} 

30 Chance of Planting Flower
def can_place_flowers(flowerbed, n):
    count = 0
    i = 0
    while i < len(flowerbed):
        if flowerbed[i] == 0:
            if i == 0 or flowerbed[i - 1] == 0:
                if i == len(flowerbed) - 1 or flowerbed[i + 1] == 0:
                    flowerbed[i] = 1
                    count += 1
        i += 1
    return count >= n

# Input
flowerbed = list(map(int, input().split()))
n = int(input())

# Check if it's possible to plant n new flowers
result = can_place_flowers(flowerbed, n)
if(result):
    print('true')
else:
    print('false')

31 Equilibrium Index of an Array
#include<bits/stdc++.h> 

using namespace std; 

int main() 

{ 

    int t; 

    cin>>t; 

    while(t--) 

    { 

        int n,lsum=0,rsum=0,tsum=0,flag=0; cin>>n; 

        int arr[n]; 

        for(int i=0;i<n;i++) 

        { 

            cin>>arr[i]; 

            tsum+=arr[i]; 

        } 

        for(int i=1;i<n;i++) 

        { 

            lsum+=arr[i-1]; 

            rsum=tsum-lsum-arr[i]; 

            if(lsum==rsum) 

            { 

                cout<<i<<endl; 

                flag=1; 

                break; 

            } 

        } 

        if(flag==0) cout<<-1; 

    } 

} 

 

32 Find the Element that Appears Once
n=int(input())
li=list(map(int, input().split()))
ans=-1
for i in li:
    if li.count(i)==1:
        ans=i
        break;
print(ans)

33 Discount on Candies
n=int(input())
li=list(map(int, input().split()))
li.sort()
ans=0
n=n-1
while n>=0:
    ans+=li[n]
    n=n-1
    if(n>=0):
        ans+=li[n]
    n=n-2
print(ans)

34 Disqualification of Member

#include<bits/stdc++.h> 

using namespace std; 

  

int lastRemaining(int n) { 

    bool left=true; 

    int head=1,step=1,remain=n; 

    while(remain>1) 

    { 

        if(left || remain&1) 

        { 

            head+=step; 

        } 

        step*=2; 

        remain/=2; 

        left=!left; 

    } 

    return head; 

} 

  

int main() 

{ 

    int n; cin>>n; 

    cout<<lastRemaining(n); 

} 

35 Set Kth Bit
import java.util.*;
public class EquilibriumIndex {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int k=sc.nextInt();
      int set=1<<k;
      System.out.println(n|set);
    }
}

36 Count Set Bits
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int m=sc.nextInt();
            int c=0;
            while(m!=0){
                if((m & 1)==1)
                    c++;
                m=m>>1;
            }
            System.out.println(c);
        }
    }
}

37 Color Soda

38 Check Prefix Match
def count_matching_prefixes(arr, s, k):
    count = 0
    s_prefix = s[:k] 

    for word in arr:
        if len(word) >= k and word[:k] == s_prefix:
            count += 1

    return count

n = int(input())
arr = input().split()
k = int(input())
s = input()

result = count_matching_prefixes(arr, s, k)
print(result)

39 Sequence Coloring

40 Maximum Profit Events

41 D Occurs Exactly K Times

42 Array Transformation

43 Form a Expression

44 Steps to Make Array Non-Decreasing
#include<bits/stdc++.h> 

using namespace std; 

int acha(int nums[],int n){ 

    stack<pair<int,int>>st; 

    int ans = -1; 

    for(int i=n-1;i>=0;i--){ 

        int cnt = 0; 

        while(!st.empty() && nums[i] > st.top().first){ 

            cnt = max(cnt+1,st.top().second); 

            st.pop(); 

        } 

        ans = max(ans,cnt); 

        st.push({nums[i],cnt}); 

    } 

    return ans; 

} 

  

int main(){ 

    int n; cin >> n; 

    int nums[n]; 

    for(int i=0;i<n;i++) cin >> nums[i]; 

    cout << acha(nums,n); 

} 

45 White Knight vs Black Knight

46 Investigation

47 Count Sorted Vowel Strings

48 Codemind Parentheses

49 Long Pressed Keys
def is_long_pressed_name(original, typed):
    i = 0  
    j = 0  

    while j < len(typed):
        if i < len(original) and original[i] == typed[j]:
            i += 1
            j += 1
        elif j == 0 or typed[j] != typed[j - 1]:
            return False
        else:
            j += 1

    return i == len(original)

# Input
original = input()
typed = input()
result = is_long_pressed_name(original, typed)
if(result):
    print('true')
else:
    print('false')


50 String Magic 2
def calculate_sum_from_string(s):
    total_sum = 0
    current_number = 0
    is_negative = False

    for char in s:
        if char.isdigit():
            current_number = current_number * 10 + int(char)
        elif char == '-' and current_number == 0:
            is_negative = True
        else:
            if is_negative:
                total_sum -= current_number
                is_negative = False
            else:
                total_sum += current_number
            current_number = 0

    if is_negative:
        total_sum -= current_number
    else:
        total_sum += current_number

    return total_sum


s = input()
result = calculate_sum_from_string(s)
print(result)

51 Reverse Words in a Given String
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    string s; getline(cin,s); 

    int n = s.size(); 

    vector<string>ss; 

    string tmp=""; 

    for(int i=0;i<n;i++){ 

        if(s[i]=='.'){ 

            ss.push_back(tmp); 

            tmp=""; 

        } 

        else tmp += s[i]; 

    } 

    if(!tmp.empty()) ss.push_back(tmp); 

    for(int i=ss.size()-1;i>=0;i--){ 

        if(i==0) cout << ss[i]; 

        else cout << ss[i] << "."; 

    } 

} 

52 Detecting Super Numbers
import math

def prime_factors(n):
    factors = []
    
    while n % 2 == 0:
        factors.append(2)
        n //= 2
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            factors.append(i)
            n //= i
    if n > 2:
        factors.append(n)
    
    return factors

def digit_sum(number):
    return sum(int(digit) for digit in str(number))

def is_super_number(n):
    factors = prime_factors(n)

    sum_digits = digit_sum(n)
    sum_factors_digits = sum(digit_sum(factor) for factor in factors)
    
    return sum_digits == sum_factors_digits

N = int(input())

result = is_super_number(N)
print(int(result))

53 Reverse Letters

54 Sorting an Array with Odd and Even Numbers
#include<bits/stdc++.h> 

#define pb push_back 

#define vi vector<int> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    int a[n]; 

    vi odd,even; 

    for(int i=0;i<n;i++){ 

        cin >> a[i]; 

    } 

    for(int i=0;i<n;i++){ 

        if(a[i]%2==0) even.pb(a[i]); 

        else odd.pb(a[i]); 

    } 

    int i=0,j=0; 

    while(i<even.size() && j<odd.size()){ 

        cout << even[i] << " "; 

        cout << odd[j] << " "; 

        i++,j++; 

    } 

} 

55 Almost Lucky
def is_lucky_number(n):
    while n > 0:
        digit = n % 10
        if digit != 4 and digit != 7:
            return False
        n //= 10
    return True

def count_lucky_digits(n):
    count = 0
    while n > 0:
        digit = n % 10
        if digit == 4 or digit == 7:
            count += 1
        n //= 10
    return count

def is_almost_lucky(n):
    lucky_count = count_lucky_digits(n)
    return is_lucky_number(lucky_count)

# Input
t = int(input())

for _ in range(t):
    n = int(input())
    if is_almost_lucky(n):
        print("YES")
    else:
        print("NO")

56 Vowel Substrings

57 Missing Number

58 Next Palindrome
#include<bits/stdc++.h> 

using namespace std; 

bool palindrome(int n){ 

    int t = n; 

    int rev = 0; 

    while(n){ 

        rev = rev*10 + n%10; 

        n /= 10; 

    } 

    return rev == t; 

} 

  

int main(){ 

    int n; cin >> n; 

    while(1){ 

        n++; 

        if(palindrome(n)){ 

            cout << n; break; 

        } 

    } 

} 

59 Minimum Number
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    int b = 9; 

    if(n<=9){ 

        cout << n; return 0; 

    } 

    vector<int>s; 

    while(n){ 

        s.push_back(min(n,b)); 

        n -= min(n,b); 

        b--; 

    } 

    for(int i=s.size()-1;i>=0;i--){ 

        cout<<s[i]; 

    } 

} 

60 Solve Equation
#include<iostream> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    if(n==0 || n>6) cout<<"YES"; 

    else cout << "NO"; 

} 

61 slide the bar
def containsNearbyDuplicate(nums, k):
    num_indices = {} 
    
    for i, num in enumerate(nums):
        if num in num_indices and i - num_indices[num] <= k:
            return "true"
        num_indices[num] = i  
    return "false"

N = int(input())
nums = list(map(int, input().split()))
k = int(input())
result = containsNearbyDuplicate(nums, k)
print(result)

62 Travell with minimum cost

63 Primes on Choice

64 Strong Prime
import java.util.*; 

public class Owl_Coder{ 

    public static boolean isPrime(int n){ 

       if(n==0 || n==1){ 

        return false; 

       } 

       for(int i=2;i<=Math.sqrt(n);i++){ 

        if(n%i==0){ 

            return false; 

        } 

       } 

       return true; 

    } 

    public static void main(String args[]){ 

        Scanner sc=new Scanner(System.in); 

        int n=sc.nextInt(); 

  

        int i=n-1,j=n+1; 

        int pp=0,np=0; 

        while(i!=0){ 

            if(isPrime(i)){ 

                pp=i; 

                break; 

            } 

            i--; 

        } 

        while(j<=n*n){ 

            if(isPrime(j)){ 

                np=j; 

                break; 

            } 

            j++; 

        } 

        if( isPrime(n) && n>((pp+np)/2)){ 

            System.out.println("YES"); 

        }else{ 

            System.out.println("NO"); 

        } 

    } 

} 

 

65 Twin Primes in a Range
import java.util.*; 

public class Owl_Coder{ 

    public static boolean isPrime(int n){ 

       if(n==0 || n==1){ 

        return false; 

       } 

       for(int i=2;i<=Math.sqrt(n);i++){ 

        if(n%i==0){ 

            return false; 

        } 

       } 

       return true; 

    } 

    public static void main(String args[]){ 

        Scanner sc=new Scanner(System.in); 

        int a=sc.nextInt(); 

        int b=sc.nextInt(); 

        ArrayList<Integer> li=new ArrayList<>(); 

        for(int i=a;i<=b;i++){ 

            if(isPrime(i)==true){ 

                li.add(i); 

            }            

        } 

        for(int i=0;i<li.size()-1;i++){ 

            int pre=li.get(i); 

            int nex=li.get(i+1); 

            if(Math.abs(nex-pre)==2){ 

                System.out.println(pre+" "+nex); 

            } 

        } 

    } 

} 

66 Uncommon Words
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    string s,s2;  

    getline(cin,s); 

    getline(cin,s2); 

  

    vector<string>vs; 

    unordered_map<string,int>mp; 

  

    string tempu = ""; 

    for(int i=0;i<s2.size();i++){ 

        if(s2[i]==' '){ 

            vs.push_back(tempu); 

            tempu=""; 

        } 

        tempu += s2[i]; 

    } 

    if(!tempu.empty()) vs.push_back(tempu); 

  

    string temp = ""; 

    for(int i=0;i<s.size();i++){ 

        if(s[i]==' '){ 

            vs.push_back(temp); 

            temp=""; 

        } 

        temp += s[i]; 

    } 

    if(!temp.empty()) vs.push_back(temp); 

  

    for(auto i:vs) mp[i]++; 

    for(int i=vs.size()-1;i>=0;i--){ 

        if(mp[vs[i]] == 1){ 

            cout << vs[i]; 

        } 

    } 

} 

67 Distinct Elements in Two Arrays
def find_distinct_elements(arr1, arr2):
    # Convert the arrays to sets to find distinct elements
    set1 = set(arr1)
    set2 = set(arr2)
    
    # Find elements in Arr1 that are not in Arr2
    ans1 = sorted(list(set1 - set2))
    
    # Find elements in Arr2 that are not in Arr1
    ans2 = sorted(list(set2 - set1))
    
    return ans1, ans2

# Input
N = int(input())
Arr1 = list(map(int, input().split()))
Arr2 = list(map(int, input().split()))

# Find distinct elements in each array
Ans1, Ans2 = find_distinct_elements(Arr1, Arr2)

# Output
print(" ".join(map(str, Ans1)))
print(" ".join(map(str, Ans2)))

68 Substrings of Size Three
s = input()
count = 0
n = len(s)
for i in range(n - 2):
    if len(set(s[i:i+3])) == 3:
        count += 1
print(count)


69 Distance Between Letters

70 Kth Prime Factor
import java.util.*;
import java.math.*;

public class GFG{

	static int kPrimeFactor(int n, int k)
	{
		
		while (n % 2 == 0)
		{
			k--;
			n = n / 2;
			if (k == 0)
			return 2;
		}
	
		for (int i = 3; i <= Math.sqrt(n); i = i + 2)
		{
			
			while (n % i == 0)
			{
				if (k == 1)
				return i;
	
				k--;
				n = n / i;
			}
		}
	
		if (n > 2 && k == 1)
			return n;
	
		return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int n = sc.nextInt(); 
        int k = sc.nextInt();
		System.out.println(kPrimeFactor(n, k));
	}
}


71 Building a Prime Number Printer
#include<bits/stdc++.h> 

#define ps(n) cout << n << " "; 

using namespace std; 

  

bool prime(int n){ 

    if(n==1) return 0; 

    for(int i=2;i*i<=n;i++){ 

        if(n%i==0) return false; 

    }  

    return true; 

} 

  

int main(){ 

    int n; cin >> n; 

    for(int i=1;i<=n;i++){ 

        if(prime(i)) ps(i); 

    } 

} 

72 Strike Long

73 Collatz Sequence 1
#include<bits/stdc++.h> 

#define pb push_back 

#define vi vector<int> 

#define le(n) cin >> n; 

#define de(n) cout << n << " "; 

 

using namespace std; 

int main(){ 

    int n; le(n); 

    if(n==1){ 

        de(1); return 0; 

    } 

    vi v; 

    v.pb(n); 

    while(n!=1){ 

        if(n&1) n=3*n+1; 

        else n/=2; 

        v.pb(n); 

    } 

    for(auto i:v) de(i); 

} 

 

74 Check Validity
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            boolean ans = true;
            
            for (char ch : s.toCharArray()) {
                if (ch == '(') st.push(')');
                else if (ch == '{') st.push('}');
                else if (ch == '[') st.push(']');
                else {
                    if (st.isEmpty() || ch != st.pop()) {
                        ans = false;
                        break;
                    }
                }
            }
            
            if (ans && st.isEmpty()) System.out.println("True");
            else System.out.println("False");
        }
    }
}

75 Greatest Common Divisor

76 Solve The Equation
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int t; cin >> t; 

    while(t--){ 

        int a; cin >> a; 

        a--; 

        cout << (int)sqrt(a) << "\n"; 

    } 

} 

77 Subarrays with Target Sum
import java.util.ArrayList;
import java.util.*;

public class SubarraysWithTargetSum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];

       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int c=0;
       int k=sc.nextInt();
       for(int i=0;i<n;i++){
        int sum=0;
        
        for(int j=i;j<n;j++){
            sum+=arr[j];
            if(sum==k){
                c++;
            }
        }
       }
       System.out.println(c);
    }
}


78 Reverse words

79 Array Fitting
#include<bits/stdc++.h> 

#define loop for(int i=0;i<n;i++) 

#define le(n) cin >> n; 

#define de(n) cout << n; 

using namespace std; 

int main(){ 

    int n; le(n); 

    int a[n],b[n]; 

  

    loop le(a[i]); 

    loop le(b[i]); 

  

    sort(a,a+n); sort(b,b+n); 

    loop{ 

        if(a[i] > b[i]){ 

            de("NO"); return 0; 

        } 

    } 

    de("YES"); 

} 

 

80 String Game

81 Palindrome Number Checker
#include<bits/stdc++.h> 

using namespace std; 

  

bool palin(int n){ 

    int t = n; 

    int rev = 0; 

    while(n){ 

        rev=rev*10 + (n%10); 

        n /= 10; 

    } 

    return rev == t; 

} 

  

int main(){ 

    int n; cin >> n; 

    if(palin(n)) cout << "Palindrome"; 

    else cout << "Not Palindrome"; 

} 

82 Find the Beauty

83 Reverse Digits of an Integer

84 Gross Salary
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    long n; cin >> n; 

    float da,hra; 

    if(n<=10000){ 

        da = 0.8*n; hra = 0.2*n; 

    } 

    else if(n<=20000){ 

        da = 0.9*n; hra = 0.25*n; 

    } 

    else{ 

        da = 0.95*n; hra = 0.3*n; 

    } 

    float gs = n + da + hra; 

    printf("%.2f",gs); 

} 

85 Find Winner

86 Minimum Size Subarray Sum

87 Online Shopping Cart
#include<bits/stdc++.h> 

using namespace std; 

int equi(int a[],int n){ 

    int leftsum = 0, summ = 0; 

    for(int i=0;i<n;i++) summ += a[i]; 

    for(int i=0;i<n;i++){ 

        summ -= a[i]; 

        if(leftsum == summ) return i; 

        leftsum += a[i]; 

    } 

    return -1; 

} 

  

int main(){ 

    int t; cin >> t; 

    while(t--){ 

        int n; cin >> n; 

        int a[n]; 

        for(int i=0;i<n;i++) cin >> a[i]; 

        cout << equi(a,n) << "\n"; 

    } 

} 

88 Triangle

import java.util.*; 

public class Owl_Coder{ 

    public static void main(String args[]){ 

        Scanner sc=new Scanner(System.in); 

        int a=sc.nextInt(); 

        int b=sc.nextInt(); 

        int c=sc.nextInt(); 

        if(a==b && b==c && a==c){ 

            System.out.println("Equilateral triangle"); 

        }else if(a==b || b==c || a==c){ 

            System.out.println("Isosceles triangle"); 

        }else{ 

            System.out.println("Scalene triangle"); 

        } 

    } 

} 

89) Current Bill 

import java.util.Scanner; 

public class ElectricityBill{ 

    public static void main(String args[]){ 

        Scanner sc=new Scanner(System.in); 

        int units=sc.nextInt(); 

        double b,uc=0,tb; 

        if(units<200) 

        { 

            uc=1.20; 

        } 

        else if(units>=200 && units<400) 

        { 

            uc=1.50; 

        } 

         else if(units>=400 && units<600) 

        { 

            uc=1.80; 

        } 

         else if(units>=600) 

        { 

            uc=2.00; 

        } 

        b=units*uc; 

        if(b>=400) 

        { 

            tb=b+(b*0.15); 

            System.out.format("%.2f",tb); 

        } 

        else 

        { 

            tb=b+100; 

            System.out.format("%.2f",tb); 

        } 

    } 

} 

90) Equilibrium Point 

#include<bits/stdc++.h> 

using namespace std; 

int equi(int a[],int n){ 

    int leftsum = 0, summ = 0; 

    for(int i=0;i<n;i++) summ += a[i]; 

    for(int i=0;i<n;i++){ 

        summ -= a[i]; 

        if(leftsum == summ) return i+1; 

        leftsum += a[i]; 

    } 

    return -1; 

} 

  

int main(){ 

    int n; cin >> n; 

    int a[n]; 

    for(int i=0;i<n;i++) cin >> a[i]; 

    cout << equi(a,n) << "\n"; 

} 

91 Three Sum

92 Find The Number
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    int a[n]; 

    int maxi = 810277954; 

    for(int i=0;i<n;i++){ 

        cin >> a[i]; 

        maxi = min(maxi,a[i]); 

    } 

    cout << maxi; 

} 

93 Row with max 1s
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of rows and columns
        int[][] grid = new int[n][n]; // Initialize the grid
        
        // Input the grid values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        int maxOnes = 0;
        int maxRowIndex = -1;
        
        for (int i = 0; i < n; i++) {
            int onesCount = 0;
            for (int j = 0; j < n; j++) {
                onesCount += grid[i][j];
            }
            
            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                maxRowIndex = i;
            }
        }
        
        System.out.println(maxRowIndex); 
    }
}



94 Climbing Stairs

95 Series of Different Sequences

96 Search in a Matrix
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    int m; cin >> m; 

    int mat[n][m]; 

    for(int i=0;i<n;i++){ 

        for(int j=0;j<m;j++){ 

            cin >> mat[i][j]; 

        } 

    } 

    int k; cin >> k; 

    for(int i=0;i<n;i++){ 

        for(int j=0;j<m;j++){ 

            if(mat[i][j] == k){ 

                cout << 1; return 0; 

            } 

        } 

    } 

    cout << 0; 

} 

97 Count 2X2 Squares
n = int(input())  

n-=2  

n=n//2  

print(n*(n+1)//2) 

98 Palin Array
#include<bits/stdc++.h> 

using namespace std; 

bool palin(int n){ 

    int t = n; 

    int rev = 0; 

    while(n){ 

        rev=rev*10 + (n%10); 

        n /= 10; 

    } 

    return rev == t; 

} 

  

int main(){ 

    int n; cin >> n; 

    int a[n]; 

    for(int i=0;i<n;i++){ 

        cin >> a[i]; 

        if(!palin(a[i])){ 

            cout << 0; return 0; 

        } 

    } 

    cout << 1; 

} 

99 Miss And Repeat
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n; cin >> n; 

    int a[n]; 

    unordered_map<int,int>mp; 

    for(int i=0;i<n;i++){ 

        cin >> a[i]; 

        mp[a[i]]++; 

    } 

    int ac,ha; 

    for(int i=1;i<=n;i++){ 

        if(mp[i] == 2) ac = i; 

        if(mp[i] == 0) ha = i; 

    } 

    cout << ac << " " << ha; 

} 

100 Whiteboards

101 Union Of Two Sorted Arrays
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n,m,t; 

    cin>>n>>m; 

    set<int>s; 

    for(int i=0;i<n;i++)cin>>t,s.insert(t); 

    for(int i=0;i<m;i++)cin>>t,s.insert(t); 

    for(auto &it:s)cout<<it<<" "; 

} 

102 Online Inventory Management System
#include<bits/stdc++.h> 

#define f(i,n,t) for(int i=t;i<n;i++) 

using namespace std; 

int main(){ 

    int n,m; 

    cin>>n>>m; 

    vector<float>a(n); 

    f(i,n,0){ 

        cin>>a[i]; 

    } 

    unordered_map<float,int>mp; 

    f(i,n,0){ 

        mp[a[i]]++; 

        float p=m/a[i]; 

        if(mp.find(p)!=mp.end()){ 

            cout<<"1"; 

            return 0; 

        } 

    } 

    cout<<"-1"; 

} 

103 Move all Zeroes to End of Array
#include<bits/stdc++.h> 

#define f(i,n,t) for(int i=t;i<n;i++) 

using namespace std; 

int main(){ 

    int n,m=0; 

    cin>>n; 

    vector<int>a(n,0); 

    int p,t=0; 

    f(i,n,0){ 

        cin>>p; 

        if(p!=0){ 

            a[t]=p; 

            t++; 

        } 

    } 

    f(i,n,0)cout<<a[i]<<" "; 

} 

 

104 Sum of Divisors
#include<bits/stdc++.h> 

#define f(i,n,t) for(int i=t;i<n;i++) 

  

using namespace std; 

int help(int a){ 

    int c=0; 

    for(int i=1;i<sqrt(a);i++){ 

        if(a%i==0){ 

            c+=i; 

            c+=(a/i); 

        } 

    } 

    int t=sqrt(a); 

    if(t*t==a)c+=t; 

    return c; 

} 

int main(){ 

    int n,m=0; 

    cin>>n; 

    long long ans=0; 

    f(i,n+1,1)ans+=help(i); 

    cout<<ans; 

} 

105 Remove Duplicates from Sorted Array
#include<bits/stdc++.h> 

#define f(i,n,t) for(int i=t;i<n;i++) 

using namespace std; 

int main(){ 

    int n,m=0; 

    cin>>n; 

    set<int>s; 

    f(i,n+1,1)cin>>m,s.insert(m); 

    for(auto &it:s)cout<<it<<" "; 

} 

106 Math Teacher's Dilemma
#include<bits/stdc++.h> 

#define f(i,n,t) for(int i=t;i<n;i++) 

using namespace std; 

int main(){ 

    int a,b; 

    cin>>a>>b; 

    cout<<(a*b)/__gcd(a,b)<<" "<<__gcd(a,b); 

} 

107 Reverse Bits
a=int(input()) 

t=bin(a)[2:] 

t=t[::-1] 

p=len(t) 

for i in range(p,32): 

    t+="0" 

print(eval('0b'+t)) 

108 Reverse Order of Words
#include<bits/stdc++.h>  

using namespace std;  

int main()  

{  

    string s,ans="",t=""; 

    getline(cin,s);  

    for(auto &it:s){ 

        if(it==' '){ 

            ans=t+" "+ans; 

            t=""; 

        } 

        else t+=it; 

    } 

    if(t.size()>0)ans=t+" "+ans; 

    cout<<ans; 

  

} 

109 Pattern 6
#include<bits/stdc++.h>  

using namespace std;  

int main()  

{  

    int n; 

    cin>>n; 

    for(int i=0;i<n;i++){ 

        for(int j=0;j<=i;j++){ 

            cout<<char('A'+j); 

        } 

        cout<<"\n"; 

    } 

  

} 

110 Bike Booking

111 Pattern 7
#include<bits/stdc++.h>   

  

using namespace std;   

  

int main()   

  

{   

  

    int n;  

  

    cin>>n;  

  

    for(int i=0;i<n;i++){  

  

        for(int j=0;j<=i;j++){  

  

            cout<<char('A'+i);  

  

        }  

  

        cout<<"\n";  

  

    }  

  

   

  

} 

112 Make Even Sum
#include<bits/stdc++.h>   

using namespace std;   

int main()   

{   

    int n;  

    cin>>n;  

    vector<int>a(n); 

    int o=0,e=0; 

    for(int i=0;i<n;i++){cin>>a[i]; 

        if(a[i]&1)o++; 

        else e++; 

    } 

    if(o&1)cout<<0; 

    else cout<<1; 

} 

113 Cyclic Rotation

114 Duplicate Character
#include<bits/stdc++.h>   

using namespace std;   

int main()   

{   

    string s; 

    cin>>s; 

    vector<int>a(26,0); 

    for(auto &it:s)a[it-'a']++; 

   for(int i=0;i<26;i++){ 

    if(a[i]>1){ 

        cout<<char(i+'a')<<"-"<<a[i]<<" "; 

    } 

   } 

} 

115 Pattern 8
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n; 

    cin>>n; 

    for(int i=0;i<n;i++){ 

        for(int j=0;j<n;j++){ 

            if(i==0||j==0||j==n-1||i==n-1)cout<<"*"; 

            else cout<<" "; 

        } 

        cout<<"\n"; 

    } 

} 

 

116 First Duplicate
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    int n,m; 

    cin>>n; 

    map<int,int>mp; 

    for(int i=0;i<n;i++){ 

        cin>>m; 

        mp[m]++; 

        if(mp[m]>1){ 

            cout<<m; 

            return 0; 

        } 

    } 

    cout<<"-1"; 

} 

117 Strong Element

118 Three Divisors

119 Abacus III

120 Word Game
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String s = scanner.nextLine();
        int p = scanner.nextInt();

        // Call the function
        divideString(s, p);
    }

    // Function to divide a string into P equal parts
    public static void divideString(String s, int p) {
        int length = s.length();
        if (length % p != 0) {
            System.out.println("Invalid String");
        } else {
            int partSize = length / p;
            for (int i = 0; i < length; i += partSize) {
                String part = s.substring(i, i + partSize);
                System.out.print(part+" ");
            }
        }
    }
}

121 String Decode
s=input()
s1=set(s)
if 2*len(s1)>len(s):
    print("No")
else:
    print("Yes")



122 Product-1
def product_combinations(N):
    count = 0
    for a in range(1, N):
        if N % a == 0:
            b = N // a
            if b > a:
                count += 1
    return count
    
N = int(input())
result = product_combinations(N)
print(result)

123 Sequence Series
n=int(input())
li=list(map(int, input().split()))
a=2
c=0
b=1
for i in range(2, n):
    temp=a+b
    if(li[i]!=temp):
        c +=1
    a=b
    b=temp
print(c)


124 No Repeated Digit Number Count

125 Missing Characters
#include<bits/stdc++.h> 

using namespace std; 

int main(){ 

    unordered_map<char,int>mp; 

    string s; getline(cin,s); 

    for(auto i:s){ 

       mp[tolower(i)]++; 

    } 

    string ans=""; 

    string ss ="qwertyuiopalskdjfhgzmxncbv"; 

    for(auto i:ss){ 

        if(mp.count(i)==0){ 

            ans += i; 

        } 

    } 

    if(ans.empty()) {cout<<0; return 0;} 

    sort(ans.begin(),ans.end()); 

    cout<<ans; 

} 

126 Abacus II

127 Right Rotate an Array `k` Times
def right_rotate_array(arr, k):
    n = len(arr)
    k = k % n
    rotated_arr = arr[-k:] + arr[:-k]
    
    return rotated_arr
n, k = map(int, input().split())
array = list(map(int, input().split()))
rotated_array = right_rotate_array(array, k)
for num in rotated_array:
    print(num, end=" ")

128 Adjust The Join Date

129 Lost Bishop

130 Binary Search-1

131 Minimum Digit Elements
n=int(input())
li=list(map(int, input().split()))
ans=1000
for i in li:
    if(len(str(i))<ans):
        ans=len(str(i))
count = 0
for num in li:
    if len(str(num)) == ans:
        count += 1
print(count)

132 Greatest Among Smaller on Left

133 Find the K Digit Length Numbers in a Array

134 First Unique Character
s=input()
ans='-1'
for i in s:
    if s.count(i)==1:
        ans=i
        break
print(ans)

135 Search in 2D Matrix

136 Small and Large Elements Appearences

137 Search Negative in Grid

138 Binary Search

139 Power Operation Using Recursion

140 Power of a Number

141 String Reverse Using Recursion
#include<bits/stdc++.h> 

using namespace std; 

  

void reverse(string &s,int st,int ed) 

{ 

    if(st>=ed || ed==0) 

    { 

        return; 

    } 

    swap(s[st],s[ed]); 

    reverse(s,st+1,ed-1); 

} 

  

int main() 

{ 

    string s; 

    getline(cin,s); 

    int st=0,ed=s.size()-1; 

    reverse(s,st,ed); 

    cout<<s; 

} 

142 Sorting the Array

n = int(input()) 

a = list(map(int, input().split())) 

start = 0 

while start < n - 1 and a[start] < a[start + 1]: 

    start += 1 

if start == n - 1: 

    print("yes") 

    print("1 1") 

    exit() 

end=n-1 

while end > 0 and a[end] > a[end - 1]: 

    end -= 1 

reversed_segment = a[start:end + 1][::-1] 

  

if a[:start] + reversed_segment + a[end + 1:] == sorted(a): 

    print("yes") 

    print(start + 1, end + 1) 

else: 

    print("no") 

143 Handshakes Problem

144 Distinct Prime Factors
#include<bits/stdc++.h> 

using namespace std; 

int primes[20] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71}; 

int main(){ 

    long long  n,m,t=1; 

    cin>>n; 

    while(n--){ 

        cin>>m; 

        t=1ll; 

        int i=0; 

        for(i=0;i<20;i++){ 

            if(t*primes[i]>m)break; 

            t*=primes[i]; 

        } 

        cout<<i<<"\n"; 

    } 

} 

145 Number of Pairs Equals to Given Target String
n=int(input())
li=list(map(str, input().split()))
tar=input()
c=0
for i in li:
    for j in li:
        if(i+j==tar):
            c +=1
print(c)


146 Count Words
import re 

def count_words(input_string): 

    pattern = r'\b[aeiouAEIOU][a-zA-Z]*[^aeiouAEIOU\s\d]\b' 

    matches = re.findall(pattern, input_string) 

    return len(matches) 

  

input_string = input().strip() 

  

count = count_words(input_string) 

print(count) 

147 Print the Numbers from N to 1

148 Immediate Smaller Element
import java.util.*; 

public class Owl_Coder{ 

    public static void main(String args[]){ 

        Scanner sc=new Scanner(System.in); 

        int n=sc.nextInt(); 

        int a[]=new int[n]; 

        ArrayList<Integer> li=new ArrayList<>(); 

        for(int i=0;i<n;i++){ 

            a[i]=sc.nextInt(); 

        } 

        for(int i=0;i<n-1;i++){ 

            if(a[i]>a[i+1]){ 

                li.add(a[i+1]); 

            }else{ 

                li.add(-1); 

            } 

        } 

        li.add(-1); 

        for(int i=0;i<li.size();i++){ 

            System.out.print(li.get(i)+" "); 

        } 
    } 

} 

149 Delete Middle Element Of Stack
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(n%2==0 && i==n/2-1)continue;
            if(n%2!=0 && i==n/2)continue;
            System.out.print(arr[i]+" ");
        }
        

    }
}

150 Reversing The Equation-1


1 Subarrays With Sum Having Zero
#include <bits/stdc++.h>
using namespace std;
int subarrayZeroSum(vector<int>& arr) {
 unordered_map<int, int> sumFreq;
 int Sum = 0;
 int count = 0;
 for (int i = 0; i < arr.size(); i++) {
 Sum += arr[i];
 if (Sum == 0) {
 count++;
 }
 if (sumFreq.find(Sum) != sumFreq.end()) {
 count += sumFreq[Sum];
 }
 sumFreq[Sum]++;
 }
 return count;
}
int main() {
 int N;
 cin >> N;
 vector<int> arr(N);
 for (int i = 0; i < N; i++) {
 cin >> arr[i];
 }
 int result = subarrayZeroSum(arr);
 cout << result << endl;
}

2 Sort the Words Based on Length

s=input()
s=s.split(" ")
s.sort(key=lambda s:(len(s),s))
print(*s)

3 Distinct Characters-1
#include<bits/stdc++.h>
using namespace std;
int main()
{
 string s;
 getline(cin,s);
 unordered_map<char,int>m;
 for(auto it:s)
 {
 it=tolower(it);
 m[it]++;
 }
 s="";
 for(auto it:m)
 {
 if(it.second==1)
 {
 s+=it.first;
 }
 }
 sort(s.begin(),s.end());
 cout<<s;
}

4 Count Unique Characters
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        Map<Character , Integer> hm=new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!Character.isWhitespace(ch))
                hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        int c=0;
        for(char ch : hm.keySet()){
            if(hm.containsKey(ch) &&hm.get(ch)==1 ){
                c++;
            }
        }
        System.out.println(c);
    }
}

5 Sort Consonants

s=input().split()
for word in s:
    cons=[]
    for i in word:
        if i not in "aeiou":
            cons.append(i)
    cons.sort()
    idx=0
    res=""
    for i in word:
        if i not in "aeiou":
            res +=cons[idx]
            idx +=1
        else:
            res +=i
    print(res, end=" ")

6 Common Words
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s1 = scanner.nextLine().split(" ");
        String[] s2 = scanner.nextLine().split(" ");

        HashMap<String, Integer> d = new HashMap<>();

        for (String word : s1) {
            String lowercaseWord = word.toLowerCase();
            if (d.containsKey(lowercaseWord)) {
                d.put(lowercaseWord, d.get(lowercaseWord) + 1);
            } else {
                d.put(lowercaseWord, 1);
            }
        }

        ArrayList<String> res = new ArrayList<>();

        for (String word : s2) {
            String lowercaseWord = word.toLowerCase();
            if (d.containsKey(lowercaseWord) && d.get(lowercaseWord) > 0) {
                res.add(word);
                d.put(lowercaseWord, d.get(lowercaseWord) - 1);
            }
        }

        for (String word : res) {
            System.out.print(word + " ");
        }
    }
}

7 Sort Words of a String
s=input().split()
for word in s:
    li=[]
    for char in word:
        if  char.isalnum():
            li.append(char)
    li.sort()
    res=""
    idx=0
    for i in word:
        if  i.isalnum():
            res +=li[idx]
            idx +=1
        else:
            res +=i
    print(res, end=" ")


8 Non Common Characters
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        a=a.toLowerCase();
        b=b.toLowerCase();
        ArrayList<Character> ans=new ArrayList<>();
        for(char ch : a.toCharArray()){
            if(!Character.isWhitespace(ch)){
                if(!b.contains(ch+"") && !ans.contains(ch)){
                    ans.add(ch);
                }
            }
        }
        for(char ch : b.toCharArray()){
            if(!Character.isWhitespace(ch)){
                if(!a.contains(ch+"") && !ans.contains(ch)){
                    ans.add(ch);
                }
            }
        }
        Collections.sort(ans);
        for(char ch: ans){
            System.out.print(ch);
        }
    }
}

9
Row Wise Sum of a Matrix
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=sc.nextInt();
            }
            System.out.print(sum+" ");
        }
    }
}


10 Difference B/W Sum of Small and Large
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int lar=0,small=0;
 string s,s1;
 getline(cin,s1);
 for(auto it:s1)
 {
 if(it==' ')
 {
 sort(s.begin(),s.end());
 small+=s[0];
 lar+=s[s.size()-1];
 s="";
 }
 else s+=it;
 }
 sort(s.begin(),s.end());
 small+=s[0];
 lar+=s[s.size()-1];
 cout<<lar-small;
}

11
Absolute Difference of Small and Large
#include<bits/stdc++.h>
using namespace std;
int main()
{
 string s,s1;
 getline(cin,s1);
 for(auto it:s1)
 {
 if(it==' ')
 {
 sort(s.begin(),s.end());
 cout<<s[s.size()-1]-s[0]<<" ";
 s="";
 }
 else s+=it;
 }
 sort(s.begin(),s.end());
 cout<<s[s.size()-1]-s[0]<<" ";
}


12
Small and Large Characters
#include<bits/stdc++.h>
using namespace std;
int main()
{
 string s,s1;
 getline(cin,s1);
 for(auto it:s1)
 {
 if(it==' ')
 {
 sort(s.begin(),s.end());
 cout<<s[0]<<" "<<s[s.size()-1]<<" ";
 s="";
 }
 else s+=it;
 }
 sort(s.begin(),s.end());
 cout<<s[0]<<" "<<s[s.size()-1];
}


13
Disarium Number
import math
n=int(input())
s=str(n)
temp=0
temp1=n
for i in range(len(s), 0, -1):
    data=n%10
    temp +=math.pow(data, i)
    n //=10
if(temp==temp1):
    print('True')
else:
    print('False')

14
Fibonacci series

15
Fibonacci or Not
#include<bits/stdc++.h>
using namespace std;
int main(){
 int n;
 cin>>n;
 int a=0,b=1,c=a+b;
 while(c<=n){
 c=a+b;
 if(c==n){
 cout<<"True";
 return 0;
 }
 a=b;
 b=c;
 }
 cout<<"False";
}

16
Find two Distinct Prime Numbers with Given Product
import java.util.*;

public class FindTwoDistinctPrimeNumbersProduct {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prime1 = -1;
        int prime2 = -1;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int complement = n / i;
                if ( complement*i==n && isPrime(complement)) {
                    prime1 = i;
                    prime2 = complement;
                    break;
                }
            }
        }

        if (prime1 !=prime2) {
            System.out.println(prime1 + " " + prime2);
        } else {
            System.out.println("-1");
        }
    }
}

17
Perfect Square Root or Not
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int n; cin>>n;
 int c=sqrt(n);
 if(c*c==n) cout<<"True";
 else cout<<"False";
}


18
Ugly Number
#include<bits/stdc++.h>
using namespace std;
int main(){
 int n;
 cin>>n;

 while(n%2==0)n/=2;
 while(n%3==0)n/=3;
 while(n%5==0)n/=5;
 if(n==1)cout<<"Ugly Number";
 else cout<<"Not Ugly Number";
}


19
Count Palindrome Words in a String
n=input().split(" ")
ans=0
for i in n:
 i=i.lower()
 if i==i[::-1]:
 ans+=1
print(ans)

20
Sum of Diagonal Values


21
Count Sorted Columns in a Matrix
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int m,n,ans=0; cin>>m>>n;
 int v[m][n];
 for(int i=0;i<m;i++)
 {
 int maxi=INT_MIN,c1=0,mini=INT_MAX,c2=0;
 for(int j=0;j<n;j++)
 {
 cin>>v[i][j];
 if(v[i][j]>=maxi)
 {
 maxi=v[i][j];
 c1++;
 }
 if(v[i][j]<=mini)
 {
 mini=v[i][j];
 c2++;
 }
 }
 if(c1==n || c2==n) ans++;
 }
 cout<<ans;
}


22
Count Sorted Rows in a Matrix
def valid(arr):
    f=True
    for i in range(1,len(arr)):
        if arr[i]<arr[i-1]:
            f=False
            break
    if f:
        return True
    f=True
    for i in range(1,len(arr)):
        if arr[i]>arr[i-1]:
            f=False
            break
    return f
a,b=map(int,input().split())
c=0
for i in range(a):
    row=list(map(int,input().split()))
    if valid(row):
        c+=1
print(c)

23
Count Sorted Rows in a Matrix

24
Binary Search Tracing
import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int low=0, high=n-1;
        boolean f=true;
        while(low<=high){
            int mid=(high+low)/2;
            System.out.print(arr[mid]+" ");
            if(arr[mid]==k)f=false;
            if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        if(f)System.out.print(-1);
    }
}


25
Maximum Sum of Column Wise Sum of a Matrix
import java.util.*;
public class SumOf_all_element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum1=0,temp=-999;
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        
        for(int i=0;i<c;i++)
        {
            sum1=0;
            for(int j=0;j<r;j++)
            {
    
               sum1+=a[j][i];
              
            }
            if(temp<sum1)
            {
                temp=sum1;
            }
            
        }
        System.out.println(temp);
    }
}


26
Maximum Sum of Row Wise Sum of a Matrix
import java.util.*;
public class SumOf_all_element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum1=0,temp=-999;
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        
        for(int i=0;i<r;i++)
        {
            sum1=0;
            for(int j=0;j<c;j++)
            {
    
               sum1+=a[i][j];
              
            }
            if(temp<sum1)
            {
                temp=sum1;
            }
            
        }
        System.out.println(temp);
    }
}


27
Closest Palindrome
#include <bits/stdc++.h>
using namespace std;
int rev(long int n)
{
 int x=n,reverse=0;
 while(x>0)
 {
 int rem=x%10;
 reverse=reverse*10+rem;
 x/=10;
 }
 if(reverse==n) return 1;
 else return 0;
}
int main()
{
 long int n;
 cin>>n;
 long int L=0,H=0;
 for(long int i=n-1;i>=0;i--)
 {
 if(rev(i)==1)
 {
 L=i;
 break;
 }
 }
 for(int i=n+1;i<10000;i++)
 {
 if(rev(i)==1)
 {
 H=i;
 break;
 }
 }
 long int diffL=n-L;
 long int diffH=H-n;
 if(diffL==diffH) cout<<L<<" "<<H;
 else if(diffL>diffH) cout<<H;
 else cout<<L;

28
Reverse Even Positional Words
s = input()
s = s.split(" ")
k=0
for i in s:
    if(k%2==0):
        print(i[::-1], end=" ")
    else:
        print(i, end=" ")
    k +=1

29
Abundant_Numbers
#include<stdio.h>
int main()
{
 int a,i,s=0;
 scanf("%d",&a);
 for(i=1;i<a;i++)
 {
 if(a%i==0)
 s+=i;
 }
 if(s>a)
 printf("True");
 else
 printf("False");
 return 0;
}

30
Reverse Words and Positions
#include <bits/stdc++.h>
using namespace std;
int main()
{
 string s;
 getline(cin,s);
 reverse(s.begin(),s.end());
 cout<<s;
}


31
Sum of Even Rows and Sum of Odd Rows in a Matrix
import java.util.*;
public class SumOf_EvenRowAnd_OddRow
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0;
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               if(i%2==0)
               sum1+=a[i][j];
               else
               {
                   sum2+=a[i][j];
               }
            }
            
        }
        System.out.println(sum1+" "+sum2);
    }
}


32
Sum of Even and Odd Elements in a Matrix
#include<bits/stdc++.h>
using namespace std;
int main(){
 int n,m,t;
 cin>>n>>m;
 int o=0,e=0;
 for(int i=0;i<n;i++){
 for(int j=0;j<m;j++){
 cin>>t;
 if(t&1)o+=t;
 else e+=t;
 }
 }
 cout<<e<<" "<<o;
}


33
Sum of all Elements in a Matrix
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=sc.nextInt();
            }
            
        }
        System.out.print(sum);
    }
}

34
Absolute Difference of Two Matrices
import java.util.*;
public class AbsoluteDifference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] arr2=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Math.abs(arr[i][j]-arr2[i][j]));
                if (j < n - 1) {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}


35
Given a String, find the Maximum Length of the Words in given String
n=input().split(" ")
ans=0
for i in n:
 ans=max(ans,len(i))
print(ans)


36
GCD or HCF
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(fun(a, b));
    }
    public static int fun(int a, int b){
        if(a==0)return b;
        return fun(b%a, a);
    }
}

37
Adam number
import java.util.*;
public class AdanNumber
{
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int rev=0,rev1=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        int sq1=rev*rev;
        while(sq1!=0)
        {
            int rem1=sq1%10;
            rev1=rev1*10+rem1;
            sq1/=10;
        }
        if(sq==rev1)
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
         
        
        
    }
        
       
}


38
Harshed number
#include<stdio.h>
int main()
{
 int a,s=0,i,t;
 scanf("%d",&a);
 t=a;
 while(a!=0)
 {
 i=a%10;
 s+=i;
 a/=10;
 }
 if(t%s==0)
 printf("True");
 else
 printf("False");

 return 0;
}

39
Happy number
#include<stdio.h>
#include<math.h>
void happy(int n)
{
 int i,d=0;
 if((n==7) || (n==1))
 {
 printf("True");
 return ;
 }
 // if(n==4||n==5||n==2||n==3||n==6||n==8||n==9)
 if(n==4)
 {
 printf("False");
 return ;
 }
 while(n)
 {
 d+=pow(n%10,2);
 n/=10;
 }
 happy(d);
}
int main()
{
 int n;
 scanf("%d",&n);
 happy(n);
}

40
Unique number
n=input()
for i in n:
 s=0
 for j in n:
 if(i==j):
 s=s+1
 if(s==2):
 print("Not Unique Number")
 break
else:
 print("Unique Number")

41
Amicable Numbers
import java.util.*;
public class AmicableNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,s1=0,s=0;
        for(i=1;i<n/2+1;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
         for(i=1;i<m/2+1;i++)
        {
            if(m%i==0)
            {
                s1=s1+i;
            }
        }
        if(s1==n && s==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}


42
Count Elements II
n,m=map(int,input().split())
l1=list(map(int, input().split()))
l2=list(map(int, input().split()))
li1=set(l1)
li2=set(l2)
c=0
for i in li1:
    if i not in li2:
        c +=1
for i in li2:
    if i not in li1:
        c +=1
print(c)
43
Count Elements I
n,m=map(int, input().split())
li1=list(map(int, input().split()))
li2=list(map(int, input().split()))
set1=set(li1)
set2=set(li2)
set3=set1.intersection(set2)
print(len(set3))

44
Generate Array II
n=int(input())
li=list(map(int, input().split()))
for i in range(0, n-1, 2):
    for j in range(li[i+1]):
        print(li[i], end=" ")


45
Average of Primes

46
Primes Greater than k

47
Unique Odd Elements Sum
n=int(input())
arr=list(map(int,input().split()))
b=[]
for i in arr:
 if i not in b:
 b.append(i)
 else:
 continue
s=0
for i in range(len(b)):
 if(b[i]%2==1):
 s=s+b[i]
print(s)

48
Binary Array to Decimal
a=int(input())
ar=list(map(int,input().split()))
res=0
for i in range(a-1,-1,-1):
    if ar[i]==1:
        res=res|(1<<(a-i-1))
print(res)

49
Kth Largest Element in the Array
n = int(input())
li = list(map(int, input().split()))
k=int(input())
l=sorted(li)
print(l[n-k])

50
Even odd Series
#include<bits/stdc++.h>
using namespace std;
int main(){
 int n;
 cin>>n;
 vector<long long>a,b;
 a.push_back(2);
 b.push_back(0);
 b.push_back(1);
 for(int i=0;i<1000;i++){
 a.push_back(a.back()*2*1ll);
 b.push_back(b.back()*3*1ll);
 }
 int i=0;
 for(i=0;i<(n+1)/2;i++){
 cout<<a[i]<<" "<<b[i]<<" ";
 }
 if(n%2==0)
 cout<<a[i];
}

51
Self Dividing Numbers
#include<stdio.h>
int self(int n)
{
 int i,j;
 j=n;
 while(j){
 i=j%10;
 if(i==0)
 return 0;
 if(n%i!=0)
 return 0;
 j=j/10;
 }
 return 1;
}
int main()
{
 int a,b;
 scanf("%d%d",&a,&b);
 for(int i=a;i<=b;i++)
 {
 if(self(i)==1)
 printf("%d ",i);
 }
 return 0;
}

52
Balanced Array
def find_equilibrium_element(arr):
 total_sum = sum(arr)
 left_sum = 0
 for i in range(len(arr)):
 total_sum -= arr[i]
 if left_sum == total_sum:
 return "YES"

 left_sum += arr[i]

 return "NO"
n=int(input())
for i in range(n):
 N = int(input())
 arr = list(map(int, input().split()))
 result = find_equilibrium_element(arr)
 print(result)

53
M-Countdown Array
def fun(l, k):
    c=0
    curr=k
    for num in l:
        if num==curr:
            curr -=1
            if curr==0:
                c +=1
                curr=k
    return c
for _ in range(int(input())):
    n,k=map(int, input().split())
    l=list(map(int, input().split()))
    print(fun(l,k))

54
First Non Repeated Character
for i in range(int(input())):
    n=int(input())
    s=input()
    f=1
    for i in s:
        if s.count(i)==1:
            print(i)
            f=0
            break
    if f==1:
        print(-1)

55
Deletion of Consecutive Duplicate Characters
import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        while (n-- > 0) {
            String s = sc.nextLine();
            char ch = s.charAt(0);
            int c = 0;

            for (int i = 1; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    c++;
                } else {
                    ch = s.charAt(i);
                }
            }

            System.out.println(c);
        }
    }
}



56
Program to find the Number of Integers with Exactly 9 Divisors
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            if (countDivisors(i) == 9) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Total=" + count);
    }
    
    public static int countDivisors(int num) {
        int count = 0;
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
               count++;
            }
        }
        return count;
        }
}


57
Program to find the Sum of Perfect Square Elements in an Array
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] a=new int[n];
 for(int i=0;i<n;i++){
 a[i]=sc.nextInt();
 }
 int c,sum=0;
 for(int i=0;i<n;i++){
 if(a[i]!=0){
 c=(int)Math.sqrt(a[i]);
 if((c*c)==a[i]){
 sum=sum+a[i];
 }
 }
 }
 System.out.print(sum);
 }
}
58
Count of the Non-Prime Divisors of a given Number
import math
def fun(n):
    if n<2:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n%i==0:
            return False
    return True
n=int(input())
c=0
for i in range(1, n+1):
    if n%i==0 and not fun(i):
        c +=1
print(c)

59
Count Multiples of 3 Between M ,N
n,m=map(int,input().split(" "))
ans=0
for i in range(n,m+1,1):
 if i%3==0:
 ans+=1
print(ans)

60
Count Number of Words
n=input().split(" ")
print(len(n))


61 Tv Subscription
n=int(input())
for i in range(n):
 a,b=map(int,input().split())
 print(((1 if a%6!=0 else 0) + a//6)*b)


62 Don and 3
#include<bits/stdc++.h>
using namespace std;
int main(){
 int t; cin >> t;
 while(t--){
 int a,b; cin >> a >> b;
 if(a%3==0 || b%3==0){
 cout << 0 << "\n";
 }
 int step = 0;
 while(a%3!=0 && b%3!=0){
 if(a>b){
 a = abs(a-b);
 step++;
 if(a%3==0) {cout << step << "\n";}
 }
 else{
 b = abs(a-b);
 step++;
 if(b%3==0) {cout << step << "\n";}
 }
 }
 }
}


63
Counting the Occurances
s=input()
c=0
for i in s:
    if i.isdigit():
        c+=1
if c>0:
    print("Contains",c,"digit")
else:
    print("Doesn't contain digit")

Generate Array II
n=int(input())
li=list(map(int, input().split()))
for i in range(0, n-1, 2):
    for j in range(li[i+1]):
        print(li[i], end=" ")


64
Minimum Shoes to Buy
import java.util.*;
public class Owl_Coder{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int ans=a;
 if(b<a){
 ans+=a-b;
 }
 System.out.println(ans);
 }
}
65
Little Monk and Good String
s=input()
c=0
mx=-1
for i in s:
    if i in "aeiou":
        c +=1
    else:
        mx=max(mx,c)
        c=0
print(max(c, mx))

66
Data Arrangement
n=int(input())
li=list(map(int, input().split()))
l=[]
for i in li:
    if(i<0):
        print(i, end=" ")
    else:
        l.append(i)
print(*l)


67
Sum of digits in a String
s = input()
total_sum = 0
for char in s:
 if char.isdigit():
 total_sum += int(char)
print(total_sum)

68
Choose wisely
import java.util.*;
public class Owl_Coder{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t--!=0){
 int a=sc.nextInt();
 int b=sc.nextInt();
 int ans=Math.max(1500-a*2-4*(a+b), 1500-4*b-2*(a+b))
 System.out.println(ans);
 }
 }
}

69
Find Possible GCD
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<1000;i++){
                set.add(gcd(a+i, b+i));
            }
            System.out.println(set.size());
        }
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
70
Max of String
import java.util.*;
public class Counting_the_Camel_Case_Word{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();


 int max=0;;
 for(int i=0;i<str.length();i++){
 if(str.charAt(i)>=max){
 max=str.charAt(i);
 }
 }
 System.out.println((char)max);
 }
}

71
Second most frequent character
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character, Integer> hm=new HashMap<>();
        for(char ch : s.toCharArray())hm.put(ch, hm.getOrDefault(ch, 0)+1);
        int maxCount=-1;
        int secountMax=-1;
        char firstChar ='0';
        char secountChar ='0';

        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            int value=entry.getValue();
            char ch=entry.getKey();
            if(value > maxCount){
                secountMax=maxCount;
                maxCount=value;
                secountChar=firstChar;
                firstChar=ch;
            }
            else if( value>secountMax && value!=maxCount){
                secountMax=value;
                secountChar=ch;
            }
        }
        System.out.print(secountChar=='0'? "-1" : secountChar);
    }
}
    

72
Color Code
import java.util.*;
public class colorCode
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='V' || c=='v')
        {
            System.out.println("Violet");
        }
        else if(c=='I'|| c=='i')
        {
            System.out.println("Indigo");
        }
        else if(c=='B' ||c=='b')
        {
            System.out.println("Blue");
        }
        else if(c=='G'||c== 'g')
        {
            System.out.println("Green");
        }
        else if(c=='Y'||c== 'y')
        {
            System.out.println("Yellow");
        }
        else if(c=='O' ||c== 'o')
        {
            System.out.println("Orange");
        }
        else if(c=='R' || c=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
        
    }
}


73
Display Season
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 if(n>=4 && n<=6){
 System.out.println("Summer");
 }else if(n>=7 && n<=10){
 System.out.println("Rainy");
 }else if(n==11 || n==12 || n==1){
 System.out.println("Winter");
 }else if(n==2 || n==3){
 System.out.println("Spring");
 }else{
 System.out.println("-1");
 }
 }
}

74
String Concatenate
import java.util.*;
public class String_Concatenate{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String str1=sc.nextLine();
 String str2=sc.nextLine();

 String s=str1.concat(str2);
 char[] ch=s.toCharArray();
 Arrays.sort(ch);
 for(int i=0;i<ch.length;i++){
 System.out.print(ch[i]);
 }
 }
}
75
Swap Bits

76
Bombs Drop
for _ in range(int(input())):
    n,k=map(int, input().split())
    l=list(map(int, input().split()))
    i=n-1
    while(i>=0):
        if(k>l[i]):
            break
        i -=1
    print(i+1)

77
String contain digit or not
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String s1=sc.nextLine();
 int d=0;
 for(int i=0;i<s1.length();i++){
 char ch=s1.charAt(i);
 if(Character.isDigit(ch)){
 d+=1;
 }
 }
 if(d==0){
 System.out.println("Doesn't contain digit");
 }
 else{
 System.out.println("Contains "+d+" digit");
 }
 }
}

78
String Protocol
for _ in range(int(input())):
    n=int(input())
    s=input()
    c=i=0
    while i<n:
        if i<n-1 and s[i]==s[i+1]:
            c +=1
            i +=2
        else:
            c +=1
            i +=1
    print(c)

79
Sankar and Maths

80
valid string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        Map<Integer, Integer> freqCount = new HashMap<>();
        
        for (int count : charCount.values()) {
            freqCount.put(count, freqCount.getOrDefault(count, 0) + 1);
        }
        
        if (freqCount.size() == 1 || (freqCount.size() == 2 && freqCount.containsValue(1))) {
            System.out.println("Valid String");
        } else {
            System.out.println("Not Valid");
        }
    }
}


81
General's Arrival

82
Clothing Store
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int ele : arr){
            hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }
        int ans=0;
        for(int data : hm.values()){
            ans+=data/2;
           // System.out.println(data);
        }
        System.out.println(ans);
    }
}

83
Count number of ways to cover a distance
def countWays(n):
 if (n == 0):
 return 1
 if (n <= 2):
 return n
 f0 = 1
 f1 = 1
 f2 = 2
 ans = 0
 for i in range(3, n + 1):
 ans = f0 + f1 + f2
 f0 = f1
 f1 = f2
 f2 = ans
 return ans
n = int(input())
print(countWays(n))
84
Display unique values in an Array
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 if(n>=4 && n<=6){
 System.out.println("Summer")
 }else if(n>=7 && n<=10){
 System.out.println("Rainy")
 }else if(n==11 || n==12 || n==1){
 System.out.println("Winter")
 }else if(n==2 || n==3){
 System.out.println("Spring")
 }else{
 System.out.println("-1");
 }
 }
}

85
Excel Mapping
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int rem=n%26;
            sb.append((char) (64 + rem));
            n/=26;
        }
        System.out.println(sb.reverse().toString());
    }
}

86
Batsman Average
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 float a=sc.nextFloat();
 int t=sc.nextInt();
 int rs=0,os=0;
 while(t--!=0){
 int r=sc.nextInt();
 int o=sc.nextInt();
 int b=sc.nextInt();
 rs+=r;
 if(o==0){
 os++;
 }
 }
 float na=(float)rs/os;
 float ca=(na+a)/2;
 System.out.format("%.2f",ca);
 System.out.println();
 if(ca>a){
 System.out.print("True");
 }else{
 System.out.print("False");
 }
 }
}

87
Bowler Statistics
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 long mp=sc.nextLong();
 long ip=sc.nextLong();
 long bd=sc.nextLong();
 long r=sc.nextLong();
 long w=sc.nextLong();
 long hw=sc.nextLong();
 long mwr=sc.nextLong();
 long nfw=sc.nextLong();
 double ba=(double)r/w;
 System.out.format("%.2f",ba);
 double bs=(double)bd/w;
 System.out.format("\n%.2f",bs);
 double be=(double)r/((double)bd/6);
 System.out.format("\n%.2f",be);

 }
}

88
Team Selection
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int Teamsize=0,max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]+k<=5){
                Teamsize++;
            }
            if(Teamsize==3){
                max++;
                Teamsize=0;
            }
        }
        System.out.println(max);
    }
}

89
Integer Problem
t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    difference = abs(a - b)  
    moves = (difference + 9) // 10
    print(moves)


90
Count Spaces in a String
n=int(input())
li=list(map(int,input().split()))
for i in li:
 if(li.count(i)==1):
 print(i)
 break
91
Find Index Position
def find_index(arr, n, K):
    for i in range(n):
        if arr[i] == K:
            return i
        elif arr[i] > K:
            return i
    return n

for _ in range(int(input())):
    n, t = map(int, input().split())
    l = list(map(int, input().split()))
    print(find_index(l, n, t))

92
Find the Element

93
Minimum Unique Digit Sum
def fun(n):
    res=""
    for i in range(9, 0, -1):
        if(n>=i):
            n -=i
            res +=str(i)
    return res

n=int(input())
print(fun(n)[::-1])

94
Monk and Welcome Problem
import java.util.*;
public class MonkAndWelcomeProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int[] a=new int[n];
         int[] b=new int[n];
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
          for(i=0;i<n;i++)
         {
             b[i]=sc.nextInt();
         }
          for(i=0;i<n;i++)
         {
             System.out.print((a[i]+b[i])+" ");
         }
    }
}



95
Monk Teaches Palindrome
n=int(input())
while(n):
 n-=1
 a=input()
 a.casefold()
 if(a[::-1]==a and len(a)%2==0):
 print("YES EVEN")
 elif(a[::-1]==a and len(a)&2!=0):
 print("YES ODD")
 elif(a[::-1]!=a):
 print("NO")
 else:
 print("YES ODD")
96
Rotation
for _ in range(int(input())):
    n, k=map(int, input().split())
    li=list(map(int, input().split()))
    k=k%n
    for i in range(k):
        temp=li[n-1]
        for j in range(n-1, 0, -1):
            li[j]=li[j-1]
        li[0]=temp
    print(*li)


97
Sorting Frequency
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        Comparator<Integer> customComparator = (num1, num2) -> {
            int freqComparison = frequencyMap.get(num2).compareTo(frequencyMap.get(num1));
            if (freqComparison == 0) {
                return num1.compareTo(num2);
            }
            return freqComparison;
        };

        Arrays.sort(arr, customComparator);
         LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
         for( int ele : set)
            System.out.print(ele+" ");

        
    }
}

98
UNIQUE MAXIMUM NUMBER
n=int(input())
li=list(map(int, input().split()))
maxDig=-1
for i in li:
    if li.count(i)==1:
        maxDig=max(maxDig, i)
print(maxDig)

99
Good Investment or Not
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int a,b;
 cin>>a>>b;
 if(a>=2*b) cout<<"YES";
 else cout<<"NO";
}
100
Find the time
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int n;
 cin>>n;
 cout<<n/3;
}
101
Chocolate Distribution
n, k = map(int, input().split())
li = list(map(int, input().split()))
ans = float('inf') 
li.sort()
for i in range(n - k + 1):
    diff=li[i+k-1]-li[i]
    ans = min(ans,diff)

print(ans)


102
Remove duplicate elements from sorted Array
n=int(input())
li=list(map(int,input().split()))
n=set(li)
print(len(n))
103
Number of Good Pairs
import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
        }
        System.out.println(c);

    }
}
104
Final Value of Variable After Performing Operations
import java.util.*;
public class Owl_Coder{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 int x=0;
 String[] arr = s.split(" ");
 for(String word : arr){
 if(word.charAt(0)=='+'){
 ++x;
 }
 else if(word.charAt(0)=='-'){
 --x;
 }
 else if(word.charAt(word.length()-1)=='+'){
 x++;
 }
 else{
 x--;
 }
 }
 System.out.println(x);

 }
}
105
Shuffle the Array
li=list(map(int, input().split()))
n=int(input())
part1=li[:n]
part2=li[n:]
ans=[]
for i in range(n):
    ans.append(part1[i])
    ans.append(part2[i])
print(*ans)
106
Richest Customer Wealth
n,m=map(int, input().split())
maxS=-999
for i in range(n):
    li=list(map(int, input().split()))
    maxS=max(maxS, sum(li))
print(maxS)
107
Reverse Last 3 digits
n=int(input())
x=(str(n)[0:3])
y=(str(n)[:2:-1])
print(x+y)

108
Four Factor

109
Duplicate Zeros
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        duplicateZeros(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        int zeros = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        int lastIndex = length - 1;
        int newIndex = length - 1 + zeros;

        while (lastIndex >= 0) {
            if (newIndex < length) {
                arr[newIndex] = arr[lastIndex];
            }

            if (arr[lastIndex] == 0) {
                newIndex--;

                if (newIndex < length) {
                    arr[newIndex] = 0;
                }
            }

            lastIndex--;
            newIndex--;
        }
    }
}


110
Palindrome String
s=input()
if s==s[::-1]:
    print(1)
else:
    print(0)

111
K-th Element of two Arrays
n,m=map(int, input().split())
l1=list(map(int, input().split()))
l2=list(map(int, input().split()))
l1=l1+l2
l1.sort()
k=int(input())
print(l1[k-1])


112
First element to occur k times
import java.util.*;
public class Owl_Coder{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 }
 int k=sc.nextInt();
 Map<Integer, Integer> hm=new HashMap<>();
 for(int ele : arr){
 hm.put(ele, hm.getOrDefault(ele, 0)+1);
 if(hm.get(ele)==k){
 System.out.println(ele);
 return ;
 }
 }
 System.out.println(-1);
 }
}
113
Finding the First Occurrence of a Substring
import java.util.*;
public class Owl_Coder{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String s=sc.nextLine();
 String st=sc.nextLine();
 System.out.println(s.indexOf(st));
 }
}
114
Product array puzzle
n=int(input())
l=list(map(int, input().split()))
for i in range(n):
    p=1
    for j in range(n):
        if i!=j:
            p *=l[j]
    print(p, end=" ")

115
Non Repeating Numbers
n=int(input())
l=list(map(int, input().split()))
ans=[]
for i in l:
 if l.count(i)==1:
 ans.append(i)
ans.sort()
print(*ans)

116
Palindrome and Rotation


117
Sorting the array
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] sortedArray = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sortedArray[i] = a[i];
        }
        Arrays.sort(sortedArray);
        int left = 0;
        int right = n - 1;

        while (left < n && a[left] == sortedArray[left]) {
            left++;
        }

        while (right >= 0 && a[right] == sortedArray[right]) {
            right--;
        }

        if (left >= right) {
            System.out.println("YES");
            System.out.println("1 1");
        } else {
            int start = left + 1;
            int end = right + 1;

            for (int i = left; i <= right; i++) {
                if (a[i] != sortedArray[right - (i - left)]) {
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");
            System.out.println(start + " " + end);
        }
    }
}


118
Miximum Value

119
Possible permutations

120
Predict the Winner
import java.util.*;
class Winner{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] arr=new int[n];
 int x=0,y=0;
 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 if(i%2!=0){
 x+=arr[i];
 }
 else{
 y+=arr[i];
 }
 }
 if((x-y)%4==0){
 System.out.print("X");
 }
 else{
 System.out.print("Y");
 }
 }
}

121
Predict the Winner in Coin Game
import java.util.*;
public class Owl_Coder{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 if(a%2==0 || b%2==0){
 System.out.println("Player 1");
 }else{
 System.out.println("Player 2");
 }
 }
}
122
Decompress Run-Length Encoded List
N = int(input())
nums = list(map(int, input().split()))
for i in range(0, N, 2):
    freq = nums[i]
    val = nums[i + 1]
    for j in range(freq):
        print(val,end=" ")

123
Replace Elements with Greatest Element on Right Side
import java.util.*;
public class Replace_Elements{
 public static void nextGreatest(int arr[],int n){
 for(int i=0;i<n;i++) {
 int max_value=-1;
 for(int j=i+1;j<n;j++){
 max_value=Math.max(max_value,arr[j]);
 }
 arr[i]=max_value;
 }
 }
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++){
 a[i]=sc.nextInt();
 }
 nextGreatest(a,n);
 for(int i=0;i<n;i++){
 System.out.print(a[i]+" ");
 }

 }
}


124
Valid Parentheses
import java.util.*;
public class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 Stack<Character> st=new Stack<>();
 for(char ch : s.toCharArray()){
 if(ch=='(')st.push(')');
 else if(ch=='{')st.push('}');
 else if(ch=='[') st.push(']');
 else{
 if(st.isEmpty() || st.pop()!=ch){
 System.out.print("False");
 return ;
 }
 }
 }
 if(st.isEmpty())System.out.println("True");
 else System.out.println("False");
 }
}

125
Multiply Strings
import java.util.*;
public class String_Multiply{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String s1=sc.next();
 String s2=sc.next();
 long a=Long.parseLong(s1);
 long b=Long.parseLong(s2);

 System.out.println(a*b);
 }
}

126
Product of Array Except Self
import java.util.*;
public class Product_of_Array{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 }
 for(int i=0;i<n;i++){
 int pro=1;
 for(int j=0;j<n;j++){
 if(arr[i]==arr[j]){
 continue;
 }
 else{
 pro*=arr[j];
 }
 }
 System.out.print(pro+" ");
 }
 }
}

127
Third Maximum Number
import java.util.*;
public class Third_Maximum_Number{
 public static void MaximumNumber(int arr[],int n){
 int max=-1;
 if(n<=2){
 for(int i=0;i<n;i++){
 max=Math.max(max,arr[i]);
 }
 System.out.println(max);
 }
 else{
 int first = arr[0];
 for (int i = 1;i <n; i++)
 if (arr[i] > first)
 first = arr[i];
 int second = Integer.MIN_VALUE;
 for (int i = 0;i <n; i++)
 if (arr[i] > second &&
 arr[i] < first)
 second = arr[i];
 int third = Integer.MIN_VALUE;
 for (int i = 0;i <n; i++)
 if (arr[i] > third &&
 arr[i] < second)
 third = arr[i];
 System.out.println(third);
 }

 }
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++){
 a[i]=sc.nextInt();
 }
 MaximumNumber(a,n);

 }
}


128
SnackDown Contest
129
Help Jarvis!
import java.util.*;
public class Owl_Coder{
 public static boolean fun(String s){
 char[] arr=s.toCharArray();
 Arrays.sort(arr);
 for(int i=0;i<arr.length-1;i++){
 if((arr[i+1]-arr[i])!=1)
 return false;
 }
 return true;
 }
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 sc.nextLine();
 while(t-->0){
 String s=sc.nextLine();
 if(fun(s)){
 System.out.println("YES");
 }
 else{
 System.out.println("NO");
 }
 }
 }
}

130
Speed
#include<bits/stdc++.h>
using namespace std;
int main()
{
int t;
cin>>t;
 while(t--)
 {
 int n;
 cin>>n;
 int arr[n];
 int c=1;
 for(int i=0;i<n;i++)
 {
 cin>>arr[i];
 }
 for(int i=1;i<n;i++)
 {
 if(arr[i]<arr[i-1])
 {
 c++;
 }
 }
 cout<<c<<endl;
 }
}

131
Find Angle

132
Student Arrangement

133
Viral Advertising
def viralAdvertising(n):
    shared = 5  
    cumulative_liked = 0  
    
    for day in range(1, n + 1):
        liked = shared // 2 
        cumulative_liked += liked
        shared = liked * 3 
        
    return cumulative_liked
n = int(input())
result = viralAdvertising(n)
print(result)

134
Last Occurrence
#include<bits/stdc++.h>
using namespace std;
int main(){
 int n,m; cin >> n >> m;
 int ok[n];
 for(int i=0;i<n;i++) cin >> ok[i];
 int idx = -1;
 for(int i=n-1;i>=0;i--){
 if(ok[i] == m){
 idx = i+1; break;
 }
 }
 cout << idx;
}

135
Maximum element in each column
import java.util.*;
public class Owl_Coder{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int m=sc.nextInt();
 int n=sc.nextInt();
 int a[][]=new int[m+1][n+1];
 for(int i=1;i<=m;i++){
 for(int j=1;j<=n;j++){
 a[i][j]=sc.nextInt();
 }
 }
 try{
 int max=0;
 for(int i=1;i<=m;i++){
 max=0;
 for(int j=1;j<=n;j++){
 if(a[j][i]>max){
 max=a[j][i];
 }
 }
 System.out.println(max);
 }
 }catch(ArrayIndexOutOfBoundsException e){
 System.out.println();
 }
 }
}


136
Kangaroo
def kangaroo(x1, v1, x2, v2):
    if x1 == x2 and v1 == v2:
        return "YES"
    if x1 != x2 and v1 == v2:
        return "NO"
    if (x1 - x2) % (v2 - v1) == 0 and (x1 - x2) / (v2 - v1) >= 0:
        return "YES"
    
    return "NO"
x1, v1, x2, v2 = map(int, input().split())
result = kangaroo(x1, v1, x2, v2)
print(result)

137
Record Breaker

138
RainDrop

139
Calculate the Average of Numbers

140
Calculate the Area of a Rectangle

141
Check for Anagrams

142
Calculate the Hypotenuse of a Right Triangle
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int a,b;
 cin>>a>>b;
 float h=sqrt((pow(a,2))+(pow(b,2)));
 printf("%.2f",h);
}


143
Find the Maximum in a String

144
Find Common Divisors

145
Check for a Strong Number

146 Merge Two Sorted Lists


147 Calculate the GCD of Multiple Numbers
import math
from functools import reduce
li=list(map(int, input().split()))
ans=reduce(math.gcd,li)
print(ans)

148
Find the LCM of Multiple Numbers
import math
from functools import reduce
li=list(map(int,input().split()))
ans=reduce(math.lcm, li)
print(ans)

149 Calculate Prime Factors

150 Check for Leap Year
#include<bits/stdc++.h>
using namespace std;
int main()
{;
 int year;
 cin>>year;
 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
 {
 cout <<"True";
 }
 else
 {
 cout <<"False";
 }
}

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] count = new int[2];
        int index = 0;
        int max = 0;
        boolean zero = false;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                count[index] ++;
                max = Math.max(max, count[0] + count[1]);
            }
            else {
                zero = true;
                index = index ^ 1;
                count[index] = 0;
            }
        }
        if (zero == true) {
            max ++;
        }
        return max;
    }
}



