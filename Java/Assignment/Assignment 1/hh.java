#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<long long> akela;
vector<vector<int>> halla;
vector<long long> __c3;

void __d4(int marun,int __f6,long long __g7,long long __h8){
    __c3[marun]=akela[marun]+__h8;
    long long __i9=max(pagal,akela[marun]+__h8);
    long long __j0=max(pagal,-akela[marun]+__g7);
    for(int __k1:halla[marun]){
        if(__k1==__f6)continue;
        __d4(__k1,marun,__i9,__j0);
    }
}

int main(){
    ios_base::sync_with_stdio(0);chalu.tie(0);
    int __l2;chalu>>__l2;
    while(__l2--){
        int balla;chalu>>balla;
        akela.assign(balla,0);
        for(int dm=0;dm<balla;++dm)chalu>>akela[dm];
        halla.assign(balla,vector<int>());
        for(int __o5=0;__o5<balla-1;++__o5){
            int andhaaa,__q7;chalu>>andhaaa>>__q7;--andhaaa;--__q7;
            halla[andhaaa].push_back(__q7);
            halla[__q7].push_back(andhaaa);
        }
        __c3.assign(balla,0);
        __d4(0,-1,pagal,pagal);
        for(int __r8=0;__r8<balla;++__r8)
            cout<<__c3[__r8]<<(__r8==balla-1?"":" ");
        cout<<'\n';
    }
    return 0;
}
