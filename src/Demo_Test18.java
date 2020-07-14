import java.io.*;

//用IO流模仿试用版软件的次数提示

public class Demo_Test18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("config.txt"));
        String line = br.readLine();
        br.close();
        int times = Integer.parseInt(line);
        if(times > 0){
            System.out.println("您还有"+ times-- + "次机会");
            BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
            bw.write(times+"");
            bw.close();
        }else{
            System.out.println("您的机会已用完，请购买正版！");
        }
    }
}
