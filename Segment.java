public class Segment {
    private  int ext1;
    private  int ext2;

    public Segment(int ext1, int ext2) {
        this.ext1 = ext1;
        this.ext2 = ext2;
    }
    public int longueur(){
        return Math.abs(ext1-ext2);
    }
    public boolean appartient(int point){
        return (point >= Main.min(ext1,ext2))&& (point <= Main.max(ext1,ext2));

    }

}
