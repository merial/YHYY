package simulaattori;

public class Makuuhuone {

    private Ihminen hp;

    
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
        return "Olet nyt sängyssä nukkumassa. Sait +10 hp. Nyt sinulla on "+hp.getHp()+"hp.";
    }
    public String exitMakuuhuone(){
        hp.vähennä(10);
        return null;
    }
    
    
    
}
