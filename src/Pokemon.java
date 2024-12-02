public class Pokemon {
    protected String nom;
    protected Integer hp;
    protected Integer atk;

    public Pokemon(String nom, Integer hp, Integer atk) {
        this.nom = nom;
        hp = hp;
        atk = atk;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        atk = atk;
    }

    public boolean isDead(){
        if (hp <= 0){
            return true;
        }
        return false;
    }

    public void attaquer(Pokemon p){
       //p.hp=p.hp-this.atk; on peut aussi l'écriure comme ci-desous//
        p.setHp(p.getHp()-this.getAtk());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", Hp=" + hp +
                ", Atk=" + atk +
                '}';
    }
}
