const API_KEY = "AIzaSyC5AD3czCGNdXlddOVQw-cNdbZ6dbbIl7I";

async function generateSQL() {
    let input = document.getElementById("input").value;
    let output = document.getElementById("output");

    output.innerText = "Generating...";

    try {
        let response = await fetch(
            `https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=${API_KEY}`,
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    contents: [
                        {
                            parts: [
                                {
                                    text: "Convert this into SQL query only: " + input
                                }
                            ]
                        }
                    ]
                })
            }
        );

        let data = await response.json();
        console.log(data);

        if (!data.candidates) {
            output.innerText = "❌ Error: " + data.error.message;
            return;
        }

        let sql = data.candidates[0].content.parts[0].text;

        output.innerText = sql;

    } catch (error) {
        output.innerText = "❌ Error generating SQL";
        console.error(error);
    }
}