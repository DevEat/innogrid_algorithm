// var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

var input = '1 1 1';

const E = input.split(' ')[0];
const S = input.split(' ')[1];
const M = input.split(' ')[2];

var ans = (E * 6916 + S * 4845 + M * 4200) % 7980;

console.log((ans != 0)? ans : 7980);