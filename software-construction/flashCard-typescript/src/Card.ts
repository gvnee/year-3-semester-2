export default class Card {

  private front: string
  private back: string

  constructor(front: string, back: string) {
    this.front = front
    this.back = back
  }
  
  get getFront(){
    return this.front
  }
  get getBack(){
    return this.back
  }
}