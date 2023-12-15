package homework1512;
//Игра пасьянс :
//        Создать колоду карт и наполнить ее картами.
//        (Создайте класс Card и создайте массив или список, который заполните картами)
//        Написать приложение которое будет при запуске перемешивать колоду карт.
//        И раскладывать ее в стопку - если в стопке две карты одной масти ложатся друг на друга, то их убираем из стопки.
//        В конце написать результат и вывести карты в стопке.
//        Пасьянс сошелся если осталось по 1 карте каждой масти (число карт каждой масти нечетное).

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SolitaireApp {
    public static void main(String[] args) {
        List<Card> cards = createDeck(5); //список, который заполните картами//  sozdaju kolodu 5*14
        shuffleDeck(cards); // peremewivaju kolodu


        Stack<Card> stack = new Stack<>();
        for (Card card : cards) { //pri pomowi cikla foreach pereberaju karti v spiske cards
            if (stack.isEmpty()) { //!stack.empty())-budet rabotatj poka est v stack elementi poka on ne pustoj
                stack.push(card); //push- prosto sverxu ondix elementov dobovlaet
                continue;
            }
            Card topCard = stack.peek(); //peek - pozvoljaet posmotretj element kot. lezit na verwine stack, no ne izvlekatj ego
            if (topCard.getSuits().equals(card.getSuits())) {
                stack.pop(); // pop - get element from stack and remove element from stack , t.e. ubiraju parnie karti iz odnoj stopki
            } else {
                stack.push(card); //push- prosto sverxu ondix elementov dobovlaet
            }
        }
        System.out.println("Remaining cards in the stack:");
        for (Card card : stack) { // cickle foreach
            System.out.println(card);
        }
        System.out.println("Solitaire status: " + isSolitaireComplete(stack)); //vivod posle sortirovki
    }

    private static List<Card> createDeck(int numDecks) { // 5 suits * 14 Cards
        List<Card> cards = new ArrayList<>(); // sozdaju novij spisok cards
        for (Suits suit : Suits.values()) { // cikle foreach dlja perebora vsex enum Suits
            for (Rank rank : Rank.values()) { //cikle foreach dlja perebora vsex enum Rank
                cards.add(new Card(rank, suit)); // sodaet novij object
            }
        }
        return cards; // vozvrawaju sozdannij spisok kart
    }

    private static void shuffleDeck(List<Card> cards) { // peremewannaja koloda
        Collections.shuffle(cards);
    }

    private static boolean isSolitaireComplete(Stack<Card> stack) {  //Пасьянс сошелся если осталось по 1 карте каждой масти (число карт каждой масти нечетное).
        List<Integer> suitCount = new ArrayList<>(Collections.nCopies(Suits.values().length, 0)); // xranju tut kol-vo kart dlja kazdoj masti
        //Collections.nCopies(Suits.values().length - nCopies - neizmen spisok -opredel kol-vo enum Suits

        for (Card card : stack) {
            int suitIndex = card.getSuits().ordinal();
            suitCount.set(suitIndex, suitCount.get(suitIndex) + 1);
        }

        for (int count : suitCount) {
            //proverjaju javl. li znacheni masti nechetnim.
             if (count % 2 != 1) { // count % 2 - vicislaju ostatok ot delenija , != 1 - ostatok ot delenija ne = 0
                return false;
            }
        }
        return true;
    }
}
        // Пасьянс сошелся, если осталась по 1 карте каждой масти (число карт каждой масти нечетное)
//        int trumpCount = 0, diamondsCount = 0, heartsCount = 0, clubsCount = 0, spadesCount = 0;
//
//        for (Card card : stack) {
//            switch (card.getSuits()) {
//                case TRUMP:
//                    trumpCount++;
//                    break;
//                case DIAMONDS:
//                    diamondsCount++;
//                    break;
//                case HEARTS:
//                    heartsCount++;
//                    break;
//
//                case CLUBS:
//                    clubsCount++;
//                    break;
//                case SPADES:
//                    spadesCount++;
//                    break;
//            }
//        }
//
//        return trumpCount % 2 == 1 && diamondsCount % 2 == 1 && heartsCount % 2 == 1 && clubsCount % 2 == 1 && spadesCount % 2 == 1;



