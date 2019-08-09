package com.cui.赛码网.名企真题.京东;


import java.util.*;

/**
 * 输入
 * 输入中有多组测试数据。每组测试数据的第一行为两个整数n和m（1=＜n, m=＜1000），分别表示价签的数量以及小B的购买清单中所列的
 * 物品数。第二行为空格分隔的n个正整数，表示货架上各类物品的价格，每个数的大小不超过100000。随后的m行为购买清单中物品的名称，
 * 所有物品名称为非空的不超过32个拉丁字母构成的字符串，保证清单中不同的物品种类数不超过n，且商店有小B想要购买的所有物品。
 *
 * 输出
 * 对每组测试数据，在单独的行中输出两个数a和b，表示购买清单上所有的物品可能需要的最小和最大费用。
 *
 * 思路：
 * 最小费用：给买的数量最多的物品分配最小单价
 * 最大费用：给买的数量最多的物品分配最大单价
 *
 */
public class 采购单 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();//n表示价签数量
            int m = scanner.nextInt();//m表示要采购的物品数量
            List<Integer> jiaqian = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                jiaqian.add(scanner.nextInt());
            }
            Collections.sort(jiaqian); //价签升序排列
            String[] wupins = new String[m];
            for (int i = 0; i < m; i++) {
                wupins[i] = scanner.next();
            }
            feiyong(jiaqian, wupins);
            System.out.println();
        }
    }

    private static void feiyong(List<Integer> jiaqian, String[] wupins) {
        Map<String, Integer> wupinMap = stringArrayToMap(wupins); //物品清单映射成map，键为物品，值为数量
        /*for (String key:wupinMap.keySet()
             ) {
            System.out.println(key+" "+wupinMap.get(key));
        }*/
        /*
        最小费用：给数量最多的物品分配最小的价格
         */
        int min = minFeiyong(jiaqian, wupinMap);
        System.out.print(min+" ");
        /*
        最大费用：给数量最多的物品分配最大的价格
         */
        int max = maxFeiyong(jiaqian, wupinMap);
        System.out.print(max);

    }

    private static int minFeiyong(List<Integer> jiaqian, Map<String, Integer> wupinMap) {
        int feiyong = 0;
        int p=0;
        for (String k : wupinMap.keySet()
        ) {
            feiyong+=wupinMap.get(k)*jiaqian.get(p);
            p++;
        }
        return feiyong;

    }

    private static int maxFeiyong(List<Integer> jiaqian, Map<String, Integer> wupinMap) {
        int feiyong = 0;
        int p=jiaqian.size()-1;
        for (String k : wupinMap.keySet()
        ) {
            feiyong+=wupinMap.get(k)*jiaqian.get(p); //取最大价格
            p--;
        }
        return feiyong;
    }

    /**
     * 将物品数组转换成map，并按照数量降序排序
     * @param wupins
     * @return
     */
    private static  Map<String, Integer> stringArrayToMap(String[] wupins) {
        Map<String, Integer> map = new HashMap<>();
        for (String wupin:wupins
             ) {  //将字符串数组转换成map，键为物品，值为该物品数量
            if (map.containsKey(wupin)) {
                map.put(wupin, map.get(wupin) + 1);
            } else {
                map.put(wupin, 1);
            }
        }

        //排序
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());//降序
            }

        });
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry:list
             ) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }


}
