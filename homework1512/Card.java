package homework1512;
//(Создайте класс Card и создайте массив или список, который заполните картами)
public class Card {
    private Rank ranks;
    private Suits suits;

    public Card(Rank ranks, Suits suits) {
        this.ranks = ranks;
        this.suits = suits;
    }

    public Rank getRanks() {

        return ranks;
    }

    public void setRanks(Rank ranks) {

        this.ranks = ranks;
    }

    public Suits getSuits() {

        return suits;
    }

    public void setSuits(Suits suits) {
        this.suits = suits;
    }
    @Override
    public String toString() {
        return ranks + " of " + suits;
    }

}
