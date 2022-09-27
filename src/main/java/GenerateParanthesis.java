import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String args[]){
        List<String> all = new ArrayList<>();
        GenerateParanthesis g= new GenerateParanthesis();
        g.createAllParanthesis("(",1,0,3,all);
        System.out.println(all);
    }

    public void createAllParanthesis(String p, int o, int c, int total, List<String> all){
        if(p.length()==2*total){
            all.add(p);
            return;
        }
        if(o<total) createAllParanthesis(p+"(",o+1,c,total,all);
        if(c<o) createAllParanthesis(p+")",o,c+1,total,all);
    }

}
