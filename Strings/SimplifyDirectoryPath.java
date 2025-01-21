package Strings;

public class SimplifyDirectoryPath {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        String simplifiedPath = "";
        char begin = '/';
        
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(0) == begin)
                simplifiedPath += simplifiedPath.charAt(0);
            if(path.charAt(i)!='.'&&path.charAt(i)!='. .'&&path.charAt(i!='//')){}
        }
    }
}
