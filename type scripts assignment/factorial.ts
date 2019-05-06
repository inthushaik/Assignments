import * as readline from 'readline';
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  valFromRuntime.question('Please enter a no:', (num) => {
 let fact : number = 1
for(let i=1;i <= Number.parseInt(num.toString());i++)
fact= fact*i;
console.log('factorial:'+fact);
valFromRuntime.close();

});