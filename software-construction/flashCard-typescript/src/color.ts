import chalk from 'chalk'

const error = chalk.bold.red
const warning = chalk.bold.hex('FFA500')
const success = chalk.bold.green
const white = chalk.bold.white

const print = console.log

export { error, warning, success, white, print }