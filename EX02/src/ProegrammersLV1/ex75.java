package ProegrammersLV1;
import java.util.Arrays;

public class ex75 {
    public static void main(String[] args) {
        String[]wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution(wallpaper)));
    }

    private static int[] solution(String[] wallpaper) {
        String[] arr = new String[wallpaper[0].length()*wallpaper.length];
        String[] list = new String[2];
        int[] answer = new int[4];
        int lux = 51;
        int luy = 51;
        int rdx = 0;
        int rdy = 0;
        int cnt = 0;
        for (int i=0; i<wallpaper.length; i++){
            for (int j=0; j<wallpaper[0].length(); j++){
                if (wallpaper[i].charAt(j)=='#'){
                    arr[cnt]=i+","+j;
                    cnt++;
                }
                String arrList = arr[i];
            }
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=null){
                list = arr[i].split(",");
            }
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);
            lux = Math.min(lux,a);
            luy = Math.min(luy,b);
            rdx = Math.max(rdx,a);
            rdy = Math.max(rdy,b);
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx+1;
        answer[3] = rdy+1;
        return answer;
    }
}
