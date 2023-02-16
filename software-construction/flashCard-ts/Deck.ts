
class Deck {
  name: string = ''
  constructor(name: string) {
    this.name = name
  }
  greet(){
    return "hello " + this.name
  }
}

export {Deck}