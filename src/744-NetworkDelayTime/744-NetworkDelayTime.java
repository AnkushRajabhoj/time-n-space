// Last updated: 15/10/2025, 05:58:10
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer,List<int[]>> graph = new HashMap<>();
        for(int[] time: times) {
            graph.computeIfAbsent(time[0], _ -> new ArrayList<int[]>())
                .add(new int[]{time[1],time[2]});
        }


        int distance[] = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        heap.add(new int[]{k, 0});

        while(!heap.isEmpty()) {
            int[] node = heap.remove();
            int currDistance = node[1];
            int currNode = node[0];
            if(!graph.containsKey(currNode)) {
                continue;
            }

            for(int[] neighbor: graph.get(currNode)) {
                
                int nextDistance = currDistance + neighbor[1];
                int nextNode = neighbor[0];
                if (nextDistance < distance[nextNode]) {
                    distance[nextNode] = nextDistance;
                    heap.add(new int[]{nextNode, nextDistance});
                }
            }
        }
        int max = 0;
        for(int i = 1; i < distance.length; i++) {
            max = Math.max(max, distance[i]);
        } 
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}