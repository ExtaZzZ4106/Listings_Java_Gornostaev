package Listing_3;

class PBR{
    int x,y;
    PBR(int x,int y){
        this.x=x;
        this.y=y;
    }
    void CBR(PBR o){
        o.x=o.x+this.x;
        o.y=o.y+this.y;
    }
}
class PBRD{
    public static void main(String[]args){
        PBR p = new PBR(2,3);
        PBR q = new PBR(3,2);

        System.out.println("q.x = "+q.x);
        System.out.println("q.y = "+q.y);

        p.CBR(q);

        System.out.println("q.x = "+q.x);
        System.out.println("q.y = "+q.y);
    }
}