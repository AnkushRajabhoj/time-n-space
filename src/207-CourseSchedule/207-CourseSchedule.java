// Last updated: 15/10/2025, 05:59:30
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] inDegree = new int[numCourses];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        for(int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }

        for(int[] prerequisite: prerequisites) {
            inDegree[prerequisite[0]]++;
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) {
                queue.addLast(i);
            }
        }

        while(!queue.isEmpty()) {
            int node = queue.removeLast();
            numCourses--;

            for(int neighbor: graph.get(node)) {
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0) {
                    queue.addLast(neighbor);
                }
            }
        }

        return numCourses == 0;
        
    }
}