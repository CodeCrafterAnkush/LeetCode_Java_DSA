class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        Stack<String> stack = new Stack<>();
            stack.push(folder[0]);
        for(int i=1;i<folder.length;i++){
            String s1 = stack.peek();
            String s2 =folder[i];
            int min = Math.min(s1.length(),s2.length());
            String s3 = s2.substring(0,min);
            // System.out.println(s3);
            // if(folder[i].length()>s1.length()&&folder[i].charAt(s1.length())!='/') continue;
            // if(!s2.startsWith(s1+'/')){
            //     stack.push(folder[i]);
            // }
              if(!s1.equals(s3) || folder[i].length()>s1.length()&&folder[i].charAt(s1.length())!='/'){
                stack.push(folder[i]);
            }
            

        }
        List<String> ansList = new ArrayList<>();
        for(String str : stack){
            ansList.add(str);
        }
        return ansList;
    }
}