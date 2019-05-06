import * as readline from 'readline';

let runtimeVal = readline.createInterface({

	input: process.stdin,

	output: process.stdout

});


runtimeVal.question("Enter string to count all vowels repeatition: ",

	(answer)=>	{

		let count_a: number = 0;

		let count_e: number = 0;

		let count_i: number = 0;

		let count_o: number = 0;

		let count_u: number = 0;

		for(let i: number=0; i<answer.length; ++i)	{

			if(answer[i] == 'a' || answer[i] == 'A')	++count_a;

			else if(answer[i] == 'e' || answer[i] == 'E')	++count_e;

			else if(answer[i] == 'i' || answer[i] == 'I')	++count_i;

			else if(answer[i] == 'o' || answer[i] == 'O')	++count_o;

			else if(answer[i] == 'u' || answer[i] == 'U')	++count_u;

		}

		console.log(`
a occured: ${count_a} times.
e occured: ${count_e} times.
i occured: ${count_i} times.
o occured: ${count_o} times.
u occured: ${count_u} times.
`);

		runtimeVal.close();

	}

);