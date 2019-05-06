import * as readline from 'readline';
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  valFromRuntime.question('Please enter a no:', (num) => {
    var n: number = parseInt(num);
    var sum: number = 0 ;
    var rem: number;
    while(n!=0)
    {
     rem = n % 10;
     sum = sum + rem;
     n = Math.floor(n/10);
    }
  console.log(`sum of digit is: ${sum}`);
  valFromRuntime.close();
});