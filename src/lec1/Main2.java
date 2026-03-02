package lec1;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Map<Integer, List<Integer>> map = new HashMap<>();

        String pairsLine = scanner.nextLine();
        String[] pairs = pairsLine.split(" ");

        for (String pair : pairs) {
            String[] parts = pair.split(":");
            
            if (parts.length != 2) {
                System.out.println("Invalid input format.");
                return;
            }
            
            try {
                int id = Integer.parseInt(parts[0]);
                int rating = Integer.parseInt(parts[1]);
                
                if (!map.containsKey(id)) {
                    map.put(id, new ArrayList<>());
                }
                map.get(id).add(rating);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format: " + e.getMessage());
                return;
            }
        }

        int maxGems = getMaxGems(map);
        int minGems = getMinGems(map);

        int result = Math.max(maxGems, minGems);
        System.out.println(result);
    }

    static int getMaxGems(Map<Integer, List<Integer>> map) {
        int maxGems = 0;

        for (List<Integer> ratings : map.values()) {
            int sum = 0;
            for (int rating : ratings) {
                sum += rating;
            }
            maxGems = Math.max(maxGems, sum);
        }

        return maxGems;
    }

    static int getMinGems(Map<Integer, List<Integer>> map) {
        int minGems = 0;

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (int key : keys) {
            List<Integer> ratings = map.get(key);
            int sum = 0;
            for (int rating : ratings) {
                sum += rating;
            }
            minGems += sum;
        }

        return minGems;
    }
}
