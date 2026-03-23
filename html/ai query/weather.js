function showWeather() {
    let input = document.getElementById("input");
    getweather(input.value);
}

async function getweather(city) {
    const url = `https://open-weather13.p.rapidapi.com/city?city=${city}&lang=EN`;

    const options = {
        method: 'GET',
        headers: {
          	'x-rapidapi-key': 'a43a7ca423msh19ce3bf26e72a4fp18789djsnf551e0d28852',
		'x-rapidapi-host': 'open-weather13.p.rapidapi.com',
		'Content-Type': 'application/json'
        }
    };

    try {
        const response = await fetch(url, options);
        const result = await response.json();

        show(result);
    } catch (error) {
        console.error(error);
    }
}

function show(data) {
    let container = document.getElementById("container");

    container.innerHTML = `
        <div class="card">
            <h2>${data.name}</h2>
            <h1>${data.main.temp}°C</h1>
            <p>${data.weather[0].description}</p>
        </div>
    `;
}