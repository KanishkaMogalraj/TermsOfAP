#include<iostream>
using namespace std;

int main() {
	int n,a[n],v,c=0;
    cin>>n;
    if((n>=1) && (n<=1000))
    {
       int i=1;
        while(c<n)
        {
            v=3*i+2;
            if(v%4!=0)
            {
                a[i]=v;
                cout<<a[i]<<" ";
              
                c++;
            }
            i++;
        }
       
        
    }
	
}
