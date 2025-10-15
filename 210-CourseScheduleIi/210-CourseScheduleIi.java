// Last updated: 15/10/2025, 05:59:28
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] prerequisite: prerequisites) {
            adj.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.addLast(i);
            }
        }

        int[] result = new int[numCourses];
        int visisted = 0;

        while(!queue.isEmpty()) {
            int course = queue.removeFirst();
            result[visisted++] = course;
            for(int dependentCourse : adj.get(course)) {
                indegree[dependentCourse]--;
                if (indegree[dependentCourse] == 0) {
                    queue.addLast(dependentCourse);
                }
            }
        }
        return visisted == numCourses ? result : new int[]{} ;
        
    }
}