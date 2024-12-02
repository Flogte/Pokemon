public class PokemonFeu extends Pokemon {

    public PokemonFeu(String nom, Integer hp, Integer atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof PokemonFeu) {
            p.setHp(p.getHp() - this.getAtk() / 2);
        } else if (p instanceof PokemonEau) {
            p.setHp(p.getHp() - this.getAtk() / 2);
        } else if (p instanceof PokemonPlante) {
            p.setHp(p.getHp() - this.getAtk() * 2);
        }

    }
}
