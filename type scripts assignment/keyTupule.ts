var tuple = {

	"user_1": "Amit",

	"user_2": "dhruv",

	"user_3": "shiv"

}
function findInTuple(val: string): string	{

	for(var i in tuple)	{

		if(i == val)	{

			return `${i}: ${tuple[i]}`;

		}
	else

 return "Nothing is found!";
    }

}

console.log(findInTuple("user_5"));
//console.log(findInTuple("user_5"));