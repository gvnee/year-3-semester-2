import Card from './Card'

export default class Deck {
  private cards: Card[] = []

  addCard(front: string, back: string){
    this.cards.push(new Card(front, back))
  }
}