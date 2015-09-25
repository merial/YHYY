package simulaattori;

public class Makuuhuone {

    private Ihminen hp;
    private Syöpä tauti;
    
    public Makuuhuone(){        
    }
    
    public Makuuhuone (Ihminen hp){
        this.hp = hp;
    }
    
    public String enterMakuuhuone(){
        return "Olet nyt makuuhuoneessa. Voit mennä sänkyyn nukkumaan "
                + "tai mennä takaisin käytävään.";
    }
    public String gotoSänky(){
        hp.lisää(10);
        return "Olet nyt sängyssä nukkumassa.";
    }
    public String exitMakuuhuone(){
        hp.vähennä(10);
        tauti.syöpäännytkö();
        return " ";
    }
    
}
