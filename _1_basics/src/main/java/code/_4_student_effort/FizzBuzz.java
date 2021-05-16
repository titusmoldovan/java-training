package code._4_student_effort;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static final int nrOfElements = 100;
    public static void fizzBuzzStage1(){
        List<LinkBetweenNrAndWord> links = new ArrayList<>();
        links.add(new LinkBetweenNrAndWord(3, "Fizz"));
        links.add(new LinkBetweenNrAndWord(5, "Buzz"));
        StringBuilder sb = new StringBuilder();
        boolean linkFound = false;
        for(int i=1;i<=nrOfElements;i++){
            for(LinkBetweenNrAndWord l : links){
                if(i%l.nr==0){
                    sb.append(l.word);
                    linkFound = true;
                }
            }
            if(!linkFound){
                sb.append(i);
            }
            sb.append(", ");
            linkFound = false;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    public static void fizzBuzzStage2(){
        List<LinkBetweenNrAndWord> links = new ArrayList<>();
        links.add(new LinkBetweenNrAndWord(3, "Fizz"));
        links.add(new LinkBetweenNrAndWord(5, "Buzz"));
        links.add(new LinkBetweenNrAndWord(7, "Rizz"));
        links.add(new LinkBetweenNrAndWord(11, "Jazz"));
        StringBuilder sb = new StringBuilder();
        boolean linkFound = false;
        for(int i=1;i<=nrOfElements;i++){
            for(LinkBetweenNrAndWord l : links){
                if(i%l.nr==0){
                    sb.append(l.word);
                    linkFound = true;
                }
            }
            if(!linkFound){
                sb.append(i);
            }
            sb.append(", ");
            linkFound = false;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    public static class LinkBetweenNrAndWord{
        private int nr;
        private String word;
        public LinkBetweenNrAndWord(int nr,String word){
            this.nr = nr;
            this.word = word;
        }
    }
}
