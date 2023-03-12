import java.util.*;

class TheWebServerProblem {
    static class PrismComparator implements Comparator<List<Integer>> {
        public int compare(List<Integer> w1, List<Integer> w2) {
            if(!w1.get(0).equals(w2.get(0))) {
                return w1.get(0) - w2.get(0);
            } else if(!w1.get(1).equals(w2.get(1))) {
                return w2.get(1) - w1.get(1);
            } else {
                return w1.get(2) - w2.get(2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<List<Integer>> web = new ArrayList<>(t);
        for(int i = 0; i < t; i++) {
            List<Integer> prism = new ArrayList<>(3);
            prism.add(sc.nextInt());
            prism.add(sc.nextInt());
            prism.add(sc.nextInt());
            web.add(prism);
        }

        Collections.sort(web, new PrismComparator());
        System.out.println();
        for(int i = 0; i < t; i++) {
            System.out.printf("%d %d %d", web.get(i).get(0), web.get(i).get(1), web.get(i).get(2));
            if(i != t - 1) System.out.println();
        }
    }
}
