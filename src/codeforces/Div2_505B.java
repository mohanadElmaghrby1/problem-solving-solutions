package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author Mohannad Elmagharby
 * on 3/5/2020
 */
public class Div2_505B {

    static HashMap<Integer , ArrayList<HashMap<Integer , Integer>>> map = new HashMap();

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for (int i = 0; i < m; ++i){
            String abc[] = bf.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            int c = Integer.parseInt(abc[2]);

            if (!map.containsKey(a)) {
                map.put(a , new ArrayList<>());
                mapAll.put(a , new ArrayList<>());

            }
            HashMap <Integer , Integer> numColor = new HashMap<>();
            numColor.put(b,c);
            map.get(a).add(numColor);
            mapAll.get(a).add(b);


            if (!map.containsKey(b)) {
                map.put(b , new ArrayList<>());
                mapAll.put(b , new ArrayList<>());
            }
            HashMap <Integer , Integer> numColorRe = new HashMap<>();
            numColorRe.put(a,c);
            map.get(b).add(numColorRe);
            mapAll.get(b).add(a);

        }

        int a = Integer.parseInt(bf.readLine());
        StringBuilder ansrBuilder = new StringBuilder("");
        for (int i = 0; i < a; i++) {
            String uv[] = bf.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);
            dfs(u, v, -1);
            ansrBuilder.append(ans+"\n");
            ans=0;
//            System.out.println(ansSet.size());
//            ansSet.clear();
        }
        System.out.println(ansrBuilder.toString());
//        System.out.println(dfs(1, 3 , -1));

//        System.out.println(dfsAllWays(1 , 3));
    }


    static boolean visited []= new boolean[100+1];
    static HashMap<String , Boolean> visitedMap =new HashMap<>();
    static int ans=0;
//    static HashSet<Integer> ansSet = new HashSet<>();

    public static int dfs(int u , int v  , int parentColor){
        if (u == v){
//            System.out.println("reached");
//            ansSet.add(parentColor);
            return 1;
        }
        map.get(u).forEach( childMaps -> childMaps.forEach((key , color) ->{
            if (color==parentColor || parentColor==-1){
                if (!visitedMap.containsKey(key+","+color)){
                    visitedMap.put(key+","+color , true);
                    visitedMap.put(u+","+color , true);
                    ans+=dfs(key , v , color);
                }
            }
        }));
        return ans;
    }

    static boolean visitedAll []= new boolean[100+1];
    static int ansAll=0;
    static HashMap<Integer , ArrayList<Integer>> mapAll = new HashMap<>();
    public static int dfsAllWays(int u , int v ){
        if (u == v){
            return 1;
        }
        visitedAll[u]=true;
        mapAll.get(u).forEach(child ->{
            if (!visitedAll[child])
            ansAll += dfsAllWays(child , v);
        });
        return ansAll;
    }
}

/*
3 3
1 3 1
1 3 2
3 2 1


3 2
1 3 1
1 3 2


3 3
1 2 1
2 3 1
3 1 1

 */

