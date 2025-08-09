import java.io.*;
import java.util.*;


public class Main {
     static void dfs(ArrayList<ArrayList<Integer>>drl,boolean vis[],int u,int v){
        if(vis[u])
        return ;
        vis[u]=true;
        
        for(Integer it:drl.get(u)){
            if(!vis[it]){
                dfs(drl,vis,it,v);

            }
                                
        }
       
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int k=0;
        while(++k<=t)
        {
           int n=s.nextInt();
           int m=s.nextInt();
           ArrayList<ArrayList<Integer>>drl=new ArrayList<>(n+1);
           for(int i=0;i<=n;i++)
           drl.add(new ArrayList<>());
           for(int i=0;i<m;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            drl.get(u).add(v);
            drl.get(v).add(u);
           }
          int q=s.nextInt();
          System.out.println("Test Case #"+k +":");
          while(q-->0){
           boolean vis[]=new boolean[n+1];
         int k1=  s.nextInt();
         int k2=s.nextInt();
         dfs(drl,vis,k1,k2);

           if(vis[k1] && vis[k2])
           System.out.println("Yes");
           else
           System.out.println("No");
         }

           
          
        }
        
       
    }
}