class Solution {
    public int compareVersion(String version1, String version2) {
        String arrV1[]=version1.split("\\.");
        String arrV2[]=version2.split("\\.");

        int length = Math.max(arrV1.length,arrV2.length);

        for(int i=0;i<length;i++){
            int v1 =i<arrV1.length?Integer.parseInt(arrV1[i]):0;
            int v2 =i<arrV2.length?Integer.parseInt(arrV2[i]):0;
            if(v1<v2)return -1;
            if(v1>v2)return 1;
        }

        return 0;
    }
}