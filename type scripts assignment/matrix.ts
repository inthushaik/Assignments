let matrix: number[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];

function printDiagonal(matrix: number[][])	{

	for(let r=0; r<matrix.length; ++r)	{
let j:number;
		for(let i=r, j=0; j<matrix.length && i>=0; i--, j++)	{

				console.log(`Matrix Diagonal ${matrix[i][j]}`);

		}

	}

}

printDiagonal(matrix);