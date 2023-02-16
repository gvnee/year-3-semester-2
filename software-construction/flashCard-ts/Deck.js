"use strict";
exports.__esModule = true;
exports.Deck = void 0;
var Deck = /** @class */ (function () {
    function Deck(name) {
        this.name = '';
        this.name = name;
    }
    Deck.prototype.greet = function () {
        return "hello " + this.name;
    };
    return Deck;
}());
exports.Deck = Deck;
