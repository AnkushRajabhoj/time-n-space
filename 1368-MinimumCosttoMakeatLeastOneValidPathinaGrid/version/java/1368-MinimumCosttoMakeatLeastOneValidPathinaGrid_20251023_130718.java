// Last updated: 23/10/2025, 13:07:18
class Solution {

    int[][] dirs = new int[][]{
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };
    public int minCost(int[][] grid) {
        int cost[][] = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }
        cost[0][0] = 0;

        //{row,col, cost}
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        heap.add(new int[]{0,0, 0});

        while(!heap.isEmpty()) {
            var node = heap.poll();
            int nodeDir = grid[node[0]][node[1]];
            int nodeCost = node[2];
            
            if(cost[node[0]][node[1]] != nodeCost) continue;

            for(int i = 1; i <= 4; i++) {
                int[] dir = dirs[i-1];
                int r = node[0]+dir[0];
                int c = node[1]+dir[1];

                if (r >= 0 && r <grid.length && c >=0 && c <grid[0].length) {
                    int newCost = nodeCost + ((i == nodeDir) ? 0 : 1);

                    if (newCost < cost[r][c]) {
                        cost[r][c] = newCost;
                        heap.offer(new int[]{r,c, newCost});
                        //System.out.println(r + " "+ c + " " + newCost);
                    }
                }
            }
        }


        return cost[grid.length-1][grid[0].length-1];
    }
}