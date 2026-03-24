
function showcurrency()
{
    let input=document.getElementById("amount")
    let from=document.getElementById("from")
    let to=document.getElementById("to")
  getcurrency(input.value,from.value,to.value)
}


async function getcurrency(amount,from,to) 
{
const url = `https://currency-converter18.p.rapidapi.com/api/v1/convert?from=${from}&to=${to}&amount=${amount}`;
const options = {
	method: 'GET',
	headers: {
		'x-rapidapi-key': 'a43a7ca423msh19ce3bf26e72a4fp18789djsnf551e0d28852',
		'x-rapidapi-host': 'currency-converter18.p.rapidapi.com',
		'Content-Type': 'application/json'
	}
};

try {
	const response = await fetch(url, options);
	const result = await response.json();
    console.log(result)
	show(result)
} catch (error) {
	console.error(error);
}
}
function show(data) {
    let result = document.getElementById("result");

    // result.innerHTML = `
    //     <div class="card">
    //         <h2>${data.result.convertedAmount}</h2>
    //     </div>
    // `;
   result.innerHTML= data.result.convertedAmount
}