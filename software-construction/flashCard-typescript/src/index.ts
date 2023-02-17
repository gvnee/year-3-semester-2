import {success, error, print, warning, white}  from "./color"
import * as readline from 'readline'
import Deck from './Deck'

let deck = new Deck()

let r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

  print(white("1. add card"))
  print(white("1. add card"))
  print(white("1. add card"))
  print(white("1. add card"))

  r1.question(white('choose [1-4] '), (answer) => {
    switch (answer.toLowerCase()) {
      case '1':
        deck.addCard('add', 'card')
        break;

      default:
        break;
    }
    r1.close()
  })