import { success, error, print, warning, white } from "./color"
import * as readline from 'readline'
import Deck from './Deck'
import inquirer from "inquirer"

const choices = Array.apply(0, new Array(26)).map((x, y) => String.fromCharCode(y + 65));

inquirer
  .prompt([
    {
      type: 'list',
      loop: false,
      name: 'letter',
      message: "What's your favorite letter?",
      choices,
    },
  ])
  .then((answers) => {
    console.log(JSON.stringify(answers, null, '  '));
  });

// let deck = new Deck()
// function getInput(query: string) {
//   const r1 = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
//   })
//   return new Promise(resolve => r1.question(query, ans => {
//     r1.close()
//     resolve(ans)
//   }))
// }

// print(white("1. add card"))
// print(white("2. edit card"))
// print(white("3. remove card"))
// print(white("4. see cards"))
// print(white("5. exit"))

// const answer = getInput("choose 1-5");

// print(answer)

// switch (answer) {
//   case '1':
//     deck.addCard('add', 'card')
//     break
//   case '2':
//     break
//   case '3':
//     break
//   case '4':
//     break
//   case '5':
//     break
//   default:
//     break;
// }
