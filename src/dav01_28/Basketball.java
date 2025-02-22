package dav01_28;

public class Basketball {
    private String name;
    private String lastName;
    private int pts;
    private int block;
    private int assist;
    private int lost;
    Basketball(String name, String lastName,int pts,int block,int assist,int lost){
        this.name=name;
        this.lastName=lastName;
        this.pts=pts;
        this.block=block;
        this.assist=assist;
        this.lost=lost;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getPts(){
        return pts;
    }
    public void setPts(int pts){
        this.pts=pts;
    }
    public int getBlock(){
        return block;
    }
    public void setBlock(int block){
        this.block=block;
    }
    public int getAssist(){
        return assist;
    }
    public void setAssist(int assist){
        this.assist=assist;
    }
    public int getLost(){
            return lost;
    }
    public void setLost(int lost){
        this.lost=lost;
    }

    public double countRating(){
        return pts+block+(1.5 * assist) + (-2 * lost);
    }

    @Override
    public String toString() {
        return name+","+lastName+","+ pts+","+ block+","+ assist+","+ lost;
    }
}






